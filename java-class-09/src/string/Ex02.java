package string;

public class Ex02 {

	public static void main(String[] args) {
		// �ڹٿ��� ���ڿ��� �⺻Ÿ������ ��ȯ�ϴ� ���
		
		String str = "10";
		System.out.println(Byte.parseByte(str));
		System.out.println(Short.parseShort(str));
		System.out.println(Integer.parseInt(str));
		System.out.println(Long.parseLong(str));
		
		str = "10.1";
		
		System.out.println(Float.parseFloat(str));
		System.out.println(Double.parseDouble(str));
		
		str = "true";
		System.out.println(Boolean.parseBoolean(str));
		

	}

}

