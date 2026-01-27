package com.watereagle.q.q33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProcBoard {
	public static final int PER_PAGE = 3;

	Connection con = null;
	Statement st = null;
	ResultSet result = null;

	Scanner sc = new Scanner(System.in);

	void run() {
		Display.showTitle();
		dbInit();
		int startIndex = 0; // 현재 페이지의 첫 글 인덱스
		int currentPage = 1; // 현재 페이지

		loop: while (true) {
			dbPostCount();
			Display.showMainMenu();
			System.out.println("명령입력: ");
			String cmd = sc.next();
			switch (cmd) {
			case "1": // 글리스트
				startIndex = (currentPage - 1) * PER_PAGE;

				System.out.println("==========================================");
				System.out.println("================= 글리스트 ==================");
				System.out.println("==========================================");
				System.out.println("글번호 글제목 작성시간 작성자ID");
				try {
					// todo:
					// 임시로 페이지당 3개 글 리스트 출력하겠음.
					// 1페이지 고정
//					select * from board 6,3;
//					select * from board limit 0,3; <<<<
					String readSql = "SELECT * FROM board LIMIT" + startIndex + "PER_PAGE";
					System.out.println("전송한 SQL문: " + readSql);
					result = st.executeQuery(readSql);

//					result = st.executeQuery("SELECT * FROM board");
					while (result.next()) { // 결과를 하나씩 빼기. 더 이상 없으면(행 수가 끝나면) false 리턴됨.
						String no = result.getString("b_no");
						String title = result.getString("b_title");
						String id = result.getString("b_id");
						String datetime = result.getString("b_datetime");
						System.out.println(no + " " + title + " " + id + " " + datetime);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case "2": // 글읽기
				System.out.println("읽을 번호를 선택해주세요: ");
				String readNo = sc.next();
				String readSql = "SELECT * FROM board WHERE b_no=" + readNo;
				System.out.println(readSql);
				try {
					result = st.executeQuery(readSql);
					result.next(); // 결과를 하나씩 빼기, 더 이상 없으면(행 수가 끝나면) false가 리턴됨
					String title = result.getString("b_title"); // p_name 필드(열) 의 데이터 꺼내기(1개 꺼낸거에서)
					String content = result.getString("b_text");
					System.out.println("글 제목: " + title);
					System.out.println("글 내용: " + content);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case "3": // 글쓰기
				sc.nextLine(); // 위에 sc.next() 쓴거 때문에 추가함.
				System.out.println("글 제목을 입력해주세요:");
				String title = sc.nextLine();

				System.out.println("글 내용을 입력해주세요:");
				String content = sc.nextLine(); // 이거 전에는 쓸 필요 없음. 바로 전에서 쓰인건 nextLine() 이기 때문.

				System.out.println("작성자 id 입력해주세요:");
				String id = sc.next();

				String writeSql = String.format("INSERT INTO BOARD (b_title,b_id,b_datetime,b_text,b_hit) "
						+ "values ('%s', '%s', now(), '%s', 0);", title, id, content);
				System.out.println("전송한 SQL문: " + writeSql);
				dbExecuteUpdate(writeSql);
				break;

			case "4": // 글 삭제
				System.out.println("삭제할 글 번호를 입력해주세요: ");
				String deleteNo = sc.next();

				String deleteSql = "DELET FROM board WHERE b_no=" + deleteNo;
				System.out.println("전송한 SQL문: " + deleteSql);
				dbExecuteUpdate(deleteSql);
				break;

			case "5":
				System.out.println("수정할 글 번호를 입력해주세요.");
				String editNo = sc.next();

				System.out.println("글 제목을 입력해주세요:");
				// 주의. 이전에 sc.next() 등을 호출한적이 있으면 엔터 문자열이 남게 되는데 이거 때문에 다음에 나오는 nextLine()가
				// 입력을 이미 한것으로 인식하고 입력처리를 해버림(공백 입력이 된걸로 인식)
				// 그래서 sc.nextLine()을 한번 더 추가해주어 이 내용이 없는 엔터 문자열을 입력처리 하게끔하고
				sc.nextLine();
				String editTitle = sc.nextLine(); // << 여기에서 다시 정상적으로 쓰면됨.

				System.out.println("글 내용을 입력해주세요:");
				String editContent = sc.nextLine();

				System.out.println("작성자 id 입력해주세요:");

				String editId = sc.next();

				String editSql = String.format(
						"UPDATE board SET `b_title`='%s', `b_id`='%s', `b_datetime`=now(), `b_text`='%s' WHERE `b_no`=%s;",
						editTitle, editId, editContent, editNo);
				dbExecuteUpdate(editSql);
				System.out.println("SQL로그: " + editSql);
				break;

			case "0": // 관리자
				System.out.println("관리자");
				break;

			case "e": // 프로그램 종료
				System.out.println("프로그램 종료");
				break loop;

			default: // 예외처리
				System.out.println("오류: 올바른 명령을 입력해주세요.");
				break;
			}
		}

	}

	private void dbInit() {
		try {
			// DB 접속 정보 넣어서 접속하기
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_cat", "root", "");
			// Statement 객체 얻어오기
			st = con.createStatement(); // Statement는 정적 SQL문을 실행하고 결과를 실행하고 결과를 반환받기 위한 객체다.
			// Statment 하나당 한 개의 ResultSet 객체만을 열 수 있다.
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}

	private void dbExecuteUpdate(String query) {
		try {
			int resultCount = st.executeUpdate(query);
			System.out.println("처리된 행 수: " + resultCount);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void dbPostCount() {
		try {
			result = st.executeQuery("SELECT COUNT(*) FROM board");
			result.next();
			String count = result.getString("COUNT(*)");
			System.out.println("글 수: " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
