package com.learning.concurrency.basics;

class EvenPrinter implements Runnable {
	Integer evenFlag;
	static int counter = 0;
	static Object lock = new Object();

	public EvenPrinter(Integer evenFlag) {
		this.evenFlag = evenFlag;
	}

	public void run() {
		synchronized (lock) {
			while (counter < 10) {
				while (counter % 2 != 0) { // Wait when the number is ODD!
					try {
						lock.wait(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter);
				counter++;
				lock.notifyAll();
			}
		}
	}
}

class OddPrinter implements Runnable {
	Integer evenFlag;
	static int counter = 1;
	static Object lock = new Object();

	public OddPrinter(Integer evenFlag) {
		this.evenFlag = evenFlag;
	}

	public void run() {
		synchronized (lock) {
			while (counter < 10) {
				while (counter % 2 == 0) { // Wait when the number is ODD!
					try {
						lock.wait(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + counter);
				counter++;
				lock.notifyAll();
			}
		}
	}
}

public class _08_PrintEvenAndOddNumbers {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new EvenPrinter(0));
		Thread thread2 = new Thread(new OddPrinter(1));
		thread1.start();
		thread2.start();
	}
}
