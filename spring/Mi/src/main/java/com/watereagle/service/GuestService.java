package com.watereagle.service;

import java.util.ArrayList;

import com.watereagle.dto.GuestDto;

public interface GuestService {
	public ArrayList<GuestDto> getList();

	public GuestDto read(long bno);
}
