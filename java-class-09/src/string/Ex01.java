package string;


// �ڹ� api ����
// https://docs.oracle.com/javase/8/docs/api



public class Ex01 {

	public static void main(String[] args) {
		
		// String�� Ŭ�����̴�!!
		// ���ڿ��� ������ ���� ���̱� ������ �ڹٿ����� String Ŭ������
		// �⺻���� ���� �������� ���� �ֵ��� �صξ���.
		
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
