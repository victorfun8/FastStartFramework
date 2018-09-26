package net.hs.ito.common.exception;

/**
 * Created by fangji on 2018/9/26.
 */

public class BizException extends Exception{
    private static final long serialVersionUID = -7320395481336167137L;

    private final int errorNo;
    private final String errorInfo;

    public BizException(Integer errorNo, String errorInfo) {
        super(errorInfo);
        this.errorNo = errorNo;
        this.errorInfo = errorInfo;
    }

    public BizException(String errorNo, String errorInfo) {
        this(Integer.parseInt(errorNo), errorInfo);
    }

    public int getErrorNo() {
        return errorNo;
    }

    public String getErrorInfo() {
        return errorInfo;
    }
}
