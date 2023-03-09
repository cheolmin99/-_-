package j06_문자열;

public class StringEx1 {

	public static void main(String[] args) {
		char fn1 = '철';
		char fn2 = '민';
		char ln = '이';
		
		String name = "이철민";
		
		System.out.println("사용자 이름(char): " + ln + fn1 + fn2);
		System.out.println("사용자 이름: " + name);
		
		System.out.println(name.contains("이"));

	}

}
