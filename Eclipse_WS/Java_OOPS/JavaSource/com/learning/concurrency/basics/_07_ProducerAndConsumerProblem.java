package com.learning.concurrency.basics;

import java.util.ArrayList;
import java.util.List;

class Producer implements Runnable {
	// Shared Resource
	List<Integer> numbersList = new ArrayList<Integer>();

	public Producer(List<Integer> numbersList) {
		this.numbersList = numbersList;
	}

	// This is the place thread's logic goes in
	@Override
	public void run() {
		synchronized (numbersList) {
			for (int i = 23; i < 33; i++) {
				if (numbersList.size() >= 1) {
					System.out.println("Producer is waiting");
					try {
						numbersList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println("Producing the number = " + i);
				numbersList.add(i);
				numbersList.notifyAll(); // I will inform the consumer to consume the contents from the list
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Consumer implements Runnable {
	// Shared Resource
	List<Integer> numbersList = new ArrayList<Integer>();

	public Consumer(List<Integer> numbersList) {
		this.numbersList = numbersList;
	}

	@Override
	public void run() {
		synchronized (numbersList) {

			for (int i = 23; i < 33; i++) {
				if (numbersList.isEmpty()) {
					System.out.println("Consumer is waiting to producer to fill the shared resource");
					try {
						numbersList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				int element = numbersList.remove(0);
				System.out.println("Consuming the data  = " + element);
				numbersList.notifyAll(); // I will inform the consumer to consume the contents from the list
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class _07_ProducerAndConsumerProblem {

	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<>();
		Thread producer = new Thread(new Producer(numbersList));
		Thread consumer = new Thread(new Consumer(numbersList));

		producer.start();
		consumer.start();
	}
}
