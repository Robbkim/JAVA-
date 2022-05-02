package collection;

import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		// List : �����͸� �Ϸķ� �þ���� �ڷᱸ��
		// ������ �ߺ����, ���� �߿�
		
		list.add(new String("ȫ�浿"));
		// ��Ģ : new �����ڸ� �̿��ؼ� �ִ´�.
		list.add("������");
		list.add("�̸���");
		
		int size = list.size(); //����Ǿ� �ִ� ��ü ��ü�� ���� ����
		
		System.out.println("�� ��ü �� : " + size);
		
		for(String str1 : list) { //���� for��
			System.out.println(str1);
			
			
		}
		System.out.println();
		
		list.add(0, "�̼���"); //index 0���� ���� �ִ´�.
		// �̼��� ȫ�浿 ������ �̸���
		list.add(2, "�庸��"); // index 2���� ���� �ִ´�.
		// �̼��� ȫ�浿 �庸�� ������ �̸���
		
		list.set(0, "�������"); // index 0���� ���� ��ü�Ѵ�.
		// ������� ȫ�浿 �庸�� ������ �̸���
		
		String str2 = list.get(2); // index 2���� ��ü�� ����
		
		System.out.println("2 : " + str2);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(1); //index 1���� ��ü ����
		list.remove("�庸��"); // "�庸��" ��ü�� �����Ѵ�.
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.clear(); //����� ��� ��ü�� �����Ѵ�.
		
		System.out.println(list.isEmpty());
		// boolean Ÿ������ ��������� true, ��ü�� ������ false�� ��ȯ
		
		

	}

}
