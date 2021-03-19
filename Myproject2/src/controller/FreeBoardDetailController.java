package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Board;
import service.ServiceAll;

@WebServlet("/freeboarddetail")
public class FreeBoardDetailController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServiceAll sa = new ServiceAll();
		
		String number_ = req.getParameter("number");
		System.out.println("프리보드디테일 넘버 = "+number_);
		int number = Integer.parseInt(number_);
		Board bo = sa.getfbdetaillist(number);
		
		sa.gethits(number);
		
		
		req.setAttribute("list", bo);
		req.getRequestDispatcher("/WEB-INF/view/freeboarddetail.jsp").forward(req, resp);
	}

//	@Override
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		String interest = req.getParameter("interest");
//		System.out.println("두포스트 : "+interest);
//		
//	}
}
