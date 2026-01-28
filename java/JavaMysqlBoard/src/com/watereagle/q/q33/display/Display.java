package com.watereagle.q.q33.display;

import com.watereagle.q.q33.util.Cw;

public class Display {
	static private String TITLE_BAR = "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈";
	static private String TITLE = "🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈     게시판     🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈🐈";
	static private String MAIN_MENU_BAR = "================================================================";
	static private String MAIN_MENU = "[1]글리스트 [2]글읽기 [3]글쓰기 [4]글삭제 [5]글수정 [0]관리자 [e] 프로그램 종료";

	static public void showTitle() {
		Cw.wn(TITLE_BAR);
		Cw.wn(TITLE);
		Cw.wn(TITLE_BAR);
	}

	static public void showMainMenu() {
		Cw.wn(MAIN_MENU_BAR);
		Cw.wn(MAIN_MENU);
		Cw.wn(MAIN_MENU_BAR);
	}
	
	static public void titleList() {
		Cw.wn("==========================================");
		Cw.wn("================= 글리스트 ==================");
		Cw.wn("==========================================");
		Cw.wn("글번호 글제목 작성시간 작성자ID");
	}
}
