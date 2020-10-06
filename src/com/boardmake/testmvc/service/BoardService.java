package com.boardmake.testmvc.service;

import java.util.ArrayList;
import com.boardmake.testmvc.dao.BoardDAO;
import com.boardmake.testmvc.vo.BoardTest;



public class BoardService {
	
	private static BoardService service = null;
	private static BoardDAO dao = null;
	
	private BoardService() {

	}	
		
	public static BoardService getInstance() {
		if(service == null ) {
			service = new BoardService();
			dao = BoardDAO.getInstance();
			
		}
		return service;
	}
	
	public ArrayList<BoardTest> getBoardTest(){
		return dao.getBoardTest();
	}
	
	public void insertBoardTest(BoardTest board) {
		dao.BoardTest(board);
	}
}
