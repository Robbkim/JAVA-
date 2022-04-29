package inner;


// 로컬클래스 예제

class LocalEx {
	
	void method() {
		
		class LocalInner {
			
			int x = 100;    //필드
			//static int y = 200; // static은 사용할 수 없다.
			
			void disp() {    // 메서드
				System.out.println("methodInner x : " + x);
			}
			
		}
		
		LocalInner inner = new LocalInner();
		inner.disp();
		
		
		
		
		
	}
}


public class Ex04 {

	public static void main(String[] args) {
		
		LocalEx ex = new LocalEx();
		ex.method();
		
		
	}

}
