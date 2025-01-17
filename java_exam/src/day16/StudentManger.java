package day16;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class StudentManger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(System.in);
			DBClass db = new DBClass();
			Statement stmt = db.stmt;
			
			String colKor[] = {"이름", "학과", "키"};
			String colEng[] = {"STU_NAME", "STU_DEPT", "STU_HEIGHT"};
			
			while(true) {
				System.out.print("[(1) 학생추가 (2) 수정 (3) 삭제 (4) 조회 (5) 종료] : ");
				int menu = scan.nextInt();
				if(menu == 1) {
					String stuNo = "";
					while(true) {
						System.out.print("학번 입력 : ");
						stuNo = scan.next();
						if(stuNo.length() == 8 ) {
							break;
						} else if(stuNo.length() != 8) {
							System.out.println("학번은 8자리 입니다.");
						}
					}
					
					System.out.print("이름 입력 : ");
					String name = scan.next();
					System.out.print("학과 입력 : ");
					String dept = scan.next();
					
					String sql 
						= "INSERT INTO STUDENT (STU_NO, STU_NAME, STU_DEPT) "
						+ "VALUES ('" + stuNo + "', '" + name + "', '" + dept + "')";
					System.out.println(sql);
						
					
					int num = stmt.executeUpdate("INSERT INTO STUDENT (STU_NO, STU_NAME, STU_DEPT) "
							+ "VALUES ('" + stuNo + "', '" + name + "', '" + dept + "')");
							
					if(num == 0) {
						System.out.println("추가할 대상이 존재하지 않습니다.");
					} else {
						System.out.println("추가되었습니다.");
					}
					
				} else if(menu == 2) {
					System.out.print("학번 입력 : ");
					String stuNo = scan.next();
					// 학번을 가진 학생 조회
					ResultSet rs =  stmt.executeQuery("SELECT * FROM STUDENT WHERE STU_NO = '" + stuNo + "'");
					if(rs.next()) { // 유니크한 값을 검색하므로 검색 결과는 1개 혹은 없다
						System.out.println("수정할 데이터 선택 ");
						System.out.print("(1) 이름 (2) 학과 (3) 키 => " );
						int column = scan.nextInt();
						if(column > 3 || column < 1) {
							System.out.println("없는 정보입니다.");
							continue;
						}
						System.out.print(colKor[column-1] + " 입력 : ");
						String value = scan.next();
						stmt.executeUpdate("UPDATE STUDENT SET " + colEng[column-1] + " = '" + value + "' " + "WHERE STU_NO = '" + stuNo + "'");
						System.out.println("수정되었습니다.");
					} else {
						System.out.println("해당 학번을 가진 학생 없음");
					}
					
				} else if(menu == 3) {
					
				} else if(menu == 4) {
					
				} else if(menu == 5) {
					System.out.println("종료되었습니다.");
					break;
				} else {
					System.out.println("없는 메뉴 입니다.");
				}
			}
			

		
		
		} catch (Exception e) {
			
		}		
	}
}
