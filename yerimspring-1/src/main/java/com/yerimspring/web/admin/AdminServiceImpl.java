package com.yerimspring.web.admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yerimspring.web.util.Data;
import com.yerimspring.web.util.Messenger;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired AdminDao adminDao;

	/*employNumber,password,name,position,profile,regiterDate,email,phoneNumber*/
	
	@Override
	public void register(Admin admin) {
		admin.setEmployNumber(createEmployNmber());
		admin.setPassword("1");
		admin.setRegiterDate(createCurrentDate());
		adminDao.insert(admin);
	}
	
	private String createEmployNmber() {
		String returnNum ="";
		for(int i = 0; i<4; i++) {
			returnNum += String.valueOf((int)(Math.random()*10));
		}
		return returnNum;
	}

	private String createCurrentDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

	@Override
	public List<Admin> findAll() {
		return adminDao.selectAll();
	}

	@Override
	public Admin findOne(String employNumber) {
		return adminDao.selectOne(employNumber);
	}

	@Override
	public void modify(Admin admin) {
		adminDao.update(admin);
	}

	@Override
	public void remove(Admin admin) {
		adminDao.delete(admin);
	}

	
}
