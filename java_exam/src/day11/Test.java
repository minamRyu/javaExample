package day11;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕\t하세요"); // \t 는 탭만큼 띄어쓰기
		System.out.println("안녕\n하세요"); // \n 은 줄바꿈
		System.out.println("안녕\\하세요"); // \ 출력은 앞에 \ 붙이기
		System.out.println("\"안녕\\하세요\""); // " 출력은 앞에 \ 붙이기
		
		
		String a = new String(" C#");
		String b = new String(",C++ ");
		
		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); // 문자열의 포함 관계
		
		a = a.concat(b); // 문자열 연결
		System.out.println(a);
		
		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a);
		
		a = a.replace("C#", "Java"); // 문자열 대치
		System.out.println(a);
		
		String s[] = a.split(","); // 문자열 분리
		for (int i = 0; i < s.length; i++)
			System.out.println("분리된 문자열" + i + ": " + s[i]);
		
//		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴, 많이 쓰이게 된다 참조
		a = a.substring(1, 4);  // 1(포함)부터 4(포함 안하고)까지, 이게 제일 많이 쓰임
		System.out.println(a);
		
		char c = a.charAt(2); // 인덱스 2의 문자 리턴
		System.out.println(c);
	}

}
