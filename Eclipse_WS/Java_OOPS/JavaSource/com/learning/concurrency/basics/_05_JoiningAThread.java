package com.learning.concurrency.basics;

public class _05_JoiningAThread {
	
	static class DownloadFileTask implements Runnable {
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
		System.out.println("BEFORE STARTING A THREAD "+ Thread.currentThread().getName());
		Thread thread1 = new Thread(new DownloadFileTask());
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("AFTER STARTING A THREAD "+ Thread.currentThread().getName());
	}

}
