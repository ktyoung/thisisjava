package sec02.exam01_createthread;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		// 规过 1
		/*
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		*/
		
		// 规过 2
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {}
				}
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("厄");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}

}