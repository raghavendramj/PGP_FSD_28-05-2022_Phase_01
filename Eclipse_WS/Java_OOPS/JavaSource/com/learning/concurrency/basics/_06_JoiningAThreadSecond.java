package com.learning.concurrency.basics;


class ThreadJoinExample extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 4; i++) {
			System.out.println("Making the thread "+Thread.currentThread().getName()+" sleep for 0.5seconds.");
		}
	}
	
}

public class _06_JoiningAThreadSecond {
	
	public static void main(String[] args) {
		ThreadJoinExample thread1 = new ThreadJoinExample();
		ThreadJoinExample thread2 = new ThreadJoinExample();
		ThreadJoinExample thread3 = new ThreadJoinExample();
		
		thread1.start();
//		thread2.start();
//		thread3.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n *********************************************");
		
		thread2.start();
		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n *********************************************");
		thread3.start();
		
		
	}
}
