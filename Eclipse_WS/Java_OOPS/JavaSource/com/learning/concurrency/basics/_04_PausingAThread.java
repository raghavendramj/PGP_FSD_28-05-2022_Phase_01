package com.learning.concurrency.basics;

public class _04_PausingAThread {

	static class DownloadFileTask implements Runnable {
		@Override
		public void run() {
			try {
				Thread.sleep(5000); //Pause a thread
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Downloading a file! " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Thread : " + Thread.currentThread().getName());
		DownloadFileTask downloadFileTask = new DownloadFileTask();

		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(downloadFileTask, "MyNameGiven-"+i);
			thread.start(); // internally -> invokes run method
		}
	}
}
