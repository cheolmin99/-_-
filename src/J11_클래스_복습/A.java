package J11_클래스_복습;

public class A {
	int num;
	int num2;
	
	public A() {
		//기본 생성자 생성 
		System.out.println("기본 생성자 생성");
	}
	
	public A(int num) {
		System.out.println("사용자 지정 생성자");
		this.num = num;
	}
	
	public A(int num, int num2) {
		System.out.println("전체 생성자");
		this.num = num;
		this.num2 = num2;
	}

	void printNumAndNum2() {
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
	}
}
