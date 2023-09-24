package com.crud.demo.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GlobalResponse {
	private String reason;
	private String status;
	private Integer code;
	public GlobalResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GlobalResponse(String reason, String status, Integer code) {
		super();
		this.reason = reason;
		this.status = status;
		this.code = code;
	}
	
}
