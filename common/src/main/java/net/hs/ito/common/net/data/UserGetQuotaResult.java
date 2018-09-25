package net.hs.ito.common.net.data;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fangji on 2018/4/20.
 */

public class UserGetQuotaResult {
    @SerializedName("sell_low_price")
    String sell_low_price;
    @SerializedName("buy_high_price")
    String buy_high_price;
    @SerializedName("sell_low_amount")
    String sell_low_amount;
    @SerializedName("buy_high_amount")
    String buy_high_amount;
    @SerializedName("futu_last_price")
    String futu_last_price;
    @SerializedName("float_percent")
    String float_percent;
    @SerializedName("float_price")
    String float_price;

    public String getSell_low_price() {
        return sell_low_price;
    }

    public void setSell_low_price(String sell_low_price) {
        this.sell_low_price = sell_low_price;
    }

    public String getBuy_high_price() {
        return buy_high_price;
    }

    public void setBuy_high_price(String buy_high_price) {
        this.buy_high_price = buy_high_price;
    }

    public String getSell_low_amount() {
        return sell_low_amount;
    }

    public void setSell_low_amount(String sell_low_amount) {
        this.sell_low_amount = sell_low_amount;
    }

    public String getBuy_high_amount() {
        return buy_high_amount;
    }

    public void setBuy_high_amount(String buy_high_amount) {
        this.buy_high_amount = buy_high_amount;
    }

    public String getFutu_last_price() {
        return futu_last_price;
    }

    public void setFutu_last_price(String futu_last_price) {
        this.futu_last_price = futu_last_price;
    }

    public String getFloat_percent() {
        return float_percent;
    }

    public void setFloat_percent(String float_percent) {
        this.float_percent = float_percent;
    }

    public String getFloat_price() {
        return float_price;
    }

    public void setFloat_price(String float_price) {
        this.float_price = float_price;
    }
}
