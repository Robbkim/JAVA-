package wrapper;

public class Ex01 {

	public static void main(String[] args) {
		
		// �Ű������� ��ü�� �䱸�Ǵ� ���
		// �⺻���� �ƴ� ��ü�� �����ؾ� �ϴ� ���
		// ��ü���� �񱳰� �ʿ��� ��� � wrapper Ŭ������ ���δ�.
		// �ڹ� Collection �������̽��� ��ü�� ����ϱ� ������
		// �⺻Ÿ���� ��ü�� ����ؾ� �ϴ� ��찡 �ִ�.
		
		int a = 5; // �⺻Ÿ�� ����
		
		Integer b = new Integer(a);
		// �⺻Ÿ���� ���� ���尴ü�� �����.(�ڽ�)
		
		Integer c = 5; // �ڵ��ڽ�
		
		int d = c.intValue();
		// �ڽ̵� ���尴ü���� �ٽ� �⺻Ÿ���� ���� ��´�. (��ڽ�)
		// ��ü.�⺻Ÿ���̸� + Value();
		
		 int e = c; // �ڵ���ڽ�

	}

}
