package api;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(arr));
		// ArraysŬ������ �迭�� ���� �� �־ ���� ����� �������ִ� Ŭ����
		// Math Ŭ������ ���������� static �޼ҵ��� �̷���� Ŭ������ ���ϰ� ���ٰ���
		
		int[] arr2 = Arrays.copyOf(arr, arr.length);
		// �迭���� copyOf(������ �迭, ����);
		// ���̸�ŭ ���ο� �迭�� ��������� ������ �迭�� index�� 0���� ���簡 �ȴ�.
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
		// index 2���� 3������ �迭�� ����ȴ�. (4�� ������)
		System.out.println(Arrays.toString(arr3));
		
		int[] array = {3, 5, 2, 6, 1, 7, 4};
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		// sort() �޼ҵ�� ���޹��� �迭�� ��� ��Ҹ� ������������ �����Ѵ�.
		System.out.println(Arrays.toString(array));
		
		
		

	}

}
