package com.watereagle.mapper;

import java.util.ArrayList;

import com.watereagle.dto.GuestDto;

public interface GuestMapper {
	ArrayList<GuestDto> getList();

	public GuestDto read(long bno);
}
