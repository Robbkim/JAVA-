package wrapper;

public class Ex03 {

	public static void main(String[] args) {
		// ���ڿ��� �⺻������ �ٲܶ�
		// parseInt : ���ڿ� >> �⺻��(����)
		// valueOf : ���ڿ� >> wrapper Ŭ����
		
		String str = "100";
		
		Integer value1 = Integer.valueOf(str);
		System.out.println(value1.intValue());
		
		int value2 = Integer.parseInt(str);
		System.out.println(value2);
		
		// JDK 1.5���� �ڵ��ڽ�, �ڵ���ڽ��� �����Ǿ�
		// ��ȯ���� �⺻�� �϶��� wrapper Ŭ�����϶��� ���̰� ��������.
		
		
		
	}

}
