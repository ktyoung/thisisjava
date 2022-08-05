package test02;

public class Chatting {
	void startChat(String chatId) {
		// String nickName = null;		// Chat ���� Ŭ�������� nickName�̶�� ���� ������ ����ϰ� �����Ƿ� final Ư���� ���� �Ǵµ�,
		String nickName = chatId;		// �� nickName �������� null�̶�� ����� ������Ű�� �ֱ� ������ ������ ���� �߻�.
										// String nickName = chatId;�� �ڵ带 �����ϸ� ������ ������ �߻����� ����.
		Chat chat = new Chat() {
			
			@Override
			public void start() {
					while(true) {
						String inputData = "�ȳ��ϼ���";
						String message = "[" + nickName + "] " + inputData;
						sendMessage(message);
					}
			}
		};
		
		chat.start();
	}
	// Chat ���� Ŭ����
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
