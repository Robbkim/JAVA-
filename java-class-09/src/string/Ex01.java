package string;


// 자바 api 문서
// https://docs.oracle.com/javase/8/docs/api



public class Ex01 {

	public static void main(String[] args) {
		
		// String은 클래스이다!!
		// 문자열은 굉장히 많이 쓰이기 때문에 자바에서는 String 클래스를
		// 기본형과 같은 형식으로 쓸수 있도록 해두었다.
		
		String str1 = "hello";
		String str2 = "hi";
		String str3 = "hello";
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		System.out.println();
		
		String str4 = new String("java");
		String str5 = new String("java");
		
		System.out.println(str4 == str5); // false
		System.out.println(str4.equals(str5)); // true
		
		
		
		
		
	}

}
