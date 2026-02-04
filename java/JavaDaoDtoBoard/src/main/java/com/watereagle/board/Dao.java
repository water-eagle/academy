package com.watereagle.board;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Dao extends Da {

	/* (1/5) 삭제 */
	public void del(String no) {
		super.connect();

		String sql = String.format("DELETE FROM %s WHERE b_no=%s", Db.TABLE_PS_BOARD_FREE, no);
		super.update(sql);
		super.close();

	}

	/* (2/5) 쓰기 */
	public void write(Dto d) {
		try {
			super.connect();

			String sql = String.format("INSERT INTO %s (b_title, b_id, b_text) VALUES('%s', '%s', '%s')",
					Db.TABLE_PS_BOARD_FREE, d.title, d.id, d.text);
			super.update(sql);
			super.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/* (3/5) 읽기 */
	public Dto read(String no) {
		super.connect();
		Dto post = null;

		try {
			Class.forName(Db.DB_JDBC_DRIVER_PACKAGE_PATH);
			String sql = String.format("SELECT * FROM %s WHERE b_no=%s", Db.TABLE_PS_BOARD_FREE, no);
			System.out.println("SQL: " + sql); // todo
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			post = new Dto(rs.getString("B_NO"), rs.getString("B_TITLE"), rs.getString("B_ID"),
					rs.getString("B_DATETIME"), rs.getString("B_HIT"), rs.getString("B_TEXT"),
					rs.getString("B_REPLY_COUNT"), rs.getString("B_REPLY_ORI"));
			super.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return post;
	}

	/* (4/5) 글 리스트 */
	public ArrayList<Dto> list(String page) {
		super.connect();
		ArrayList<Dto> posts = new ArrayList<>();
		try {
			int startIndex = ((Integer.parseInt(page)) - 1) * 3;

			String sql = String.format("SELECT * FROM %s", Db.TABLE_PS_BOARD_FREE);
			System.out.println("SQL: " + sql);
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				posts.add(new Dto(rs.getString("B_NO"), rs.getString("B_TITLE"), rs.getString("B_ID"),
						rs.getString("B_DATETIME"), rs.getString("B_HIT"), rs.getString("B_TEXT"),
						rs.getString("B_REPLY_COUNT"), rs.getString("B_REPLY_ORI")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.close();
		return posts;

	}

	/* (5/5) 수정 */
	public void edit(Dto d, String no) {
		super.connect();
		String sql = String.format("UPDATE %s SET b_title='%s', b_text='%s' WHERE b_no=%s", Db.TABLE_PS_BOARD_FREE,
				d.title, d.text, no);
		super.update(sql);
		super.close();
	}

	/* 총 글 수 구하기 */
	public int getPostCount() {
		int count = 0;
		super.connect();
		try {
			String sql = String.format("SELECT count(*) FROM %s", Db.TABLE_PS_BOARD_FREE);
			System.out.println("SQL: " + sql);
			ResultSet rs = st.executeQuery(sql);
			rs.next();
			count = rs.getInt("count(*)");
		} catch (Exception e) {
			// TODO: handle exception
		}
		super.close();
		return count;
	}
}
