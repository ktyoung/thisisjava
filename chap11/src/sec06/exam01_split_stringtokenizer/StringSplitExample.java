package sec06.exam01_split_stringtokenizer;

// ���ڿ��� Ư�� �����ڷ� ����Ǿ� ���� ���, �����ڸ� �������� ���ڿ��� �и��ϱ� ���ؼ��� String�� split() �޼��带 �̿��ϰų�,
// java.util ��Ű���� StringTokenizer Ŭ������ �̿��� �� �ִ�.
// split()�� ���� ǥ�������� �����ϰ�, StringTokenizer�� ���ڷ� �����ϴ� �������� �ִ�. 
public class StringSplitExample {

	public static void main(String[] args) {
		String text = "ȫ�浿&�̼�ȫ,�ڿ���,���ڹ�-�ָ�ȣ";
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}

	}

}
