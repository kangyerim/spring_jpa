package com.yerimspring.web.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yerimspring.web.util.Data;
import com.yerimspring.web.util.Messenger;

@Repository
public class AdminDaoImpl implements AdminDao {

	@Override
	public void insert(Admin admin) {
		try {
			BufferedWriter writer = new BufferedWriter(
									new FileWriter(
									new File(Data.ADMINS.toString())));
			writer.write(admin.toString());
			writer.newLine();
			writer.flush();
		} catch (Exception e) {
			System.out.println(Messenger.FILE_INSERT_ERROR);
		} 
	}

	@Override
	public List<Admin> selectAll() {
		List<Admin> adminList = new ArrayList<>();
		List<String> list = new ArrayList<>();
			try {
				BufferedReader reader = new BufferedReader(
										new FileReader(
										new File(Data.ADMINS.toString())));
				String messege = "";
				while((messege = reader.readLine())!= null) {
					list.add(messege);
				}
				reader.close();
			}catch (Exception e) {
	
			}
		Admin admin = null;
			for(int i = 0; i < list.size(); i++) {
				admin = new  Admin();
				String[] arr = list.get(i).split(",");
				admin.setEmployNumber(arr[0]);
				admin.setPassword(arr[1]);
				admin.setName(arr[2]);
				admin.setPosition(arr[3]);
				admin.setProfile(arr[4]);
				admin.setRegiterDate(arr[5]);
				admin.setEmail(arr[6]);
				admin.setPhoneNumber(arr[7]);
				adminList.add(admin);
			}
		
		return adminList;
	}

	@Override
	public Admin selectOne(String employNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Admin admin) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Admin admin) {
		// TODO Auto-generated method stub

	}

}
