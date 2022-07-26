package sec04.exam01_nestedinterface;

public class Button {
	OnClickListener listener;
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// 중첩 인터페이스
	interface OnClickListener {
		// 추상 메서드
		void onClick();
	}
}
