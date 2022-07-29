package sec01.exam02_hashcode;

// hashCode() �޼���� ��ü�� �޸� ������ �̿��ؼ� �ؽ��ڵ带 ����� �����Ѵ�. ���� ��ü���� �ٸ� ���� ������ �ִ�.
// ��ü �ؽ��ڵ� : ��ü�� �ĺ��� �ϳ��� ������
public class Key {
	// �ʵ�
	public int number;
	
	// ������
	public Key(int number) {
		this.number = number;
	}
	
	// hashCode() �޼��带 �����ؼ� ���ϵ� �ؽ��ڵ� ���� ������ �˻��Ѵ�.
	// �ؽ��ڵ� ���� �ٸ��� �ٸ� ��ü�� �Ǵ��ϰ�, ������ equals() �޼���� �ٽ� �˻��Ѵ�.
	// ����, hashCode() �޼��尡 true�� ���͵�, equals()�� ���ϰ��� �ٸ��� �ٸ� ��ü�� �ȴ�.
	// �� �̷� ���, HashMap�� �ĺ�Ű�� Key ��ü�� ����ϸ� ����� ���� ã�ƿ� �� �ִ�.
	
	// ���������, ��ü�� ���� �񱳸� ���ؼ��� Object�� equals() �޼��常 ���������� ���� hashCode() �޼��嵵 �������Ͽ�
	// ���� ���� ��ü�� ��� ������ �ؽ��ڵ尡 ���ϵǵ��� �ؾ��Ѵ�.
	
	@Override											// Object�� equals() ������
	public boolean equals(Object obj) {
		if(obj instanceof Key) {						// Key Ÿ�԰� ���ٸ� 
			Key compareKey = (Key) obj;					// ���� Ÿ�� ��ȯ
			if(this.number == compareKey.number) {		// number �ʵ� ���� ������ true
				return true;
			}
		}
		return false;
	}
	
	// �ǵ��Ѵ�� "ȫ�浿"�� �������� �������� hashCode() �޼��带 Key Ŭ������ �߰��Ѵ�. 
	@Override											// hashCode() ������
	public int hashCode() {
		return number;
	}
}
