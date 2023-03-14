package j10_메소드;

public class Method1 {
//	int sum(int x, int y) {
//		int result = x + y;
//		
//		return result;
//	}
	static int sum(int x, int y) {
		return x + y;
	}
	
	static boolean oddOreEven(int num) {
		boolean result = false;
		if(num % 2 !=0) {
			return true;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(10, 20));
		int num = sum(20, 30);
		System.out.println(num);
		boolean tAndF = oddOreEven(10);
		System.out.println(tAndF);
	}
}
