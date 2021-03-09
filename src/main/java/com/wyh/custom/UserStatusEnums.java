package com.wyh.custom;
/**
 * 用户状态枚举类
 * @author wyh
 *
 */
public enum UserStatusEnums {
	
	USER_STATUS_ERROR(1,"用户信息异常"),
	USER_STATUS_LOGINRROR(2,"用户没有登录");//后续自己慢慢添加
	/***状态码**/
	private Integer code;
	/***信息**/
	private String msg;
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
	private UserStatusEnums(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	private UserStatusEnums() {
	}
	
}
