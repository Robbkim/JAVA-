package string;

public class Ex06 {

	public static void main(String[] args) {
		// toLowerCase : 문자열에 대문자를 소문자로 변환
		String str1 = "abcDEF";
		System.out.println("toLowerCase : " + str1.toLowerCase());
		
		// toUpperCase : 문자열에 소문자를 대문자로 변환
		String str2 = "abcDEF";
		System.out.println("toUpperCase : " + str2.toUpperCase());
		
		// trim : 문자열에 앞 뒤 공백을 없애준다.
		String str3 = "                  java java 				java 				";
		System.out.println("trim : " + str3.trim());

	}

}
