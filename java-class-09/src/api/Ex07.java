package api;

import java.util.Calendar;
import java.util.Date;

public class Ex07 {

	public static void main(String[] args) {
		
		Date now = new Date();
		// ���� �ý����� �ð����� ��ü�� ����
		// �� �ܴ� �� ������� �ʴ´�.
		System.out.println(now);
		
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("������ ��¥ :  : %d�� %d�� %d��\n", year, month, day);

		cal.get(Calendar.HOUR); // 12�ð���
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24�ð���
		
		int minute = cal.get(Calendar.MINUTE);
		
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("����ð� :   %d�� %d�� %d��", hour, minute, second);
		
	}

}
