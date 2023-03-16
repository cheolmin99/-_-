package j11_클래스_접근지정;

public class User_J11 {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public User_J11() {
		//constructor 기본생성자 생성을 안 하고 전체생성자만 있으면 기본생성자를 사용할 수 없음 생략은 가능하나 만들어 둬야함
	}
	
	
	public User_J11(String username, String password, String name, String email) { //전체 생성자
		//super(); 생략가능
		this.username = username;
		this.password = password;
		this.name = name;
		this.email = email;
	}


//	void test() {
//		this.username = "cheolmin"; //private는 같은 클래스 안에서만 접근 가능
//		//public = 접근 제한 없음 
//		//protected = 같은 패키지, 상속받은 클래스 내부
//		//default = 같은 패키지
//		//private = 같은 클래스 
//	}
	
	//getter, setter <- 메소드
	public void setUsername(String username) { //전달하는 역할 값을 셋팅. 리턴자료형x
		this.username = username;
	}
	
	public String getUsername() { //값을 가져오는 역할 리턴자료형 필요
		return username;
	}
	//getter, setter 단축키 alt, shift, s
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
