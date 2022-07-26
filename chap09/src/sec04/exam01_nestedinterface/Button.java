package sec04.exam01_nestedinterface;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// ��ø �������̽�
	interface OnClickListener {
		// �߻� �޼���
		void onClick();
	}
}
