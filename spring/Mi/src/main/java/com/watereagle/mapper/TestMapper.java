package com.watereagle.mapper;

import com.watereagle.spring.dto.TestDto;

public interface TestMapper {
	public TestDto getData1();
	public TestDto getData2();
	public TestDto getData3();
	public TestDto getData4();
	
	public void updateVisitantCount(); /* 문제 1 */
}
