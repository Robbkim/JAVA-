package loop2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {

		// 커피숍 주문받기
		
		Scanner scan = new Scanner(System.in);
		
		int menu;
		
		do {
			
			System.out.println("손님 주문하시겠습니까?");
			System.out.println("(1)아메리카노 (2)카페라떼 (3)핫초코 (4)그만주문할게요");
			
			menu = scan.nextInt();
			
			switch(menu) {
			
			case 1 :
				System.out.println("#아메리카노 주문하셨습니다.");
				break;
			case 2 :
				System.out.println("#카페라떼 주문하셨습니다.");
				break;
			case 3 :
				System.out.println("#핫초코 주문하셨습니다.");
				break;
			case 4 : 
				System.out.println("#그만 시킬래요");
				break;
			default :
				System.out.println("잘못 주문 하셨습니다.");
			}
			
		}while(menu != 4);
		
		scan.close();
	}

}
