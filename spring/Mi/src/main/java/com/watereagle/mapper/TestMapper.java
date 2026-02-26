package com.watereagle.mapper;

import com.watereagle.spring.dto.TestDto;

public interface TestMapper {
	public TestDto getData1();
	public TestDto getData2();
	public TestDto getData3();
	public TestDto getData4();
	
	public void updateVisitantCount(); /* 문제 1 */
	public void insertDoodle(); /* 문제 2 */
	public void tbl_test_del(); /* 문제 3 */
}
