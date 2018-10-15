import java.util.concurrent.ThreadLocalRandom;

public class Dining {

	public static void main(String[] args) throws InterruptedException {
		
		Thread mainThread = Thread.currentThread();
		
		Fork a = new Fork();
		Fork b = new Fork();
		Fork c = new Fork();
		Fork d = new Fork();
		Fork e = new Fork();
		
		
		Thread person1 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				Fork left = a;
				Fork right = b;
				
				while(mainThread.isAlive())
				{
					try {
						int holdTime = ThreadLocalRandom.current().nextInt(0,4)+1;
					    System.out.println("Person1: wait " + holdTime + " Second");
					    Thread.sleep(holdTime * 1000); 
					    
					    // Fork Left
					    System.out.println("Person1 want to pick up the left Fork");
					    left.pickUp();
					    System.out.println("Person1 already pick up the left");
					    
					    // Fork right
					    System.out.println("Person1 want to pick up the right Fork");
					    right.pickUp();
					    System.out.println("Person1 already pick up the right");
					    
					    //Given a eat time
					    int eatTime = ThreadLocalRandom.current().nextInt(0,5)+1;
					    System.out.println("Person1 eat for " + eatTime + " Second");
					    Thread.sleep(eatTime*1000);
					    
					    left.putDown();
					    right.putDown();
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		
		Thread person2 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				Fork left = b;
				Fork right = c;
				
				while(mainThread.isAlive())
				{
					try {
						int holdTime = ThreadLocalRandom.current().nextInt(0,4)+1;
					    System.out.println("Person2: wait " + holdTime + " Second");
					    Thread.sleep(holdTime * 1000); 
					    
					    // Fork Left
					    System.out.println("Person2 want to pick up the left Fork");
					    left.pickUp();
					    System.out.println("Person2 already pick up the left");
					    
					    // Fork right
					    System.out.println("Person2 want to pick up the right Fork");
					    right.pickUp();
					    System.out.println("Person2 already pick up the right");
					    
					    //Given a eat time
					    int eatTime = ThreadLocalRandom.current().nextInt(0,5)+1;
					    System.out.println("Person2 eat for " + eatTime + " Second");
					    Thread.sleep(eatTime*1000);
					    
					    left.putDown();
					    right.putDown();
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		
		Thread person3 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				Fork left = c;
				Fork right = d;
				
				while(mainThread.isAlive())
				{
					try {
						int holdTime = ThreadLocalRandom.current().nextInt(0,4)+1;
					    System.out.println("Person3: wait " + holdTime + " Second");
					    Thread.sleep(holdTime * 1000); 
					    
					    // Fork Left
					    System.out.println("Person3 want to pick up the left Fork");
					    left.pickUp();
					    System.out.println("Person3 already pick up the left");
					    
					    // Fork right
					    System.out.println("Person3 want to pick up the right Fork");
					    right.pickUp();
					    System.out.println("Person3 already pick up the right");
					    
					    //Given a eat time
					    int eatTime = ThreadLocalRandom.current().nextInt(0,5)+1;
					    System.out.println("Person3 eat for " + eatTime + " Second");
					    Thread.sleep(eatTime*1000);
					    
					    left.putDown();
					    right.putDown();
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		
		Thread person4 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				Fork left = d;
				Fork right = e;
				
				while(mainThread.isAlive())
				{
					try {
						int holdTime = ThreadLocalRandom.current().nextInt(0,4)+1;
					    System.out.println("Person4: wait " + holdTime + " Second");
					    Thread.sleep(holdTime * 1000); 
					    
					    // Fork Left
					    System.out.println("Person4 want to pick up the left Fork");
					    left.pickUp();
					    System.out.println("Person4 already pick up the left");
					    
					    // Fork right
					    System.out.println("Person4 want to pick up the right Fork");
					    right.pickUp();
					    System.out.println("Person4 already pick up the right");
					    
					    //Given a eat time
					    int eatTime = ThreadLocalRandom.current().nextInt(0,5)+1;
					    System.out.println("Person4 eat for " + eatTime + " Second");
					    Thread.sleep(eatTime*1000);
					    
					    left.putDown();
					    right.putDown();
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		
		Thread person5 = new Thread(new Runnable() {
			@Override
			public void run()
			{
				Fork left = e;
				Fork right = a;
				
				while(mainThread.isAlive())
				{
					try {
						int holdTime = ThreadLocalRandom.current().nextInt(0,4)+1;
					    System.out.println("Person5: wait " + holdTime + " Second");
					    Thread.sleep(holdTime * 1000); 
					    
					    // Fork Left
					    System.out.println("Person5 want to pick up the left Fork");
					    left.pickUp();
					    System.out.println("Person5 already pick up the left");
					    
					    // Fork right
					    System.out.println("Person5 want to pick up the right Fork");
					    right.pickUp();
					    System.out.println("Person5 already pick up the right");
					    
					    //Given a eat time
					    int eatTime = ThreadLocalRandom.current().nextInt(0,5)+1;
					    System.out.println("Person5 eat for " + eatTime + " Second");
					    Thread.sleep(eatTime*1000);
					    
					    left.putDown();
					    right.putDown();
					}catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
			}
		});
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		
		int programLast = 30*1000;
		mainThread.sleep(programLast);
		
		
		
		

	}

}
