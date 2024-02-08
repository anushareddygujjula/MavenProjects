

import org.junit.Test;


import multithreading.DeadlockExample;
public class DeadlockExampleTest {

    @Test
    public void testDeadlock() throws InterruptedException {
        DeadlockExample example = new DeadlockExample();

        // Create and start two threads
        Thread thread1 = new Thread(() -> example.method1());
        Thread thread2 = new Thread(() -> example.method2());
        thread1.start();
        thread2.start();

        // Join the threads to wait for their completion
        thread1.join();
        thread2.join();
    }
}
