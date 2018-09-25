package net.hs.ito.common.net;

import android.content.Context;
import android.util.Log;

import com.google.gson.Gson;


import net.hs.ito.common.net.data.Result;
import net.hs.ito.common.net.data.UserChangePasswordForm;
import net.hs.ito.common.net.data.UserEntrustCancelForm;
import net.hs.ito.common.net.data.UserEntrustOrderForm;
import net.hs.ito.common.net.data.UserForgetPasswordForm;
import net.hs.ito.common.net.data.UserGetCanCancelOrderForm;
import net.hs.ito.common.net.data.UserGetCommodityForm;
import net.hs.ito.common.net.data.UserGetContractForm;
import net.hs.ito.common.net.data.UserGetExchangeForm;
import net.hs.ito.common.net.data.UserGetFundForm;
import net.hs.ito.common.net.data.UserGetOrderForm;
import net.hs.ito.common.net.data.UserGetPositionForm;
import net.hs.ito.common.net.data.UserGetQuotaForm;
import net.hs.ito.common.net.data.UserGetTradeForm;
import net.hs.ito.common.net.data.UserLoginForm;
import net.hs.ito.common.net.data.UserLogoutForm;
import net.hs.ito.common.net.data.UserRegisterForm;
import net.hs.ito.common.net.data.UserSendSMSForm;
import net.hs.ito.common.net.service.UserService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by fangji on 2018/4/2.
 */

public class NetRequestUtil {
    private static final String URL_TEST = "http://47.97.126.117:80/";
    private static final String URL_TEST_1 = "http://47.97.126.117:8080/";
    private static final String URL_DEBUG = "http://47.98.43.117:8080/";

    private static class NetRequestUtilHolder {
        static final NetRequestUtil HOLDER = new NetRequestUtil();
    }

    private Retrofit retrofit;
    private Gson mGson;

    private NetRequestUtil() {
        retrofit = new Retrofit.Builder()
                .baseUrl(URL_TEST)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

    }

    public static NetRequestUtil getInstance() {
        return NetRequestUtilHolder.HOLDER;
    }

    public static Gson getGson() {
        if (null == getInstance().mGson) {
            getInstance().mGson = new Gson();
        }
        return getInstance().mGson;
    }

