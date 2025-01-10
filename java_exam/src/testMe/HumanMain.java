package testMe;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Human> list = new ArrayList<>();
		
		int humanNum = 0;
		while(true) {
			
			System.out.println("(1) 추가 (2) 확인 (3) 종료");
			int menuNum = scan.nextInt();
			if(menuNum == 1) {
				System.out.print("이름 : ");
				String name = scan.next();
				
				System.out.print("나이 : ");
				int age = scan.nextInt();
				
				System.out.print("주소 : ");
				String addr = scan.next();
				
				Human h = new Human(name, age, addr);
				list.add(h);
				humanNum++;
				continue;
			}
			if(menuNum == 2) {
				for(int j=0; j<humanNum; j++) {
					System.out.println("1. 이름 : " + list.get(j).getName() + ", "
							+ "2. 나이 : " + list.get(j).getAge() + ", "
							+ "3. 주소 : " + list.get(j).getAddr());
				}
			}
			if(menuNum == 3) {
				break;
			}
		}

	}

}
