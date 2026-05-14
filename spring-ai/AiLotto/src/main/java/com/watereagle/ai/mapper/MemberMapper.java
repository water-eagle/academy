package com.watereagle.ai.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.watereagle.ai.dto.MemberDto;

@Mapper
public interface MemberMapper {
	public void join(MemberDto dto);
}
