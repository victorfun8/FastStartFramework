package net.hs.ito.common.net;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import net.hs.ito.common.net.data.Result;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.SocketTimeoutException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created on 2018/4/22
 * Title:
 * Description:
 * author 张康
 * update 2018/4/22
 */
public abstract class BaseListCallback<T> implements Callback<Result> {
    @Override
    public void onResponse(Call<Result> call, Response<Result> response) {
        if (response.isSuccessful()) {
            Result result = response.body();
            if (result.getCode() == 0) {
                String data = result.getData();
                if ("{}".equals(data)) {
                    onEmptyData(result.getMsg());
                }else {
                    Gson gson = NetRequestUtil.getGson();
                    Type type = new ParameterizedTypeImpl(getGsonClass());
                    List<T> tList = gson.fromJson(data, type);
                    onSuccess(tList);
                }
            } else {
                onFailure(result.getMsg());
            }
        } else {
            onFailure(response.errorBody().toString());
        }
    }

    @Override
    public void onFailure(Call<Result> call, Throwable t) {
        if (t instanceof SocketTimeoutException) {
            onFailure("连接超时，请重试");
        } else {
            onFailure("");
        }
    }

    protected abstract void onSuccess(List<T> t);

    protected abstract void onFailure(String failMessage);

    protected abstract void onEmptyData(String emptyMsg);

    protected abstract Class<T> getGsonClass();

    private class ParameterizedTypeImpl implements ParameterizedType {
        Class clazz;

        public ParameterizedTypeImpl(Class clz) {
            clazz = clz;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[]{clazz};
        }

        @Override
        public Type getRawType() {
            return List.class;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }

}
