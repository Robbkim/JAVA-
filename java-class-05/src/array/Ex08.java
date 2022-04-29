package array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		
		// index를 입력받아 값 구하기
		
		int[] array = {100, 200, 300, 400, 500};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("array배열의 인덱스는 0 ~ 4 까지 입니다. ");
		System.out.println("인덱스를 입력하세요");
		int index = scan.nextInt();
		if(index < 0 || index > 4 ) {
			System.out.println("인덱스를 올바르게 입력하지 않았습니다.");
		}else {
			System.out.println("array[" + index + "] 의 값은 :" + array[index]);
		}
		
		
		
		
		scan.close();
		
		
	}

}
