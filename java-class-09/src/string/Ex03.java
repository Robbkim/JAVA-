package string;

public class Ex03 {

	public static void main(String[] args) {
		// String �����ڷ� String ��ü �����ϱ�
		
		// �迭 ��ü�� String ��ü�� �����ϱ�
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		

		// �迭�� �ε��� ��ġ���� length��ŭ String ��ü�� �����ϱ�
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		// ���ڿ��� byte �迭�� ��ȯ�ϱ�
		String str3 = "Hello Java";
		
		byte[] byteArray = str3.getBytes();
		
		for(byte arr : byteArray) {
			System.out.print(arr + "  ");
		}
		
		
	}

}
