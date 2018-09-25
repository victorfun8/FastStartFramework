package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/2.
 */

public class DefaultRequestParams {
    @SerializedName("op_branch_no")
    String op_branch_no = "";
    @SerializedName("op_entrust_way")
    String op_entrust_way = "";
    @SerializedName("op_station")
    String op_station = "";
    @SerializedName("branch_no")
    String branch_no = "";
    @SerializedName("fund_account")
    String fund_account;
    @SerializedName("password")
    String password = "";
    @SerializedName("password_type")
    int    password_type = 0;
    @SerializedName("user_token")
    String user_token = "";

    public String getOp_branch_no() {
        return op_branch_no;
    }

    public void setOp_branch_no(String op_branch_no) {
        this.op_branch_no = op_branch_no;
    }

    public String getOp_entrust_way() {
        return op_entrust_way;
    }

    public void setOp_entrust_way(String op_entrust_way) {
        this.op_entrust_way = op_entrust_way;
    }

    public String getOp_station() {
        return op_station;
    }

    public void setOp_station(String op_station) {
        this.op_station = op_station;
    }

    public String getBranch_no() {
        return branch_no;
    }

    public void setBranch_no(String branch_no) {
        this.branch_no = branch_no;
    }

    public String getFund_account() {
        return fund_account;
    }

    public void setFund_account(String fund_account) {
        this.fund_account = fund_account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPassword_type() {
        return password_type;
    }

    public void setPassword_type(int password_type) {
        this.password_type = password_type;
    }

    public String getUser_token() {
        return user_token;
    }

    public void setUser_token(String user_token) {
        this.user_token = user_token;
    }
}
