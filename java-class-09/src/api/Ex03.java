package api;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {


		long time1 = System.currentTimeMillis();
		// ����ð��� �о �и������尪�� long���� �ش�.
		System.out.println(time1);
		
		long time2 = System.nanoTime();
		// ����ð��� �о ���뼼���尪�� long���� �ش�.
		System.out.println(time2);
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("�ý��� �����ұ��? 1. Yes 2. NO");
			int choice = scan.nextInt();
			if(choice == 1) {
				System.exit(0);
			}else {
				System.out.println("�ý����� ��� ���ư��ϴ�.");
			}
		}

	}

}
