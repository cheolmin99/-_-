package j04_형변환;

public class typeConversionEx2 {

	public static void main(String[] args) {
		// 최저 9160원
		// 4주 근무
		// 1,3주는 3일근무
		// 2,4주는 5일근무
		// 3,4주는 시급의 5%를 더 추가한다.
		// 하루 8시간 근무
		
		//월급을 구하시오.
		final int HOURTLY_WAGE = 9160;
		
		int monthlypay = 0;
		double bonus = HOURTLY_WAGE * 0.05;
		
		double week1 = HOURTLY_WAGE * 8 * 3;
		double week2 = HOURTLY_WAGE * 8 * 5;
		double week3 = (HOURTLY_WAGE + bonus) * 8 * 3;
		double week4 = (HOURTLY_WAGE + bonus) * 8 * 5;
		
		monthlypay = ((int)((week1 + week2 + week3 + week4)/10))*10; 
		//1201792 / 10
		//120179.2
		//int 형 변환 후 120179 * 10 = 1201790
		//직원의 월급은 0000원 입니다.
		System.out.println("직원의 월급은 " + monthlypay + "원입니다.");
		
		
	}

}
