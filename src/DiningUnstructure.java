import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningUnstructure {
    public static void main(String[] args) throws InterruptedException {
        Thread mainThread = Thread.currentThread();

        Lock a = new ReentrantLock();
        Lock b = new ReentrantLock();
        Lock c = new ReentrantLock();
        Lock d = new ReentrantLock();
        Lock e = new ReentrantLock();

        Thread Person1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Lock left = a;
                Lock right = b;

                while (mainThread.isAlive()) {
                    try {
                        // Hold time
                    	
                        int holdTime = ThreadLocalRandom.current().nextInt(0, 5) + 1;
                        System.out.println("Person1 wait for " + holdTime + " seconds");
                        Thread.sleep(holdTime * 1000);

                        System.out.println("Person1 want to pick up the left fork");
                        left.lock();
                        try {
                            System.out.println("Person1 pick up the left fork");
                            System.out.println("person1 want to pick up right fork");
                            right.lock();
                            try {
                                System.out.println("Person1 pick up the right fork");

                                
                                int eatTime = ThreadLocalRandom.current().nextInt(0, 10) + 1;
                                System.out.println("Person1 eat for " + eatTime + " seconds");
                                Thread.sleep(eatTime * 1000);
                            } 
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            } 
                            finally {
                                right.unlock();
                            }
                        } finally {
                            left.unlock();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread Person2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Lock left = b;
                Lock right = c;

                while (mainThread.isAlive()) {
                    try {
                        // Hold time
                    	
                        int holdTime = ThreadLocalRandom.current().nextInt(0, 5) + 1;
                        System.out.println("Person2 wait for " + holdTime + " seconds");
                        Thread.sleep(holdTime * 1000);

                        System.out.println("Person2 want to pick up the left fork");
                        left.lock();
                        try {
                            System.out.println("Person2 pick up the left fork");
                            System.out.println("person2 want to pick up right fork");
                            right.lock();
                            try {
                                System.out.println("Person2 pick up the right fork");

                                
                                int eatTime = ThreadLocalRandom.current().nextInt(0, 10) + 1;
                                System.out.println("Person2 eat for " + eatTime + " seconds");
                                Thread.sleep(eatTime * 1000);
                            } 
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            } 
                            finally {
                                right.unlock();
                            }
                        } finally {
                            left.unlock();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        
        Thread Person3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Lock left = c;
                Lock right = d;

                while (mainThread.isAlive()) {
                    try {
                        // Hold time
                    	
                        int holdTime = ThreadLocalRandom.current().nextInt(0, 5) + 1;
                        System.out.println("Person3 wait for " + holdTime + " seconds");
                        Thread.sleep(holdTime * 1000);

                        System.out.println("Person3 want to pick up the left fork");
                        left.lock();
                        try {
                            System.out.println("Person3 pick up the left fork");
                            System.out.println("person3 want to pick up right fork");
                            right.lock();
                            try {
                                System.out.println("Person3 pick up the right fork");

                                
                                int eatTime = ThreadLocalRandom.current().nextInt(0, 10) + 1;
                                System.out.println("Person3 eat for " + eatTime + " seconds");
                                Thread.sleep(eatTime * 1000);
                            } 
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            } 
                            finally {
                                right.unlock();
                            }
                        } finally {
                            left.unlock();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread Person4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Lock left = d;
                Lock right = e;

                while (mainThread.isAlive()) {
                    try {
                        // Hold time
                    	
                        int holdTime = ThreadLocalRandom.current().nextInt(0, 5) + 1;
                        System.out.println("Person4 wait for " + holdTime + " seconds");
                        Thread.sleep(holdTime * 1000);

                        System.out.println("Person4 want to pick up the left fork");
                        left.lock();
                        try {
                            System.out.println("Person4 pick up the left fork");
                            System.out.println("person4 want to pick up right fork");
                            right.lock();
                            try {
                                System.out.println("Person4 pick up the right fork");

                                
                                int eatTime = ThreadLocalRandom.current().nextInt(0, 10) + 1;
                                System.out.println("Person4 eat for " + eatTime + " seconds");
                                Thread.sleep(eatTime * 1000);
                            } 
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            } 
                            finally {
                                right.unlock();
                            }
                        } finally {
                            left.unlock();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread Person5 = new Thread(new Runnable() {
            @Override
            public void run() {
                Lock left = e;
                Lock right = a;

                while (mainThread.isAlive()) {
                    try {
                        // Hold time
                    	
                        int holdTime = ThreadLocalRandom.current().nextInt(0, 5) + 1;
                        System.out.println("Person5 wait for " + holdTime + " seconds");
                        Thread.sleep(holdTime * 1000);

                        System.out.println("Person5 want to pick up the left fork");
                        left.lock();
                        try {
                            System.out.println("Person5 pick up the left fork");
                            System.out.println("person5 want to pick up right fork");
                            right.lock();
                            try {
                                System.out.println("Person5 pick up the right fork");

                                
                                int eatTime = ThreadLocalRandom.current().nextInt(0, 10) + 1;
                                System.out.println("Person5 eat for " + eatTime + " seconds");
                                Thread.sleep(eatTime * 1000);
                            } 
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            } 
                            finally {
                                right.unlock();
                            }
                        } finally {
                            left.unlock();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });



        Person1.start();
        Person2.start();
        Person3.start();
        Person4.start();
        Person5.start();

      
        int programLast = 30 * 1000;   // 30 second
        mainThread.sleep(programLast);
    }
}