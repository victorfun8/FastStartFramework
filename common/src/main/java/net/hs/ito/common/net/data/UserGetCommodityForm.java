package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */
public class UserGetCommodityForm extends DefaultRequestParams {
    @SerializedName("futuExchType")
    String futuExchType;

    public String getFutuExchType() {
        return futuExchType;
    }

    public void setFutuExchType(String futuExchType) {
        this.futuExchType = futuExchType;
    }
}
