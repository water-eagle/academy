package com.watereagle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println("아이디 " + request.getParameter("id"));
		System.out.println("비밀번호: " + request.getParameter("pw"));

		HttpSession s = request.getSession();
		s.setAttribute("saveId", id);
		String saveId = (String) s.getAttribute("saveId");
		s.setMaxInactiveInterval(10);
		System.out.println("saveId: "+saveId);
		response.sendRedirect("index2.jsp");
	}

}
