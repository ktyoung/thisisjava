package test07;

// dbWork��� �޼��带 ȣ���� �� �Ű������� DataAccessObject dao��� �������̽��� ���ǵǾ� �����Ƿ�~
// OracleDao�� MySqlDao�� �������̽� ���� Ŭ������ �����ϵ�, dao.select(); ~ dao.delete(); 4���� �߻� �޼��带 ������

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

	}

}
