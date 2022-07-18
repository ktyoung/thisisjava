package sec03.exam03_multi_implement_class;

import sec03.exam01_name_implement_class.RemoteControl;

public class SmartTelevision implements RemoteControl, Searchable {
	 private int volume;
	 
	 public void turnOn() {
		 System.out.println("TV�� �մϴ�.");
	 }
	 
	 public void turnOff() {
		 System.out.println("TV�� ���ϴ�.");
	 }

	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
		
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
		System.out.println("���� TV ���� : " + volume);
	}
}
