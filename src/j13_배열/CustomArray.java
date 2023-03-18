package j13_배열;

public class CustomArray { //문자열을 담을 수 있는 배열을 만듬
	private String[] strArray;
	
	public CustomArray() {
		strArray = new String[0];
	}
	
	private void strArraySizeUp() {
		
		String[] tempStrArray = new String[strArray.length + 1]; //임시로 만든 배열의 크기를 하나씩 늘려감
		for(int i = 0; i < strArray.length; i++) { //배열의 값은 그대로 옮기며 공간만 하나씩 늘려감
			tempStrArray[i] = strArray[i];
		}
		strArray = tempStrArray;
	}
	
	public void add(String str) { //add를 이용해 문자열을 받음.
		strArraySizeUp(); //이 메소드를 이용해 기존의 배열 + 1 크기로 받을 수 있음
		strArray[strArray.length - 1] = str;
	}

	public String[] getStrArray() {
		return strArray;
	}
	
	
	
}
