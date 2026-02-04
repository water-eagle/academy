package com.watereagle.board;

public class Dto {

	public String no;
	public String title;
	public String id;
	public String datetime;
	public String hit;
	public String text;
	public String replyCount;
	public String replyOri;

	/**
	 * @param title
	 * @param id
	 * @param text
	 */
	public Dto(String title, String id, String text) { /* 글 작성 */
		this.title = title;
		this.id = id;
		this.text = text;
	}

	/**
	 * @param no
	 * @param title
	 * @param id
	 * @param datetime
	 * @param hit
	 * @param text
	 * @param replyCount
	 * @param replyOri
	 */
	public Dto(String no, String title, String id, String datetime, String hit, String text, String replyCount,
			String replyOri) { /* 글 읽기 */
		this.no = no;
		this.title = title;
		this.id = id;
		this.datetime = datetime;
		this.hit = hit;
		this.text = text;
		this.replyCount = replyCount;
		this.replyOri = replyOri;
	}

	/**
	 * @param title
	 * @param text
	 */
	public Dto(String title, String text) { /* 글 수정 */
		this.title = title;
		this.text = text;
	}

}
