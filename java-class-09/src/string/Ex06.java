package string;

public class Ex06 {

	public static void main(String[] args) {
		// toLowerCase : ���ڿ��� �빮�ڸ� �ҹ��ڷ� ��ȯ
		String str1 = "abcDEF";
		System.out.println("toLowerCase : " + str1.toLowerCase());
		
		// toUpperCase : ���ڿ��� �ҹ��ڸ� �빮�ڷ� ��ȯ
		String str2 = "abcDEF";
		System.out.println("toUpperCase : " + str2.toUpperCase());
		
		// trim : ���ڿ��� �� �� ������ �����ش�.
		String str3 = "                  java java 				java 				";
		System.out.println("trim : " + str3.trim());

	}

}
