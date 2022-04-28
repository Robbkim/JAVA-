package condition;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 정수를 입력받아 홀수 인지 짝수인지 알아보기
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력 : ");
		int a= scan.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
			
		scan.close();	
		
		
		
		
	}

}
