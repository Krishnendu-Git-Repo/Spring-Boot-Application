package com.example.demo.GlobalResponse;

public class GlobalResponse {

	private String message;
	private String status;
	private Integer code;
	
	public GlobalResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GlobalResponse(String message, String status, Integer code) {
		super();
		this.message = message;
		this.status = status;
		this.code = code;
	}
	@Override
	public String toString() {
		return "GlobalResponse [message=" + message + ", status=" + status + ", code=" + code + "]";
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	
	
}
