package com.boardmake.testmvc.dao;

	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import com.boardmake.testmvc.database.DBConnection;
	import com.boardmake.testmvc.vo.BoardTest;

	public class BoardDAO {
		
		private static BoardDAO dao = null;
		
		private BoardDAO() {

		}

	public static BoardDAO getInstance(){
		if(dao == null ) {
			dao = new BoardDAO();
		}
		return dao;
	}
	
	public ArrayList<BoardTest> getBoardTest() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs =null;
		ArrayList<BoardTest> list =null;
		
		try {
			conn = DBConnection.getConnection();
			String query = "select * from boardtest";
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			list = new ArrayList<BoardTest>();
			
			while (rs.next()) {
				BoardTest board = new BoardTest();
				board.setU_idx(rs.getInt("u_idx"));
				board.setU_id(rs.getString("u_id"));
				board.setU_name(rs.getString("u_name"));
				board.setU_tel(rs.getString("u_tel"));
				board.setU_age(rs.getString("u_age"));
				board.setU_birth(rs.getString("u_birth"));
       	       	list.add(board);
	        }
		} catch (Exception e) {
		
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return list;

		}	
	}
	