package j13_배열;

public class ArrayTest {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "c";
		String str3 = "python";
		String str4 = "html";
		String str5 = "javascript";
		
		String[] strArray = new String[5]; //String배열 /0번째 부터 시작
		strArray[0] = "java";
		strArray[1] = "c";
		strArray[2] = "python";
		strArray[3] = "html";
		strArray[4] = "javascript";
		
		for(int i = 0; i < strArray.length; i++) { //length로 String배열에 크기를 지정 한 값을 가져옴
			System.out.println(strArray[i]);
		}

//////////////////////////////////////////////////////////////////////////////////////////////////		
		
		int[] numArray = new int[100];  //int배열
		
		for(int i = 0; i < numArray.length; i++) {
			numArray[i] = i + 1;
		}
		
		for(int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
	}

}
