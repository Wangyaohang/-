package com.wyh.custom;
/**
 * 自定义异常
 * @author wyh
 *
 */
public class MyException extends RuntimeException {

	/** * 序列化版本号*/
	private static final long serialVersionUID = -2014379777961484970L;
	/*** 响应码*/
	private Integer Code;
	/*** 异常*/
	private Exception Exception;
	/*** 路径(自定义异常触发路径)*/
	private String Url;

	public Integer getCode() {
		return Code;
	}

	public void setCode(Integer code) {
		Code = code;
	}

	public Exception getException() {
		return Exception;
	}

	public void setException(Exception exception) {
		Exception = exception;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public MyException(Integer code, java.lang.Exception exception, String url) {
		super();
		Code = code;
		Exception = exception;
		Url = url;
	}

	public MyException() {
		super();
	}

}
