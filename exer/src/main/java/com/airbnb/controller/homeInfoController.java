package com.airbnb.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.airbnb.dao.HomeInfoDAO;
import com.airbnb.dto.HomeInfoDTO;
import com.airbnb.service.homeInfoService;
import com.airbnb.utils.DBHelper;

@WebServlet("/homeInfoController")
public class homeInfoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private homeInfoService homeInfoService;

	public homeInfoController() {
		homeInfoService = new homeInfoService();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HomeInfoDAO dao = new HomeInfoDAO();
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		String home_id = request.getParameter("id");
		if ("delete".equals(action)) {

		} else {

			HomeInfoDTO responseDTO = dao.select(Integer.parseInt(home_id));
			request.setAttribute("action", action);
			request.setAttribute("home_id", home_id);
			RequestDispatcher dispatcher = request.getRequestDispatcher("home10.jsp");
			dispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
