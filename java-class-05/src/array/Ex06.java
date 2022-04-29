package array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		
		int[] array = new int[5];
		
		// 정수 5개를 입력받아
		// 입력받은 정수 중에서 3의 배수만 출력하세요
		
		Scanner scan = new Scanner(System.in);
		
		
		// 입력받기
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.print(i+1 + "번째 정수를 입력하세요 : ");
			array[i] = scan.nextInt();
			
		}
		// 3의 배수만 출력하기
		
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] % 3 == 0) {
				System.out.print(array[i] + "  ");
			
		}
		
		scan.close();

	}
	}
}
