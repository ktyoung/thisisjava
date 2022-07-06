package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		// name �޼��� : ������ ������ ���
		Week today = Week.SUNDAY; // Enum ��ü today�� SUNDAY ����
		String name = today.name(); // name ���ڿ��� today ��ü�� ���� ����
		System.out.println(name);
		
		// ordinal �޼��� : ��ü Enum���� ��ü�� ���� Ȯ�� (0���� ������)
		int ordinal = today.ordinal(); // SUNDAY�� Week Enum�� 7��°�� ��ġ(0���� �����ϹǷ� 6 ���)
		System.out.println(ordinal);
		
		// compareTo �޼��� : Ư�� ���� �������� �ٸ� ������ ��ġ ����(Ȯ�� �ʿ���) Ȯ��
		Week day1 = Week.MONDAY; // day1�� MONDAY ����
		Week day2 = Week.WEDNESDAY; // day2�� WEDNESDAY ����
		int result1 = day1.compareTo(day2); // day2 �������� day1�� ��ġ �� �� WEDNESDAY ... MONDAY  
		int result2 = day2.compareTo(day1); // day1 �������� day2�� ��ġ �� �� MONDAY ... WEDNESDAY 
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf �޼��� : ���ڿ� ��(.equals�� ������ �޼���)
		Week weekDay = Week.valueOf("SUNDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("�ָ��̱���.");
		} else {
			System.out.println("�����̱���.");
		}
		
		// argument ������� �۵��ϴ� valueOf
		/* if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��̱���.");
			} else {
				System.out.println("�����̱���.");
			}
		} */
		
		// values() �޼��� : Enum�� ������
		Week[] days = Week.values(); // Week Enum�� �����͸� days �迭�� ����
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
