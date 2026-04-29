package com.watereagle.q.q33.mysqltest;

import com.watereagle.q.q33.display.Display;
import com.watereagle.q.q33.util.Ci;
import com.watereagle.q.q33.util.Cw;
import com.watereagle.q.q33.util.Db;

public class ProcList {
	public static final int PER_PAGE = 3; // 페이지 단위

	static public void run() {
		int startIndex = 0; // 현재 페이지의 첫 글 인덱스
		int currentPage = 1; // 현재 페이지

		// -[x] 전체 페이지 수를 구해야하고, 그다음 총 페이지 수를 구해야함
		int totalPage = 0;
		if (Db.getPostCount() % PER_PAGE > 0) {
			totalPage = Db.getPostCount() / PER_PAGE + 1;
		} else {
			totalPage = Db.getPostCount() / PER_PAGE;
		}

		Cw.wn("총 페이지 수: " + totalPage);
		String cmd;
		while (true) {
			// todo: 없는 페이지 입력 못하게 하는 처리 추가
			cmd = Ci.r("페이지 번호 입력 | 뒤로가기[x]");
			if (cmd.equals("x")) {
				break;
			}

			startIndex = (currentPage - 1) * PER_PAGE;
			Display.titleList();
			String readSql = "SELECT * FROM board LIMIT " + startIndex + ", " + PER_PAGE;
			try {
				// todo:
				// 임시로 페이지당 3개 글 리스트 출력하겠음.
				// 1페이지 고정
//				select * from board 6,3;
//				select * from board limit 0,3; <<<<
				// ProcList로 이동하여 처리

				Db.result = Db.st.executeQuery(readSql);
				Cw.wn("전송한 SQL문: " + readSql);

				while (Db.result.next()) { // 결과를 하나씩 빼기. 더 이상 없으면(행 수가 끝나면) false 리턴됨.
					String no = Db.result.getString("b_no");
					String title = Db.result.getString("b_title");
					String datetime = Db.result.getString("b_datetime");
					String id = Db.result.getString("b_id");
					Cw.wn(no + " " + title + " " + id + " " + datetime);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
