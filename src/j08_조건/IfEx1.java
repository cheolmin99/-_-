package j08_조건;

public class IfEx1 {

	public static void main(String[] args) {
		/*
		 * if(조건식) 해당 조건이 참일때 실행문
		 */
		if(true) System.out.println("참 입니다");
		if(false) System.out.println("이쪽은 실행이 안 됨");
		else System.out.println("거짓일때 실행됨");
		//else 해당 조건이 거짓일 떄 실행
		
		if(true)
			if(true)
				if(true)
					if(true) System.out.println("참");
					else System.out.println("거짓");
		
		System.out.println("======================================");
		
		if(false) 
			{
			System.out.println("참");
			System.out.println("참?");
			}else {
				System.out.println("거짓");
			}
		
	}

}
