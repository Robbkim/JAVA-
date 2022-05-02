package api;

import java.util.Calendar;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.printf("��ȸ�� �⵵�� �Է� : ");
		int year = scan.nextInt();
		
		System.out.printf("��ȸ�� ���� �Է� : "); 
		int month = scan.nextInt();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, month -1, 1);
		// ������ �⵵�� ���� �׸��� �ش���� 1�Ϸ� �ʱ�ȭ
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// Calendar.DAY_OF_WEEK ���� ������ �ǹ�
		// 1~7������ ���� ���� (�� ~ �� ������ �ǹ�)
		
		int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// �ش���� ��Ÿ�� �� �ִ� �ִ� ��¥���� ����
		
		System.out.println("week :" + week + ", lastDay :" + lastDay);
		
		System.out.println("\t\t" + year + "�� " + month + "��");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		for(int i = 1; i< week; i++) {
			System.out.print("\t");
			
		}
		
		for(int i = 1; i <= lastDay; i++) {
			
			System.out.print(i + "\t");
			week++;
			if(week > 7) {
				week = 1;
				System.out.println();
			}
		}

		scan.close();
	}

}
