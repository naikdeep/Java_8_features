package com.linkedin.multithreading;

public class printOddEven {
	   int counter = 0;
	   static int N= 10;
	   public  void printEven() {
		   synchronized (this) {
			   while(counter<N) {
				   while(counter % 2 ==0) {
					   System.out.println("even number " + counter);
					   try{wait();}
					   catch(InterruptedException ex) {
						   ex.printStackTrace();
					   }
				   }
				   counter ++;
				   notify();
			   }
		   }
			   
	   }
	   public  void printOdd() {
		   synchronized (this) {
			   while(counter < N) {
				   while(counter % 2==1) {
				
					   System.out.println("odd number :" + counter);
					   try {
						   wait();
					   }
					   catch(InterruptedException ex) {
						   System.out.println(ex.getMessage());
					   }}
					   counter ++;
					   notify();
				   
			   }
		   }
			  
	   }
	   

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		printOddEven obj=new printOddEven();
		Thread t1 = new Thread(()->{obj.printEven();});
		Thread t2 = new Thread(()->{obj.printOdd();});
		t1.start();
		t2.start();
		t1.join();t2.join();
		}

	

}
