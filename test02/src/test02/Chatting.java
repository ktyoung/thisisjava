package test02;

public class Chatting {
	void startChat(String chatId) {
		// String nickName = null;		// Chat 로컬 클래스에서 nickName이라는 로컬 변수를 사용하고 있으므로 final 특성을 갖게 되는데,
		String nickName = chatId;		// 이 nickName 변수값을 null이라는 상수로 고정시키고 있기 때문에 컴파일 에러 발생.
										// String nickName = chatId;로 코드를 수정하면 컴파일 에러가 발생하지 않음.
		Chat chat = new Chat() {
			
			@Override
			public void start() {
					while(true) {
						String inputData = "안녕하세요";
						String message = "[" + nickName + "] " + inputData;
						sendMessage(message);
					}
			}
		};
		
		chat.start();
	}
	// Chat 로컬 클래스
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
