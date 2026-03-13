package com.watereagle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watereagle.dto.MemberDto;
import com.watereagle.mapper.MemberMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class MemberServiceMpl implements MemberService {
	@Setter(onMethod_ = @Autowired)
	private MemberMapper mapper;

	@Override
	public void reg(MemberDto m) {
		mapper.reg(m);
	}

}
