package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/20.
 */

public class UserGetTradeResult {
    @SerializedName("entrust_bs")
    String entrust_bs;
    @SerializedName("contract_code")
    String contract_code;
    @SerializedName("business_amount")
    String business_amount;
    @SerializedName("futu_business_price")
    String futu_business_price;
    @SerializedName("contract_name")
    String contract_name;
    @SerializedName("business_time")
    String business_time;

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

    public String getContract_code() {
        return contract_code;
    }

    public void setContract_code(String contract_code) {
        this.contract_code = contract_code;
    }

    public String getBusiness_amount() {
        return business_amount;
    }

    public void setBusiness_amount(String business_amount) {
        this.business_amount = business_amount;
    }

    public String getFutu_business_price() {
        return futu_business_price;
    }

    public void setFutu_business_price(String futu_business_price) {
        this.futu_business_price = futu_business_price;
    }

    public String getBusiness_time() {
        return business_time;
    }

    public void setBusiness_time(String business_time) {
        this.business_time = business_time;
    }
}
