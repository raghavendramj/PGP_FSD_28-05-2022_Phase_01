package com.learning.concurrency.basics;

public class _09_IllegalMonitorExample {

	static class TestRunnable implements Runnable {

		@Override
		public void run() {
			synchronized (this) {
				try {
					this.wait(1000); //Without synchronized block we get ava.lang.IllegalThreadStateException
					System.out.println("Thread was waiting and now continued!");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		TestRunnable object = new TestRunnable();
		Thread thread = new Thread(object);
		thread.start();
		thread.start(); //Will result in java.lang.IllegalThreadStateException
	}

}
