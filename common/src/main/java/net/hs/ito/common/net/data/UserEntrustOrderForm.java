package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserEntrustOrderForm extends DefaultRequestParams {
    @SerializedName("contractCode")
    String contractCode;
    @SerializedName("entrustBs")
    String entrustBs;
    @SerializedName("entrustAmount")
    String entrustAmount;
    @SerializedName("entrustPrice")
    String entrustPrice;

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    public String getEntrustBs() {
        return entrustBs;
    }

    public void setEntrustBs(String entrustBs) {
        this.entrustBs = entrustBs;
    }

    public String getEntrustAmount() {
        return entrustAmount;
    }

    public void setEntrustAmount(String entrustAmount) {
        this.entrustAmount = entrustAmount;
    }

    public String getEntrustPrice() {
        return entrustPrice;
    }

    public void setEntrustPrice(String entrustPrice) {
        this.entrustPrice = entrustPrice;
    }
}
