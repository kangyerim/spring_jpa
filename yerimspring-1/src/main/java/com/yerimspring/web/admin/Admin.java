package com.yerimspring.web.admin;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Component
@Getter @Setter
public class Admin {
	private String employNumber, password, name, position, profile, regiterDate, email, phoneNumber;
	
	@Override
	public String toString() {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s", employNumber,password,name,position,profile,regiterDate,email,phoneNumber);
	}
}
