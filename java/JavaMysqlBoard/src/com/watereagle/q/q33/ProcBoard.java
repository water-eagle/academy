package com.watereagle.q.q33;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProcBoard {

	Connection con = null;
	Statement st = null;
	ResultSet result = null;

	void run() {
		Display.showTitle();
		dbInit();

		Scanner sc = new Scanner(System.in);
		System.out.println("글 제목을 입력해주세요:");
		String title = sc.next();
		System.out.println("글 내용을 입력해주세요:");
		String description = sc.next();
		System.out.println("작성자 id 입력해주세요:");
		String id = sc.next();

		
		String x = String.format("insert into board (b_title,b_id,b_datetime,b_text,b_hit) "
				+ "values ('%s','kitty',now(),'콘솔프로그램에서 작성한 글입니다. 글글.....글....',0);", title);
		System.out.println("SQL로그: "+x);
		dbExecuteUpdate(x);
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

	private void dbExecuteQuery(String query) {
		try {
			result = st.executeQuery(query);
			while (result.next()) { // 결과를 하나씩 빼기. 더 이상 없으면(행 수가 끝나면) false 리턴됨.
				String name = result.getString("p_name"); // p_name 필드(열)의 데이터 꺼내기(1개 꺼낸거에서)
				System.out.println(name);
			}

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
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
		}
	}

}
