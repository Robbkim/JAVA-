package api;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {


		Random r = new Random(System.currentTimeMillis());
		
		// ���ڰ�(seed)�� �����Ͽ� ������ �߻�
		// �⺻������ System.currentTimeMillis()�� �ؼ�
		// ���ڰ��� �ٸ��� �Ѵ�.
		
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());
		System.out.println(r.nextBoolean());
		
		byte[] by = new byte[3];
		r.nextBytes(by);
		// byte[]�� byteŸ�� ������ �߻����� ä���ش�.
		for(byte b : by) {
			System.out.println(b);
		}

	}

}
