package com.watereagle.board;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/board/*")
public class ServletController extends HttpServlet {
	String nextPage;
	Dao dao;

	@Override
	public void init() throws ServletException {
		dao = new Dao();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getPathInfo();
		System.out.println("action: " + action);
		if (action != null) {
			switch (action) {

			case "/del":
				System.out.println("삭제");
				nextPage = "/list.jsp";
				dao.del(request.getParameter("no"));
				break;

			case "/write":
				System.out.println("쓰기");
				nextPage = "/list.jsp";
				Dto dto=new Dto(
						request.getParameter("title"),
						request.getParameter("id"),
						request.getParameter("text")
						);
				Dao dao=new Dao();
				dao.write(dto);
				break;

			case "/edit": // TODO
				System.out.println("수정");
				nextPage = "/edit.jsp";
				break;

			case "/read": // TODO
				System.out.println("읽기");
				nextPage = "/read.jsp";
				break;

			case "/list": // TODO
				System.out.println("리스트");
				nextPage = "/list.jsp";

			default:
				break;
			}
			RequestDispatcher d = request.getRequestDispatcher(nextPage);
			d.forward(request, response);
		}
	}

}
