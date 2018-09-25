package net.hs.ito.common.net.service;

import net.hs.ito.common.net.data.Result;
import net.hs.ito.common.net.data.UserLoginForm;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by fangji on 2018/4/2.
 */
public interface UserService {
    @GET("htfserver/user/getVersion")
    /**
     * 获取app最新版本
     *
     * @return android最新版本code，android最低支持的版本code，android最新版本下载地址
     */
    Call<Result> getVersion();

    @Headers("Content-Type:application/json")
    @POST("htfserver/user/userLogin")
    /**
     * 客户登录
     *
     * @param userName
     *            资产账号
     * @param password
     *            密码
     * @return 客户姓名
     */
    Call<Result> userLogin(@Body UserLoginForm userLoginForm);

    @GET("htfserver/user/userRegister")
    /**
     * 客户注册
     *
     * @param operatorNo
     *            经纪商编号
     * @param telephone
     *            手机号
     * @param clientName
     *            客户姓名
     * @return 资产账号, 密码
     */
    Call<Result> userRegister(@Query("operatorNo") String operatorNo, @Query("telephone") String telephone,
                              @Query("clientName") String clientName, @Query("verifyCode") String verifyCode);

    @GET("htfserver/user/userForgetPassword")
    /**
     * 忘记密码
     *
     * @param telephone
     *            手机号
     * @return 密码
     */
    Call<Result> userForgetPassword(@Query("telephone") String telephone);

    @GET("htfserver/user/userGetPosition")
    /**
     * 持仓查询
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 合约代码, 手数, 买卖方向, 均价, 最新价, 盈亏
     */
    Call<Result> userGetPosition(@Query("fundAccount") String fundAccount, @Query("password") String password);

    @GET("htfserver/user/userGetFund")
    /**
     * 基币资金查询
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 持仓盈亏, 权益, 持仓保证金, 可用
     */
    Call<Result> userGetFund(@Query("fundAccount") String fundAccount, @Query("password") String password);

    @GET("htfserver/user/userGetExchange")
    /**
     * 交易所获取
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 交易所, 中文名
     */
    Call<Result> userGetExchange(@Query("fundAccount") String fundAccount, @Query("password") String password);

    @GET("htfserver/user/userGetCommodity")
    /**
     * 商品获取
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @param futuExchType
     *            交易所
     * @return 交易所, 商品, 商品名称
     */
    Call<Result> userGetCommodity(@Query("fundAccount") String fundAccount, @Query("password") String password,
                                  @Query("futuExchType") String futuExchType);

    @GET("htfserver/user/userGetContract")
    /**
     * 合约获取
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @param futuExchType
     *            交易所
     * @param commodityType
     *            商品
     * @return 交易所, 商品, 合约代码
     */
    Call<Result> userGetContract(@Query("fundAccount") String fundAccount, @Query("password") String password,
                                 @Query("futuExchType") String futuExchType, @Query("commodityType") String commodityType);

    @GET("htfserver/user/userGetQuota")
    /**
     * 行情获取
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @param contractCode
     *            合约代码:交易所.商品.合约
     * @return
     */
    Call<Result> userGetQuota(@Query("fundAccount") String fundAccount, @Query("password") String password,
                              @Query("contractCode") String contractCode);

    @GET("htfserver/user/userEntrustOrder")
    /**
     * 委托下单
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @param contractCode
     *            合约代码:交易所.商品.合约
     * @param entrustBs
     *            买卖方向:1:买入;2:卖出
     * @param entrustAmount
     *            委托手数
     * @param entrustPrice
     *            委托价格
     * @return 委托编号
     */
    Call<Result> userEntrustOrder(@Query("fundAccount") String fundAccount, @Query("password") String password,
                                  @Query("contractCode") String contractCode, @Query("entrustBs") String entrustBs,
                                  @Query("entrustAmount") String entrustAmount, @Query("entrustPrice") String entrustPrice,
                                  @Query("station") String station);

    @GET("htfserver/user/userGetOrder")
    /**
     * 委托查询
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 合约代码:交易所.商品.合约代码, 买卖方向, 委托价格, 手数, 委托状态, 交易日期
     */
    Call<Result> userGetOrder(@Query("fundAccount") String fundAccount, @Query("password") String password);

    @GET("htfserver/user/userGetTrade")
    /**
     * 成交查询
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 合约代码:交易所.商品.合约代码, 买卖方向, 成交价格, 手数
     */
    Call<Result> userGetTrade(@Query("fundAccount") String fundAccount, @Query("password") String password);

    @GET("htfserver/user/userEntrustCancel")
    /**
     * 委托撤单
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @param entrustNo
     *            委托编号
     * @param initDate
     *            交易日期
     * @return 委托编号
     */
    Call<Result> userEntrustCancel(@Query("fundAccount") String fundAccount, @Query("password") String password,
                                   @Query("entrustNo") String entrustNo, @Query("initDate") String initDate);

    @GET("htfserver/user/userChangePassword")
    /**
     * 客户改密
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            旧密码
     * @param newPassword
     *            新密码
     * @return 新密码
     */
    Call<Result> userChangePassword(@Query("fundAccount") String fundAccount, @Query("password") String password,
                                    @Query("newPassword") String newPassword);

    @GET("htfserver/user/userLogout")
    /**
     * 客户改密
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 成功
     */
    Call<Result> userLogout(@Query("fundAccount") String fundAccount, @Query("password") String password);

    @GET("htfserver/user/userGetCanCancelOrder")
    /**
     * 获取挂单列表
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 成功
     */
    Call<Result> userGetCanCancelOrder(@Query("fundAccount") String fundAccount, @Query("password") String password);

    @GET("htfserver/user/userSendSMS")
    /**
     * 客户改密
     *
     * @param fundAccount
     *            资产账号
     * @param password
     *            密码
     * @return 成功
     */
    Call<Result> userSendSMS(@Query("telephone") String telephone, @Query("smsType") String smsType);
}
