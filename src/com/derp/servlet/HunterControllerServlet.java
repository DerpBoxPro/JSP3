package com.derp.servlet;

import java.sql.*;
import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.derp.Hunter;

@WebServlet("/HunterControllerServlet")
public class HunterControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HunterDbUtil dbUtil;
	@Resource(name = "jdbc/hunter")
	private DataSource datasource;

	@Override
	public void init() throws ServletException {
		super.init();
		try {
			dbUtil = new HunterDbUtil(datasource);
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public HunterControllerServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			try {
				listHunters(request, response);
			} catch (Exception e) {
				throw new ServletException(e);
			}
	}
	private void listHunters(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Hunter> hunters = dbUtil.getHunters();
		request.setAttribute("HUNTERLIST", hunters);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-hunters.jsp");
		dispatcher.forward(request, response);
	}
}
