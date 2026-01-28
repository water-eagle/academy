package com.watereagle.q.q33.mysqltest;

import java.sql.SQLException;
import java.util.Scanner;

import com.watereagle.q.q33.display.Display;
import com.watereagle.q.q33.util.Ci;
import com.watereagle.q.q33.util.Cw;
import com.watereagle.q.q33.util.Db;

public class ProcBoard {
	void run() {
		Display.showTitle();
		Db.dbInit();

		loop: while (true) {
			Db.dbPostCount();
			Display.showMainMenu();
			String cmd = Ci.r("명령입력");
			switch (cmd) {
			case "1": // 글리스트
				ProcList.run();
				break;

			case "2": // 글읽기
				String readNo = Ci.r("읽을 번호를 선택해주세요");
				try {
					Db.result = Db.st.executeQuery("SELECT * FROM board WHERE b_no=" + readNo);
					Db.result.next(); // 결과를 하나씩 빼기, 더 이상 없으면(행 수가 끝나면) false가 리턴됨

					String title = Db.result.getString("b_title"); // p_name 필드(열) 의 데이터 꺼내기(1개 꺼낸거에서)
					Cw.wn("글 제목: " + title);
					String content = Db.result.getString("b_text");
					Cw.wn("글 내용: " + content);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case "3": // 글쓰기
				String title = Ci.rl("글 제목을 입력해주세요");
				String content = Ci.rl("글 내용을 입력해주세요");
				String id = Ci.rl("작성자 id 입력해주세요");

				try {
					Db.st.executeUpdate("INSERT INTO board (b_title, b_id, b_datetime, b_text, b_hit) " + "values ('"
							+ title + "', '" + id + "', now(), '" + content + "', 0);");
					Cw.wn("글 등록 완료");
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;

			case "4": // 글 삭제
				String deleteNo = Ci.r("삭제할 글 번호를 입력해주세요");
				Db.dbExecuteUpdate("DELET FROM board WHERE b_no=" + deleteNo);
				break;

			case "5":
				String editNo = Ci.r("수정할 글 번호를 입력해주세요");
				String editTitle = Ci.r("글 제목을 입력해주세요");
				String editContent = Ci.r("글 내용을 입력해주세요");
				String editId = Ci.r("작성자 id 입력해주세요");
				Db.dbExecuteUpdate("UPDATE board SET b_title='" + editTitle + "' b_id='" + editId
						+ "' b_datetime=now(), b_text='" + editContent + "' WHERE b_no='" + editNo + "';");
				break;

			case "0": // 관리자
				Cw.wn("관리자");
				break;

			case "e": // 프로그램 종료
				Cw.wn("프로그램 종료");
				break loop;

			default: // 예외처리
				Cw.wn("오류: 올바른 명령을 입력해주세요.");
				break;
			}
		}

	}

}
