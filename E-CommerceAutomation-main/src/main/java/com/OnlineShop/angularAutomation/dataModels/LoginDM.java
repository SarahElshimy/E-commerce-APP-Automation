package com.OnlineShop.angularAutomation.dataModels;


import com.poiji.annotation.ExcelCell;


public class LoginDM {

	@ExcelCell(3)
	private String userMail="";
	@ExcelCell(4)
	private String password="";
	@ExcelCell(5)
	private String errType="";
	@ExcelCell(6)
	private String expectedMessage="";


	
	
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getErrType() {
		return errType;
	}

	public void setErrType(String errType) {
		this.errType = errType;
	}

	public String getExpectedMessage() {
		return expectedMessage;
	}

	public void setExpectedMessage(String expectedMessage) {
		this.expectedMessage = expectedMessage;
	}



}
