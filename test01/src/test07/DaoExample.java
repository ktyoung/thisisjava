package test07;

// dbWork라는 메서드를 호출할 때 매개변수가 DataAccessObject dao라는 인터페이스로 정의되어 있으므로~
// OracleDao와 MySqlDao를 인터페이스 구현 클래스로 구현하되, dao.select(); ~ dao.delete(); 4개의 추상 메서드를 재정의

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
