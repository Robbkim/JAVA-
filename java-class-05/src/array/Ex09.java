package array;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// 값을 입력받아 인덱스 구하기
		
		int[] array = {10, 20, 30, 40, 50};
		Scanner scan = new Scanner(System.in);
		
		System.out.println("array 배열의 값은 10, 20, 30, 40, 50 입니다. ");
		System.out.println("값을 입력하세요");
		int value = scan.nextInt();
		
		int i = 0;
		
		while(i < array.length) {
			
			if(array[i] == value) {
				System.out.println(value + "의 인덱스는 : " + i);
				
			}
			
			i++;
		}
		
		scan.close();
	}

}
