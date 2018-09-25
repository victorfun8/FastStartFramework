package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserGetFundResult {
    //浮动盈亏
    @SerializedName("base_hold_profit_float")
    String base_hold_profit_float;

    @SerializedName("base_rights_balance")
    String base_rights_balance;
    @SerializedName("base_hold_balance")
    String base_hold_balance;
    @SerializedName("base_enable_balance")
    String base_enable_balance;

    public String getBase_hold_profit_float() {
        return base_hold_profit_float;
    }

    public void setBase_hold_profit_float(String base_hold_profit_float) {
        this.base_hold_profit_float = base_hold_profit_float;
    }

    public String getBase_rights_balance() {
        return base_rights_balance;
    }

    public void setBase_rights_balance(String base_rights_balance) {
        this.base_rights_balance = base_rights_balance;
    }

    public String getBase_hold_balance() {
        return base_hold_balance;
    }

    public void setBase_hold_balance(String base_hold_balance) {
        this.base_hold_balance = base_hold_balance;
    }

    public String getBase_enable_balance() {
        return base_enable_balance;
    }

    public void setBase_enable_balance(String base_enable_balance) {
        this.base_enable_balance = base_enable_balance;
    }

    @Override
    public String toString() {
        return "UserGetFundResult{" +
            "base_hold_profit_float='" + base_hold_profit_float + '\'' +
            ", base_rights_balance='" + base_rights_balance + '\'' +
            ", base_hold_balance='" + base_hold_balance + '\'' +
            ", base_enable_balance='" + base_enable_balance + '\'' +
            '}';
    }
}
