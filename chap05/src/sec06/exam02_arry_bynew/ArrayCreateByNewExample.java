package sec06.exam02_arry_bynew;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		int arr1[] = new int[3];	// int�� 3�� ���� : �ʱⰪ 0
		System.out.println("arr1 �ʱ�ȭ ��");
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println("");
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		System.out.println("arr1 �ʱ�ȭ ��");
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println("");
		
		double arr2[] = new double[3];	// �ʱⰪ 0.0
		System.out.println("arr2 �ʱ�ȭ ��");
		for( int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("");
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		System.out.println("arr2 �ʱ�ȭ ��");
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		System.out.println("");
		
		String arr3[] = new String[3];	// �ʱⰪ null
		System.out.println("arr3 �ʱ�ȭ ��");
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		System.out.println("");
		arr3[0] = "1��";
		arr3[1] = "2��";
		arr3[2] = "3��";
		System.out.println("arr3 �ʱ�ȭ ��");
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		
	}

}
