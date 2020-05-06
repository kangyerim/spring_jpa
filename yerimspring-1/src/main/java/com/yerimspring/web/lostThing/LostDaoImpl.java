package com.yerimspring.web.lostThing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.yerimspring.web.util.Data;

@Repository
public class LostDaoImpl implements LostDao{

	@Override
	public List<Lost> selectAll() {
		List<Lost> lostList = new ArrayList<>();
		List<String> list = new ArrayList<>();
			try {
				BufferedReader reader = new BufferedReader(
										new FileReader(
										new File(Data.LOSTS.toString())));
				String messege = "";
				while ((messege = reader.readLine())!= null) {
					list.add(messege);
				}
				reader.close();
			} catch (Exception e) {
				System.out.println(" List<Lost> selectAll()   ERROR   !!!");
				e.printStackTrace();
			}
		Lost lost = null;
			for(String s : list) {
				lost = new Lost();
				String[] arr = s.split(",");
				lost.setIdNum(arr[0]);
				lost.setGoodsName(arr[1]);
				lost.setDate(arr[3]);
				lost.setInventory(arr[2]);
				lost.setLocation(arr[4]);
				lostList.add(lost);
			}
		return lostList;
	}

}
