package api;

public class Ex05 {

	public static void main(String[] args) {
		
		int a = Math.abs(-10);
		// abs()�޼ҵ�� ���ڷ� �ѱ� �������� ���밪�� ��ȯ
		System.out.println(a);
		
		int b = Math.max(1, 9);
		// max() �޼ҵ�� ���޵� ������ �� �� ū ���� ��ȯ
		System.out.println(b);
		
		int c = Math.min(1, 9);
		// min() �޼ҵ�� ���޵� ������ �� �� ���� ���� ��ȯ
		System.out.println(c);
		
		double d = Math.random();
		// 0.0 ���� 1.0�̳��� ������ �� �ϳ��� ��ȯ
		System.out.println(d);
		
		double e = Math.ceil(1.1);
		// ���޵� �����͸� �ø��Ͽ� ��ȯ
		System.out.println(e);
		
		double f = Math.floor(1.9);
		// ���޵� �����͸� �����Ͽ� ��ȯ
		System.out.println(f);
		
		long g = Math.round(5.3);
		long h = Math.round(5.7);
		// ���޵� �����͸� �ݿø��Ͽ� ��ȯ
		System.out.println(g);
		System.out.println(h);
		
		
		
	}

}
