package com.learning.concurrency.basics;

public class _02_StartingAThread {

	//Thread -> run method
	static class DownloadFileTask implements Runnable {
		@Override
		public void run() {
			System.out.println("Downloading a file! " + Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) {
		System.out.println("Main Class : "+ Thread.currentThread().getName());
		
		DownloadFileTask downloadFileTask =  new DownloadFileTask();
		
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(downloadFileTask);
			thread.start(); //internally -> invokes run method
		}
	}
}
