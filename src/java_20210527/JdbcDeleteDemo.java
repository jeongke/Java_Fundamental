package java_20210527;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcDeleteDemo {
	public static void main(String[] args) {
		
		//1. 드라이버 로드한다.
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버로드 성공");
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버로드 실패 : " + e.getMessage());
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		//2.Connection 객체 생성
		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kpc",
					"kpc12","kpc1212");
		//3.SQL문을 전송할 수 있는 PreparedStatement 객체 생성
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM member ");
		sql.append("WHERE num = ? ");
		pstmt = con.prepareStatement(sql.toString());
		//4.바인딩 변수를 설정
		int index = 1;
		pstmt.setInt(index, 11);//setString(index, String.valueOf(11));도 가능하나 사용XX
		//5.SQL문을 전송	
		int resultCount = pstmt.executeUpdate(); //insert,update,delete할때 SQL문 전송할 수 있는 method
		System.out.println("갱신된 행의 수 :"+resultCount);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//6.모든 자원을 반납
		}finally {
			
				try {
					if(con !=null)con.close();
					if(pstmt !=null)con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	
	
	}
}
