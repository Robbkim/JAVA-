package generic;

class Box<E> {
	
	private E obj;
	
	public void setObj(E obj) {
		this.obj = obj;
	}
	
	public E getObj() {
		return obj;
	}
	
	
	
}


public class Ex02 {

	public static void main(String[] args) {


//		Box box = new Box();
//		box.setObj("�ȳ��ϼ���");
//		
//		String str = (String)box.getObj();
//		System.out.println(str);
		
		Box<String> box = new Box<String>();
		
		box.setObj("�ȳ��ϼ���");
		
		String str = box.getObj();

	}

}
