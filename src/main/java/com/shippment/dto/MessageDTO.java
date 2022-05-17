package com.shippment.dto;

public class MessageDTO {
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;
	
	public MessageDTO(String string) {
		this.message = string;
	}

}
