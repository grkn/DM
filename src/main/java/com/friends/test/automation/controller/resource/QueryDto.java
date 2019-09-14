package com.friends.test.automation.controller.resource;

public class QueryDto {

	private String databaseAddress;
	private String username;
	private String password;
	private String serviceName;
	private String query;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getDatabaseAddress() {
		return databaseAddress;
	}

	public void setDatabaseAddress(String databaseAddress) {
		this.databaseAddress = databaseAddress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
