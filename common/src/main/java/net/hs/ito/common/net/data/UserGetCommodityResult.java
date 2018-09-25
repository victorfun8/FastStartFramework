package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserGetCommodityResult {
    @SerializedName("futu_exch_type")
    String futu_exch_type;
    @SerializedName("commodity_type")
    String commodity_type;
    @SerializedName("commodity_name")
    String commodity_name;

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

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }
}
