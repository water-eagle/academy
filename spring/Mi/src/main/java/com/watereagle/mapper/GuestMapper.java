package com.watereagle.mapper;

import java.util.ArrayList;

import com.watereagle.dto.GuestDto;

public interface GuestMapper {
	ArrayList<GuestDto> getList(int limitIndex);
	public GuestDto read(long bno);
	public void del(long bno);
	public void write(GuestDto dto);
	public void modify(GuestDto dto);
}
