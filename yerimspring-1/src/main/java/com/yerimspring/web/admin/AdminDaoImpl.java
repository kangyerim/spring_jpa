package com.yerimspring.web.admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
									new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV), true));
			writer.write(admin.toString());
			writer.newLine();
			writer.flush();
			System.out.println("<<<<<<<<<<<<<<<< 4. file write success");
		} catch (Exception e) {
			System.out.println(Messenger.FILE_INSERT_ERROR);
		} 
	}

	@Override
	public List<Admin> selectAll() {
		// TODO Auto-generated method stub
		return null;
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
