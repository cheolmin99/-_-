package j17_최상위클래스.repository;

import j17_최상위클래스.repository.user.User;

public class UserArray { //문자열을 담을 수 있는 배열을 만듬
	private User[] userArray;
	
	public UserArray() {
		userArray = new User[0];
	}
	
	private void userArraySizeUp() {
		
		User[] tempuserArray = new User[userArray.length + 1]; //임시로 만든 배열의 크기를 하나씩 늘려감
		for(int i = 0; i < userArray.length; i++) { //배열의 값은 그대로 옮기며 공간만 하나씩 늘려감
			tempuserArray[i] = userArray[i];
		}
		userArray = tempuserArray;
	}
	
	public void add(User user) { //add를 이용해 문자열을 받음.
		userArraySizeUp(); //이 메소드를 이용해 기존의 배열 + 1 크기로 받을 수 있음
		userArray[userArray.length - 1] = user;
	}

	public User[] getuserArray() {
		return userArray;
	}
	
	
	
}
