package j17_최상위클래스.repository.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder //디자인 패턴 중 하나 (싱글톤) *생성패턴
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	private String userName;
	private String password;
	private String name;
	private String email;
	
//	public static User builder() {
//		return new User();
//	}
//	
//	public User username(String username) {
//		this.userName = username;
//		return this;
//	} 
//	public User password(String password) {
//	this.password = password;
//	return this;
//  } 
//	User.builder().username("cheol").password("1234")	
//	이게 빌더패턴 안에 묶여 있음 (생략되어 있음)
}
