package j12_상속_다형성;

import j12_상속.Animal;
import j12_상속.Human;
import j12_상속.Tiger;

public class AnimalTest {

	public static void main(String[] args) {
		Human human = new Human();
		Animal animal = human; //업캐스팅
		
		animal.move();
		Human human2 = (Human)animal; //다운캐스팅
		human2.readBooks();
		
		//////////////////////////////////////////////////////////////
		
		Animal[] animals = new Animal[3]; //Animal에 대한 배열을 만들어 냄
		
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Tiger();
		
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i]);
			
			animals[i].move();
			
			if(animals[i] instanceof Human) { //객체에 맞게끔 다운캐스팅을 함 (instanceof = 생성된 객체)인지 물음
//				Human h = (Human)animals[i]; 변수를 이용한 방법
//				h.readBooks();
				((Human)animals[i]).readBooks();
			}else if(animals[i] instanceof Tiger) {
				((Tiger)animals[i]).hunting();
			}else {
				System.out.println("다운캐스팅을 할 수 없습니다.");
			}
//			((Human)animals[i]).readBooks(); 객체에 맞는 다운캐스팅이 아니기 때문에 오류가 뜸 
		}
	}

}
