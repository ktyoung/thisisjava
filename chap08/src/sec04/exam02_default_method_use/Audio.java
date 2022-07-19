package sec04.exam02_default_method_use;

public class Audio implements RemoteControl{
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if(volume<RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : " + volume);	
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		} else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
}
