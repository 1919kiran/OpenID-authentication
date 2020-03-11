package com.myorg.rest.beans;

import java.io.Serializable;

public class LoginCredentials implements Serializable {

	private static final long serialVersionUID = 567200821880170405L;
	
	private long id;
	private String content;
	
	public LoginCredentials() {}

	public LoginCredentials(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

}
