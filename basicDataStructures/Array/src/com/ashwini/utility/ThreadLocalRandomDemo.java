package com.ashwini.utility;

import java.util.concurrent.ForkJoinPool;

public class ThreadLocalRandomDemo {

	void implementThreadLocalRandom() {
		ForkJoinPool pool = new ForkJoinPool();
		TestTask task1 = new TestTask("Task One");
		TestTask task2 = new TestTask("Task Two");
		pool.invoke(task1);
		pool.invoke(task2);
	}
	
	class TestTask implements ForkJoinTask<>
}
