package operation;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 두 실수를 입력받은 후 사칙연산 계산하기
		
		Scanner scan = new Scanner(System.in);
				
		double a, b;
						
		System.out.print("첫번째 수를 입력 : ");
		a = scan.nextDouble();
		
		System.out.print("두번째 수를 입력 : ");
		b = scan.nextDouble();
		
		System.out.printf("%.2f + %.2f = %.2f\n", a, b, a + b);
		System.out.printf("%.2f - %.2f = %.2f\n", a, b, a - b);
		System.out.printf("%.2f * %.2f = %.2f\n", a, b, a * b);
		System.out.printf("%.2f / %.2f = %.2f\n", a, b, a / b);
		
		scan.close();
		
	}

}
