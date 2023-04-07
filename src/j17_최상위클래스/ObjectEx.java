package j17_최상위클래스;

import j16_스태틱.Student;

public class ObjectEx { //Object는 기본적으로 붙어있어 생략되어 있다. Ex) extends Object
	public static void main(String[] args) {
		Object obj = new Object();
		String toString = obj.toString();
		System.out.println(toString);
		
		Student student = new Student("이철민");
		System.out.println(student);
		
		User user = new User(20220001, "cheolmin", "1234" , "이철민" , "cjfals8570@naver.com");
		User user2 = new User(20220001, "cheolmin", "1234" , "이철민" , "cjfals8570@naver.com");
		System.out.println(user = user2); //주소비교라 false
		System.out.println(user.equals(user2)); //일반적으론 false가 출력 오버라이딩, 업캐스팅을 이용해 true 출력
		System.out.println(user.hashCode() == user.hashCode());
		Object o = user2;
		
		
	}
	
}
