package j13_배열;

public class ArrayTest2 {

	public static void main(String[] args) {
		//배열을 선언 후 값을 초기화
		int [] numbers = new int[5];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		//numbers[5] = 70; 에러 선언된 값보다 초과.
		
		String[] names = {"이철민", "홍길동", "척준경", "이순신"}; //생성과 동시에 선언까지
		
		System.out.println(names[0]);
	}

}
