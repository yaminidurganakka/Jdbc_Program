package com.yamini.servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DataServlet")
public class DataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DataServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("tbname");
		String num = request.getParameter("tbnum");
		String mail = request.getParameter("tbmail");
		String pass = request.getParameter("tbpass1");
		String pass1 = request.getParameter("tbpass2");
		System.out.println(name+","+num+","+mail+","+pass);
		PrintWriter out =	response.getWriter();
		out.append("<html><body>");
		out.append(name);
		out.append("<br>");
		out.append(num);
		out.append("<br>");
		out.append(mail);
		out.append("<br>");
		out.append(pass);
		out.append("</html></body>");
	}

}
