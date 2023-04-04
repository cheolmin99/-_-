package j16_스태틱;

public class Student {
	private static int SCAutoIncrement;  //SCAutoIncrement = 자동으로 숫자 증가.
	private int studentCode = 20230000;
	private String name;
	
	public Student(String name) {
		studentCode += ++SCAutoIncrement; 
		this.name = name;
	}
	
	public void studentInfo() {
		System.out.println("학번: " + studentCode);
		System.out.println("이름: " + name);
	}
}
