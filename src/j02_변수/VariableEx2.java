package j02_변수;

public class VariableEx2 {

	public static void main(String[] args) {
		/*
		 * 문제1.
		 * 이름: 이철민
		 * 문자형 변수 firstName
		 * lastName1
		 * lastName2
		 */
		char firstName1 = '철';
		char firstName2 = '민';
		char lastName = '이';
		System.out.print("이름: ");
		System.out.print(lastName);
		System.out.print(firstName1);
		System.out.print(firstName2);
		
		System.out.println();
		
		System.out.println("이름: "+lastName+firstName1+firstName2);
		System.out.println(lastName);
		System.out.println("" + lastName + firstName1 + firstName2);
		//+의 연산자 때문에 값이 숫자로 나옴. 그래서 앞에 문자열을 붙여줘야 제대로 출력 됨.
		
		char alphabet_a = 'a';
		System.out.println(alphabet_a + 1);
		
	}

}
