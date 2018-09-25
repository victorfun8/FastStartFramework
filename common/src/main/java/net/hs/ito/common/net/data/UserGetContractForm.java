package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserGetContractForm extends DefaultRequestParams {
    @SerializedName("futuExchType")
    String futuExchType;
    @SerializedName("commodityType")
    String commodityType;

    public String getFutuExchType() {
        return futuExchType;
    }

    public void setFutuExchType(String futuExchType) {
        this.futuExchType = futuExchType;
    }

    public String getCommodityType() {
        return commodityType;
    }

    public void setCommodityType(String commodityType) {
        this.commodityType = commodityType;
    }
}
