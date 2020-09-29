package com.boardmake.testmvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.boardmake.testmvc.service.BoardService;
import com.boardmake.testmvc.vo.BoardTest;

@WebServlet("*.do")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException 
		{response.setContentType("text/html;charset=utf-8");
		
		String requestURI = request.getRequestURI();
		String contextPath=request.getContextPath();
		String command=requestURI.substring(contextPath.length());
		String view = null;
		
		response.setContentType("test/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		switch(command){
		case "/boardmake-list.do":
			BoardService boardService=BoardService.getInstance();
			ArrayList<BoardTest> list = boardService.getBoardTest();
			view="board/list";
			request.setAttribute("list",list);
			break;
		
		case "/board-newjoin.do":
			view = "board/newjoin";
			break;
		
		case "/board-newjoin-process.do":
			BoardTest board = new BoardTest();
			board.setU_id(request.getParameter("id"));
			board.setU_pw(request.getParameter("password"));
			board.setU_name(request.getParameter("name"));
			board.setU_tel(request.getParameter("tel1")+"-"+request.getParameter("tel2")+"-"+request.getParameter("tel3"));
			board.setU_age(request.getParameter("age"));
			board.setU_birth(request.getParameter("birth"));
			
			boardService = BoardService.getInstance();
			boardService.insertBoardTest(board);
			
			view = "board/newjoin-result";
			
			break;
		}
		RequestDispatcher rd = request.getRequestDispatcher(view+".jsp");
		rd.forward(request, response);
		}
	
	{
		
}

}
