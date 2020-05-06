package com.yerimspring.web.lostThing;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Lost {
	private String idNum, goodsName, date, inventory, location;
}
