package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/2.
 */

public class UserGetVersionResult {
    @SerializedName("android_last_version_code")
    String android_last_version_code;
    @SerializedName("support_lowest_version_code_android")
    String support_lowest_version_code_android;
    @SerializedName("download_url_android")
    String download_url_android;

    public String getAndroid_last_version_code() {
        return android_last_version_code;
    }

    public void setAndroid_last_version_code(String android_last_version_code) {
        this.android_last_version_code = android_last_version_code;
    }

    public String getSupport_lowest_version_code_android() {
        return support_lowest_version_code_android;
    }

    public void setSupport_lowest_version_code_android(String support_lowest_version_code_android) {
        this.support_lowest_version_code_android = support_lowest_version_code_android;
    }

    public String getDownload_url_android() {
        return download_url_android;
    }

    public void setDownload_url_android(String download_url_android) {
        this.download_url_android = download_url_android;
    }
}
