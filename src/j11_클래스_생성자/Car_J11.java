package j11_클래스_생성자;

public class Car_J11 {
	
	String company; //전역변수
	String model;
	String color;
	
	Car_J11() { //리턴 자료형이 없고 클래스 이름과 같은 메소드 //기본 생성자 (no argument constructor)
		System.out.println("생성자 호출?"); //호출이 끝나면 주소를 생성 (리턴값이 주소)
		
	}
	
	Car_J11(int num, int num2) { //생성자 오버로딩도 가능 //사용자 지정 생성자 (argument constructor)
		System.out.println(num + num2);
		
	}
	
	Car_J11(String company /*지역변수*/, String model, String color) { //전체 생성자 (All argument constructor) 지역변수가 전역변수보다 높음
		this.company = company; //this는 자기 자신의 주소 (Car_J11 의 같은 이름을 가진 변수를 대입하라.)
		this.model = model;
		this.color = color;
		System.out.println(this);
	}
	
	
}
