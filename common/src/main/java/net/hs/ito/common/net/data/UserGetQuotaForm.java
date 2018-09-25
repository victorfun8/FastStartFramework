package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/19.
 */

public class UserGetQuotaForm extends DefaultRequestParams {
    @SerializedName("contractCode")
    String contractCode;

    public String getContractCode() {
        return contractCode;
    }

    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }
}
