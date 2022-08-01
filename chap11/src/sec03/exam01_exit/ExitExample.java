package sec03.exam01_exit;

// exit() 메서드는 현재 실행하고 있는 프로세스를 강제 종료시키는 역할을 한다.
// 일반적으로 정상 종료일 경우 0으로 지정하고, 비정상 종료일 경우 0 이외의 다른 값을 준다.
// System.exit() 메서드가 실행되면 보안 관리자의 checkExit() 메서드가 자동 호출 → checkExit() 메서드가 정상 실행되면 JVM 종료
public class ExitExample {

	public static void main(String[] args) {
		// 보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if(status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
			try {
				System.exit(i);
			} catch(SecurityException e) {}
		}

	}

}