    public void getVersion(Callback<Result> callback) {
        Log.e("userLogin", "userLogin request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.getVersion();
        call.enqueue(callback);
    }

    public void userLogin(Context context, UserLoginForm userLoginForm, Callback<Result> callback) {
        Log.e("userLogin", "userLogin request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userLogin(userLoginForm);
        call.enqueue(callback);
    }

    public void userForgetPassword(UserForgetPasswordForm userForgetPasswordForm, Callback<Result> callback) {
        Log.e("userRegister", "userRegister request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userForgetPassword(userForgetPasswordForm.getTelephone());
        call.enqueue(callback);
    }

    public void userRegister(UserRegisterForm userRegisterForm, Callback<Result> callback) {
        Log.e("userRegister", "userRegister request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userRegister(userRegisterForm.getOperatorNo(),
                userRegisterForm.getTelephone(), userRegisterForm.getClientName(), userRegisterForm.getVerifyCode());
        call.enqueue(callback);
    }

    public void userGetPosition(UserGetPositionForm userGetPositionForm, Callback<Result> callback) {
        Log.e("userGetPosition", "userGetPosition request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetPosition(userGetPositionForm.getFund_account(), userGetPositionForm.getPassword());
        call.enqueue(callback);
    }

    public void userGetFund(UserGetFundForm userGetFundForm, Callback<Result> callback) {
        Log.e("userGetFund", "userGetFund request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetFund(userGetFundForm.getFund_account(), userGetFundForm.getPassword());
        call.enqueue(callback);
    }

    public void userGetExchange(UserGetExchangeForm userGetExchangeForm, Callback<Result> callback) {
        Log.e("userGetExchange", "userGetExchange request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetExchange(userGetExchangeForm.getFund_account(), userGetExchangeForm.getPassword());
        call.enqueue(callback);
    }

    public void userGetCommodity(UserGetCommodityForm userGetCommodityForm, Callback<Result> callback) {
        Log.e("userGetCommodity", "userGetCommodity request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetCommodity(userGetCommodityForm.getFund_account(), userGetCommodityForm.getPassword(),
                userGetCommodityForm.getFutuExchType());
        call.enqueue(callback);
    }

    public void userGetContract(UserGetContractForm userGetContractForm, Callback<Result> callback) {
        Log.e("userGetContract", "userGetContract request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetContract(userGetContractForm.getFund_account(), userGetContractForm.getPassword(),
                userGetContractForm.getFutuExchType(), userGetContractForm.getCommodityType());
        call.enqueue(callback);
    }

    public void userGetQuota(UserGetQuotaForm userGetQuotaForm, Callback<Result> callback) {
        Log.e("userGetQuota", "userGetQuota request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetQuota(userGetQuotaForm.getFund_account(), userGetQuotaForm.getPassword(),
                userGetQuotaForm.getContractCode());
        call.enqueue(callback);
    }

    public void userEntrustOrder(UserEntrustOrderForm userEntrustOrderForm, Callback<Result> callback) {
        Log.e("userEntrustOrder", "userEntrustOrder request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userEntrustOrder(userEntrustOrderForm.getFund_account(), userEntrustOrderForm.getPassword(),
                userEntrustOrderForm.getContractCode(), userEntrustOrderForm.getEntrustBs(), userEntrustOrderForm.getEntrustAmount(),
                userEntrustOrderForm.getEntrustPrice(), userEntrustOrderForm.getOp_station());
        call.enqueue(callback);
    }

    public void userGetOrder(UserGetOrderForm userGetOrderForm, Callback<Result> callback) {
        Log.e("userGetOrder", "userGetOrder request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetOrder(userGetOrderForm.getFund_account(), userGetOrderForm.getPassword());
        call.enqueue(callback);
    }

    public void userGetTrade(UserGetTradeForm userGetTradeForm, Callback<Result> callback) {
        Log.e("userGetTrade", "userGetTrade request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetTrade(userGetTradeForm.getFund_account(), userGetTradeForm.getPassword());
        call.enqueue(callback);
    }

    public void userEntrustCancel(UserEntrustCancelForm userEntrustCancelForm, Callback<Result> callback) {
        Log.e("userEntrustCancel", "userEntrustCancel request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userEntrustCancel(userEntrustCancelForm.getFund_account(), userEntrustCancelForm.getPassword(),
                userEntrustCancelForm.getEntrustNo(), userEntrustCancelForm.getInitDate());
        call.enqueue(callback);
    }

    public void userChangePassword(UserChangePasswordForm userChangePasswordForm, Callback<Result> callback) {
        Log.e("userChangePassword", "userChangePassword request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userChangePassword(userChangePasswordForm.getFund_account(), userChangePasswordForm.getPassword(),
                userChangePasswordForm.getNewPassword());
        call.enqueue(callback);
    }

    public void userLogout(UserLogoutForm userLogoutForm, Callback<Result> callback) {
        Log.e("userLoginOut", "userLoginOut request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userLogout(userLogoutForm.getFund_account(), userLogoutForm.getPassword());
        call.enqueue(callback);
    }

    public void userGetCanCancelOrder(UserGetCanCancelOrderForm userGetCanCancelOrderForm, Callback<Result> callback) {
        Log.e("userLoginOut", "userLoginOut request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userGetCanCancelOrder(userGetCanCancelOrderForm.getFund_account(), userGetCanCancelOrderForm.getPassword());
        call.enqueue(callback);
    }

    public void userSendSMS(UserSendSMSForm userSendSMSForm, Callback<Result> callback) {
        Log.e("userSendSMS", "userSendSMS request started.");
        UserService userService = retrofit.create(UserService.class);
        Call<Result> call = userService.userSendSMS(userSendSMSForm.getTelephone(), userSendSMSForm.getSmsType());
        call.enqueue(callback);
    }
}
