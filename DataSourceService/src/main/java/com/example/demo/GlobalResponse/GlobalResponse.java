package com.example.demo.GlobalResponse;

public class GlobalResponse {

	private String massage;
	private String status;
	private Integer code;
	public GlobalResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GlobalResponse(String massage, String status, Integer code) {
		super();
		this.massage = massage;
		this.status = status;
		this.code = code;
	}
	@Override
	public String toString() {
		return "GlobalResponse [massage=" + massage + ", status=" + status + ", code=" + code + "]";
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
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
