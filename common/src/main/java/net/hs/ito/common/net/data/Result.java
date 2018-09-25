package net.hs.ito.common.net.data;

/**
 * 统一返回结果
 */
public class Result {
    private Integer code;
    private String msg;
    private String data;

    protected Result(Integer code, String msg, String date){
        this.code = code;
        this.msg = msg;
        this.data = date;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
