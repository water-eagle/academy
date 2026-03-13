package com.watereagle.service;

import com.watereagle.dto.MemberDto;

public interface MemberService {
	public void reg(MemberDto m);

	public String login(MemberDto m);

}
