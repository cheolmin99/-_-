package j10_메소드;

import java.util.Scanner;

public class Method2 {
	/*
	 * 윤년 계산을 메소드를 이용해서 만들기
	 * 변수 = year
	 * 
	 * calcLeapYear()
	 * 
	 * year1 = 윤년입니다.
	 * year2 = 윤년이 아닙니다.
	 * year3 = 윤년입니다.
	 * 
	 * 
	 */
//	static void calcLeapYear(int year) {
//		if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
//			System.out.println(year + "년도는 윤년입니다.");
//		}else {
//			System.out.println(year + "년도는 윤년이 아닙니다.");
//		}
//	} 리턴값이 없을 때
	static boolean calcLeapYear(int year) {
		boolean result = false;
		
		if(year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
			result = true;
			}
		return result;
	}
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int year1 = 0;
//		int year2 = 0;
//		int year3 = 0;
//		
//		System.out.println("년도1 입력: ");
//		year1 = scanner.nextInt();
//		System.out.println("년도2 입력: ");
//		year2 = scanner.nextInt();
//		System.out.println("년도3 입력: ");
//		year3 = scanner.nextInt();
//		
//		calcLeapYear(year1);
//		calcLeapYear(year2);
//		calcLeapYear(year3); 리턴값이 없을 때
		
		Scanner scanner = new Scanner(System.in);
		int year1 = 0;
		int year2 = 0;
		int year3 = 0;
		
		System.out.println("년도1 입력: ");
		year1 = scanner.nextInt();
		System.out.println("년도2 입력: ");
		year2 = scanner.nextInt();
		System.out.println("년도3 입력: ");
		year3 = scanner.nextInt();
		
		String result1 = calcLeapYear(year1) ? "윤년입니다." : "윤년이 아닙니다.";
		String result2 = calcLeapYear(year2) ? "윤년입니다." : "윤년이 아닙니다.";
		String result3 = calcLeapYear(year3) ? "윤년입니다." : "윤년이 아닙니다.";
		
		System.out.println("year1은" + result1);
		System.out.println("year2은" + result2);
		System.out.println("year3은" + result3);
	}

}
