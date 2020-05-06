package com.yerimspring.web.lostThing;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface LostService {

	public List<Lost> readAll();

}
