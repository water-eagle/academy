package com.watereagle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watereagle.mapper.TestMapper;
import com.watereagle.spring.dto.TestDto;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class TestServicelMpl implements TestService {
	@Setter(onMethod_ = @Autowired)
	private TestMapper mapper;

	@Override
	public String getOne()
	{
		log.info("test============");
		TestDto tvo = mapper.getData1();
		String one = tvo.getStr_data();
		return one;
	}

	@Override
	public String getTwo()
	{
		log.info("test============");
		TestDto tvo = mapper.getData1();
		String one = tvo.getStr_data();
		return one;
	}

}
