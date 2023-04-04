package j16_스태틱;

import java.time.LocalDate;

public class KIA {
	private static KIA instance; //static으로 인스턴스 변수를 만들어냄
	private String companyName;
	private int serialNumber;
	
	private KIA() { //private로 생성자를 만듬 외부 접근 차단
		companyName = "KIA";
		serialNumber = LocalDate.now().getYear() * 10000;
	}
	
	public static KIA getInstance() { //getInstance라는 스태틱 메소드가 무조건 필요
		if(instance == null) { //값이 없는지 확인
			instance = new KIA();
		}
		return instance;
	}
	
	public Car createCar(String model) {
		return new Car(++serialNumber, companyName, model);
	}
	
}
