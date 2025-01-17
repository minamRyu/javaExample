package day16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DBInsertEx1 {
	public static void printData(ResultSet rs) throws SQLException {
		while(rs.next()) {
			String name = rs.getString("STU_NAME");
			int height = rs.getInt("STU_HEIGHT");
			System.out.print(name + "\t");
			System.out.println(height);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn;
		java.sql.Statement stmt = null;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String db_url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String db_id = "SYSTEM";
			String db_pw = "test1234";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
			System.out.println("DB 연결 완료");
			stmt = conn.createStatement();
			// 학번(String), 이름, 학과를 입력 받아서
			// STUDENT 테이블에 저장
			
			System.out.print("학번 입력 : ");
			String no = scan.next();
			System.out.print("이름 입력 : ");
			String name = scan.next();
			System.out.print("학과 입력 : ");
			String dept = scan.next();
			
			String sql 
				= "INSERT INTO STUDENT (STU_NO, STU_NAME, STU_DEPT) "
				+ "VALUES ('" + no + "', '" + name + "', '" + dept + "')";
			System.out.println(sql);
				
			
			int num = stmt.executeUpdate("INSERT INTO STUDENT (STU_NO, STU_NAME, STU_DEPT) "
					+ "VALUES ('" + no + "', '" + name + "', '" + dept + "')");
					
			if(num == 0) {
				System.out.println("추가할 대상이 존재하지 않습니다.");
			} else {
				System.out.println("추가되었습니다.");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 오류");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}

	}

}
