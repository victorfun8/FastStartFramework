package net.hs.ito.common.net;

import com.google.gson.Gson;

import net.hs.ito.common.net.data.Result;

import java.net.SocketTimeoutException;

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
public abstract class BaseCallback<T> implements Callback<Result> {
    @Override
    public void onResponse(Call<Result> call, Response<Result> response) {
        if (response.isSuccessful()) {
            Result result = response.body();
            if (result.getCode() == 0) {
                Gson gson = NetRequestUtil.getGson();
                T t = gson.fromJson(result.getData(), getGsonClass());
                onSuccess(t);
            } else {
                onFailure(result.getMsg());
            }
        } else {
            onFailure(response.message());
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

    protected abstract void onSuccess(T t);

    protected abstract void onFailure(String failMessage);

    protected abstract Class<T> getGsonClass();
}
