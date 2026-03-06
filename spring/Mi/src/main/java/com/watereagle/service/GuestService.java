package com.watereagle.service;

import java.util.ArrayList;

import com.watereagle.dto.GuestDto;

public interface GuestService {
	public ArrayList<GuestDto> getList(int currentPage);
	public GuestDto read(long bno);
	public void del(long bno);
	public void write(GuestDto dto);
	public void modify(GuestDto dto);
}
