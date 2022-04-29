package interface1;

interface Print {
	/*public abstract*/void printA4();
	
}

interface Scan {
	/*public abstract*/void scanA4();
	
		
}

class Machine implements Print, Scan { // 다중상속 가능
	@Override
	public void printA4() {
		System.out.println("A4용지를 프린트합니다.");
				
	}
	@Override
	public void scanA4() {
		System.out.println("A4용지를 스캔합니다.");
		
	}
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		Machine machine = new Machine();
		machine.printA4();
		machine.scanA4();
		
		
		
	}

}
