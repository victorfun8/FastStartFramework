package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/24.
 * 挂单返回数据
 */

public class UserGetCanCancelOrderResult{
    @SerializedName("entrust_bs")
    String entrust_bs;
    @SerializedName("contract_code")
    String contract_code;
    @SerializedName("futu_entrust_price")
    String futu_entrust_price;
    @SerializedName("entrust_amount")
    String entrust_amount;
    @SerializedName("entrust_status")
    String entrust_status;
    @SerializedName("init_date")
    String init_date;
    @SerializedName("entrust_no")
    String entrust_no;
    @SerializedName("contract_name")
    String contract_name;

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

    public String getFutu_entrust_price() {
        return futu_entrust_price;
    }

    public void setFutu_entrust_price(String futu_entrust_price) {
        this.futu_entrust_price = futu_entrust_price;
    }

    public String getEntrust_amount() {
        return entrust_amount;
    }

    public void setEntrust_amount(String entrust_amount) {
        this.entrust_amount = entrust_amount;
    }

    public String getEntrust_status() {
        return entrust_status;
    }

    public void setEntrust_status(String entrust_status) {
        this.entrust_status = entrust_status;
    }

    public String getInit_date() {
        return init_date;
    }

    public void setInit_date(String init_date) {
        this.init_date = init_date;
    }

    public String getEntrust_no() {
        return entrust_no;
    }

    public void setEntrust_no(String entrust_no) {
        this.entrust_no = entrust_no;
    }

    public String getContract_name() {
        return contract_name;
    }

    public void setContract_name(String contract_name) {
        this.contract_name = contract_name;
    }
}
