package com.yerimspring.web.lostThing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LostServiceImpl implements LostService{
	@Autowired LostDao lostDao;

	@Override
	public List<Lost> readAll() {
		return lostDao.selectAll();
	}
	
}
