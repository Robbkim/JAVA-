package string;

public class Ex04 {

	public static void main(String[] args) {
		// String �޼ҵ�
		
		String str = "Hello world";
		
		// charAt : �ش� ��ġ�� �����ϳ��� char������ ��ȯ
		System.out.println("charAt : " + str.charAt(0));

		// isEmpty : �ش� ������ ��������� true�� �ƴϸ� false�� ����
		System.out.println("isEmpty : " + str.isEmpty());
		
		// length : ���ڿ��� ���̸� ��ȯ
		System.out.println("length : " + str.length());
		
		// toCharArray : ���ڿ��� �� ���ھ� char�迭�� ��ȯ
		char[] array = str.toCharArray();
		for(char arr : array) {
			System.out.print(arr + "  ");
		}
		System.out.println();
		
		// replace : ���ڿ��� ��ü
		System.out.println(str.replace("Hello", "Hi"));
		
	}

}
