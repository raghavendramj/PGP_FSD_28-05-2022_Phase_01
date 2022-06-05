package com.learning.concurrency.basics;

class MyThread extends Thread {

	public void run() {
		System.out.println("CUSTOM THREAD : This is " + Thread.currentThread().getName());
	}
}

public class _03_UsingThreadClass {

	public static void main(String[] args) {
		System.out.println("Main Thread : " + Thread.currentThread().getName());
		MyThread thread1 = new MyThread();
		thread1.start();
	}
}
