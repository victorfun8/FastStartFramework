package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserGetContractResult {
    @SerializedName("contract_code")
    String contract_code;
    @SerializedName("futu_exch_type")
    String futu_exch_type;
    @SerializedName("commodity_type")
    String commodity_type;
    @SerializedName("tick_size")
    String tick_size;

    public String getTick_size() {
        return tick_size;
    }

    public void setTick_size(String tick_size) {
        this.tick_size = tick_size;
    }

    public String getContract_code() {
        return contract_code;
    }

    public void setContract_code(String contract_code) {
        this.contract_code = contract_code;
    }

    public String getFutu_exch_type() {
        return futu_exch_type;
    }

    public void setFutu_exch_type(String futu_exch_type) {
        this.futu_exch_type = futu_exch_type;
    }

    public String getCommodity_type() {
        return commodity_type;
    }

    public void setCommodity_type(String commodity_type) {
        this.commodity_type = commodity_type;
    }

    @Override
    public String toString() {
        return futu_exch_type + "." + commodity_type + "." + contract_code;
    }
}
