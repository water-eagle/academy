package com.watereagle.board;

// 서비스
public class Service {
	Dao dao;
	public Service() {
		dao=new Dao();
	}
	
	/* 삭제 */
	public void del(String no) {
		dao.del(no);
	}
}
