package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/2.
 */

public class UserLoginForm extends DefaultRequestParams {
    @SerializedName("input_content")
    String input_content = "";
    @SerializedName("account_content")
    String account_content = "";
    @SerializedName("content_type")
    int content_type = 0;

    public String getInput_content() {
        return input_content;
    }

    public void setInput_content(String input_content) {
        this.input_content = input_content;
    }

    public String getAccount_content() {
        return account_content;
    }

    public void setAccount_content(String account_content) {
        this.account_content = account_content;
    }

    public int getContent_type() {
        return content_type;
    }

    public void setContent_type(int content_type) {
        this.content_type = content_type;
    }
}
