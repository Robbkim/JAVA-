package condition;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 정수 3개를 입력받아 최대값, 최소값, 평균을 구해보자
		
		Scanner scan = new Scanner(System.in);
		
		int num1, num2, num3;
		int max, min;
		
		System.out.print("첫번째 숫자를 입력하시오 : ");
		num1 = scan.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오 : ");
		num2 = scan.nextInt();
		
		System.out.print("세번째 숫자를 입력하시오 : ");
		num3 = scan.nextInt();
	
		if(num1 > num2 && num1 > num3) {
			max = num1;
		}else if (num2 > num3) {
			max = num2;
		}else {
			max = num3;
		}
		
		
		if(num1 < num2 && num1 < num3) {
			min = num1;
		}else if (num2 < num3) {
			min = num2;
		}else {
			min = num3;
		}
		
		double avg = (num1 + num2 + num3) / 3.0;
		
		System.out.println("최대값은 :" + max);
		System.out.println("최소값은 :" + min);
		System.out.println("평균은 :" + avg);
		
		
		
		scan.close();
		
		
	}

}
