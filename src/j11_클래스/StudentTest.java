package j11_클래스;

public class StudentTest {

	public static void main(String[] args) {
		new Student_J11(); //Student_J11 Object 생성 (인스턴스를 만들어 냄.)\
		
		System.out.println(new Student_J11());
		System.out.println(new Student_J11());
		
		int num = 10;
		
		Student_J11 s1 = new Student_J11();
		s1.schoolName = "부산대학교";
		s1.name = "홍길동";
		System.out.println(s1.schoolName);
		
		Student_J11 s2 = new Student_J11();
		s2.name = "척준경";
		s2.schoolName = "부경대학교";
		System.out.println(s2.schoolName);
		
//		Student_J11 s3 = null;
//		
//		s3.goToSchool();
		
		s1.goToSchool();
		s2.goToSchool();
		
	}

}
