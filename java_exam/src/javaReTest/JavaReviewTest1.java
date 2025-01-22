package javaReTest;

public class JavaReviewTest1 {
//		1. 자바 클래스와 객체에 대한 설명 중 틀린 것은?
//		정답은 4번 : 클래스 내에서는 private로 선언하여 다른 클래스에서 접근을 못하게 하는것이 좋다!!
//
//			1. 클래스 바깥에 전역 변수는 선언할 수 없다.
//			2. 클래스는 객체를 생성하기 위한 틀이다.
//			3. 클래스의 멤버 변수를 필드라고 부르며, 클래스는 필드와 메소드로 이루어진다.
//			4. 필드는 클래스 내에서 private 보다 public으로 선언하는 것이 바람직하다.
//			
//		2. 생성자에 대한 설명 중 틀린 것은?
//		정답은 4번 : return은 독립적으로 사용가능 이때 return은 해당 메소드를 빠져나간다
//
//			1. 생성자가 작성되어 있지 않으면, 컴파일러가 자동으로 기본 생성자를 추가해준다.
//			2. 생성자의 이름은 클래스의 이름과 반드시 같아야 한다.
//			3. this()는 생성자 내에서 다른 생성자를 호출하는 코드이다.
//			4. 생성자에서는 아무 값도 리턴하지 않기 때문에 return문을 사용할 수 없다.
//
//		3. 다음 코드 중 오류가 있는 것은?
//		정답은 3번
//
//			1. Power []p = new Power[10];    
//			2. Power p[] = new Power[10];    
//			3. Power p[10] = new Power[10];    
//			4. Power[] p;
//
//		4. 다음 코드에 대해 설명하는 문항 중 틀린 것은?
//		정답은 2번 : 객체가 아니라 10개의 공간만 생성한것
//	
//			Book[] book = new Book[10];
//			1. book은 배열에 대한 레퍼런스이다.
//			2. Book 객체가 10개 만들어진다.
//			3. for(int i=0; i<book.size; i++) book[i] = new Book();로 객체들을 만들어야 비로소 배열이 완성된다.
//			4. book[0], book[1], ... , book[9] 모두 Book 객체에 대한 레퍼런스이다.
//
//		5. 다음 중 메소드 오버로딩에 실패한 사례는?
//		정답 : 1번은 매개변수 개수와 타입이 같으므로 오버로딩이 아니다. 리턴타입으로는 구분하지 않는다.
//	
//			(1) class A{
//		            int x;
//		            void f(int a) { x = a; }
//		            int f(int b) { return x+b; }
//				}
//				 
//			(2) class A{
//						int x;
//						void f(int a ) { x = a; }
//						void f() { x = 0; }
//				}
//				 
//			(3) class A {
//						int x;
//						inf f() { return x; }
//						int f(int a, int b) { return a+b; }
//				}
//				 
//			(4) class A {
//						static int x=0;
//						static int f(int a) { return a+x; }
//						static int f() { return 3; }
//				}
//
//
//		6. 다음 코드에 대해 답하라.
//
//			class TV {
//			   int size;
//			   String manufacturer;
//			   public TV() {
//				  size = 32;
//				  manufacturer = "LG";
//				  System.out.println(size+"인치 "+manufacturer);
//			   }
//			   public TV(String manufacturer) {
//				  this.size = 32;
//				  this.manufacturer = manufacturer;
//				  System.out.println(size+"인치 "+manufacturer);
//			   }
//			   public TV(int size, String manufacturer) {
//				  this.size = size;
//				  this.manufacturer = manufacturer;
//				  System.out.println(size+"인치 "+manufacturer);
//			   }
//			}
//
//		 (1) this()를 이용하여 생성자를 수정하라
//			정답 : 
//	
//		 (2) new TV();와 new Tv("삼성"); 를 실행하면 실행 결과는 각각 무엇인가?
//			정답 : 32인치 LG, 32인치 삼성 
//	
//		 (3) 65인치 "삼성" TV 객체를 생성하는 코드를 적어라.
//			정답 : 
//	
//		 (4) this()를 이용하는 장점은 무엇인가?
//		 
//		7. 다음 클래스에는 컴파일 오류가 있다. 오류 부분을 지적하고 오류를 수정할 수 있는 방법을 모두 제시하라. 
//		그리고 그중 객체 지향 프로그래밍에 가장 적합한 방법을 설명하라.
//		정답 : private 으로 선언되어 있어서 get, set 메서드를 이요해야 한다.
//			class Person {
//				private int age;
//			}
//			public class Example {
//				public static void main (String args[]) {
//					Person aPerson = new Person();
//					aPerson.age = 17;
//				}
//			}
	
//		8. 다음 코드를 객체 지향 프로그래밍 관점에서 바람직한 코드로 수정하라.
//		정답 : class Power의 변수를 private으로 선언하는것이 바람직
//				생성자를 통하거는 set 메서드를 이용하여 data 값을 넣느다.
//			class Power {
//				public int kick;
//				public int punch;
//			}
//			public class Example {
//				public static void main (String args[]) {
//					Power robot = new Power();
//					robot.kick = 10;
//					robot.punch = 20;
//				}
//			}
//
//		9. 다음 코드가 실행될 때 가비지가 발생하는가? 만일 발생한다면 발생하는 위치와 과정을 설명하라.
//			(1) String s = null;
//				  for(int n=0; n<10; n++) {
//						s = new String("Hello"+n);
//						System.out.println(s); 
//				  }
//			정답 : 배열이 아니라 변수 하나에 data에 넣었기 때문에 총 10개중 9개의 가비지 발생
//				  
//			(2) String a = new String("aa");
//				  String b = a;
//				  String c = b;
//				  a = null;
//				  b = null;  
//			정답 : 가비지 없다!
//	
//		10. 다음 클래스에서 멤버 함수의 사용이 잘못된 것은?
//			class StaticTest {
//				static int a;
//				static int getA() { return a; } //(1)
//				int b;
//				int getB() { return b; } //(2)
//				int f() { return getA(); } //(3)
//				static int g() { return getB(); } //(4)
//			정답 : 정답은 4번 static은 객체 생성없이 사용가능 getB()는 non-static 이므로 객체생성 후 사용 가능
//	

}
