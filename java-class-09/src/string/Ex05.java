package string;

public class Ex05 {

	public static void main(String[] args) {
		
		// startsWith : ���ڿ��� ������ ���ڷ� �����ϴ��� �Ǵ� ��
		// ������ true��ȯ �ƴϸ� false ��ȯ (��ҹ��ڱ���)
		String str = "apple";
		System.out.println("startsWith  :  " + str.startsWith("a"));
		
		// endsWith : ���ڿ� �������� ������ ���ڰ� �ִ��� �Ǵ� ��
		// ������ true �ƴϸ� false�� ��ȯ (��ҹ��� ����)
		System.out.println("endsWith : " + str.endsWith("e"));
		
		// equals : �� ���� String�� ������ ���ؼ� ������ true
		// �ٸ��� false�� ��ȯ (��ҹ��� ����)
		String str1 = "java";
		String str2 = "java";
		System.out.println("equals : " + str1.equals(str2));
		

	}

}
