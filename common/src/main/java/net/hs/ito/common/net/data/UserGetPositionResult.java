package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserGetPositionResult {
    //买卖方向 1 买入 2卖出
    @SerializedName("entrust_bs")
    String entrust_bs;
    //盈亏
    @SerializedName("profit_and_loss")
    String profit_and_loss;
    //手数
    @SerializedName("business_amount")
    String business_amount;
    //均价
    @SerializedName("average_price")
    String average_price;
    //最新价
    @SerializedName("futu_last_price")
    String futu_last_price;
    //合约代码, 手数, 买卖方向, 均价, 最新价, 盈亏
    @SerializedName("contract_coode")
    String contract_coode;
    @SerializedName("contract_name")
    String contract_name;

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }

    public String getEntrust_bs() {
        return entrust_bs;
    }

    public void setEntrust_bs(String entrust_bs) {
        this.entrust_bs = entrust_bs;
    }

    public String getProfit_and_loss() {
        return profit_and_loss;
    }

    public void setProfit_and_loss(String profit_and_loss) {
        this.profit_and_loss = profit_and_loss;
    }

    public String getBusiness_amount() {
        return business_amount;
    }

    public void setBusiness_amount(String business_amount) {
        this.business_amount = business_amount;
    }

    public String getAverage_price() {
        return average_price;
    }

    public void setAverage_price(String average_price) {
        this.average_price = average_price;
    }

    public String getFutu_last_price() {
        return futu_last_price;
    }

    public void setFutu_last_price(String futu_last_price) {
        this.futu_last_price = futu_last_price;
    }

    public String getContract_coode() {
        return contract_coode;
    }

    public void setContract_coode(String contract_coode) {
        this.contract_coode = contract_coode;
    }

    public int getBusinessAmount() {
        try {
            return Integer.parseInt(business_amount);
        } catch (NumberFormatException e) {
            return 1;
        }
    }
}
