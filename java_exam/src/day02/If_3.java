package day02;

public class If_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다중 else ~ if
		// score가 90~100 -> A
		// score가 80~89 -> B
		// score가 70~79 -> C
		// score가 70미만 -> C
		
		int score = 85;
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else 
			System.out.println("F");
		}

	}


