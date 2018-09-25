package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserGetExchangeResult {
    @SerializedName("exchange_name")
    String exchange_name;
    @SerializedName("futu_exch_type")
    String futu_exch_type;

    public String getExchange_name() {
        return exchange_name;
    }

    public void setExchange_name(String exchange_name) {
        this.exchange_name = exchange_name;
    }

    public String getFutu_exch_type() {
        return futu_exch_type;
    }

    public void setFutu_exch_type(String futu_exch_type) {
        this.futu_exch_type = futu_exch_type;
    }
}
