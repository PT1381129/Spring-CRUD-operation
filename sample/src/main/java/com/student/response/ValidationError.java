package com.student.response;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ValidationError {

	private String porpertyName;
	private String propertyValue;
	private String message;
	public String getPorpertyName() {
		return porpertyName;
	}
	public void setPorpertyName(String porpertyName) {
		this.porpertyName = porpertyName;
	}
	public String getPropertyValue() {
		return propertyValue;
	}
	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
