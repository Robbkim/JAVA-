package api;

// Member Ŭ������ �����.
// �ʵ�� String name; int age; String number; �̴�.
// �������� �Ű������� �ʵ��ʱ�ȭ �����ش�.
// equals �޼ҵ�� hashCode �׸��� toString �޼ҵ带 �������̵��Ͽ� ������ �غ���

class Member {
	
	private String name;
	private int age;
	private String number;
	
	public Member (String name, int age, String number) {
		this.name = name;
		this.age = age;
		this.number = number;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			boolean bool = this.name.equals(member.name)
						  && this.age == member.age
						  && this.number.equals(member.number);
			return bool;
		}else {
			return false;
	}
	}
	
	@Override
	public int hashCode() {
		return (name + age + number).hashCode();
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + "\n ���� : " + age + "\n ��ȭ��ȣ : " + number;
	}
	
	
	
}


public class Ex02 {

	public static void main(String[] args) {
		
		Member member1 = new Member("ȫ�浿", 20, "010-1111-2222");
		Member member2 = new Member("ȫ�浿", 20, "010-1111-3333");
		Member member3 = new Member("ȫ�浿", 20, "010-1111-2222");
		
		System.out.println(member1.equals(member2));
		System.out.println(member1.equals(member3));
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
		System.out.println(member3.hashCode());
		
		System.out.println(member1.toString());
		
		
		
	}

}
