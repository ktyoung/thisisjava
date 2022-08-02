package sec07.exam01_stringbuilder;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();			// StringBuilder ��ü �߰�
		
		sb.append("Java ");								// ���ڿ��� ���� �߰�
		sb.append("Program Study");						// append() �� ���ڿ� ���� �־��� �Ű����� �߰�
		System.out.println(sb.toString());
		
		sb.insert(4, "2");								// 4��° ���� �ڿ� 2 ����
		System.out.println(sb.toString());				// insert() �� ���ڿ� �߰��� �־��� �Ű����� �߰�
		
		sb.setCharAt(4, '6');							// 4��° ���� ���� ���ڸ� 6���� ����
		System.out.println(sb.toString());				// setCharAt() �� ���ڿ����� �־��� index�� ���ڸ� �ٸ� ���ڷ� ��ġ
		
		sb.replace(6, 13, "Book");						// 6��° ���� �ں��� 13��° ���ڱ��� "Book"���� ��ġ
		System.out.println(sb.toString());				// replace() �� ���ڿ��� �Ϻκ��� �ٸ� ���ڿ��� ��ġ
		
		sb.delete(4, 5);								// 5��° ���� ����
		System.out.println(sb.toString());				// delete() �� ���ڿ��� �Ϻκ��� ����
		
		int length = sb.length();						// �� ���� �� ���
		System.out.println("�� ���� �� : " + length);
		
		String result = sb.toString();					// ���ۿ� �ִ� ���� String Ÿ������ ����
		System.out.println(result);

	}

}
