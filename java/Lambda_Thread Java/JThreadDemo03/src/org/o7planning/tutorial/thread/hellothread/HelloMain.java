package org.o7planning.tutorial.thread.hellothread;

public class HelloMain {

	public static void main(String[] args) 
			throws InterruptedException {

		int idx = 1;

		

		HelloThread helloThread = 
				new HelloThread();

		// Chạy thread
		helloThread.start();

	
		System.out.println("==> Main thread stopped");
	}
}
