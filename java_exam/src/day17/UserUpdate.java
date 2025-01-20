package day17;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day16.DBClass;

public class UserUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아이디를 입력받아서 없는 아이디면
		// "없는 아이디 입니다" -> 다시입력
		// 있는 아이디일 경우
		// 나이 값을 입력받아서 업데이트
		try {
			Scanner scan =  new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			
			// 내가 푼거
			String id = "";
			while(true) {
				System.out.print("아이디 : ");
				id = scan.next();
				String sql = 
						"SELECT * FROM TBL_USER "
						+ "WHERE USERID = '" + id + "'";
				ResultSet rs = stmt.executeQuery(sql);
				
				if(rs.next()) {
					System.out.print("나이 입력 : ");
					int age = scan.nextInt();
					stmt.executeUpdate("UPDATE TBL_USER SET AGE = '" 
										+ age + "' WHERE USERID = '" 
										+ id + "'"); 
					System.out.println("수정 되었습니다!");
					System.out.println(sql);
					break;
				}
				System.out.println("없는 아이디 입니다!");
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
}
