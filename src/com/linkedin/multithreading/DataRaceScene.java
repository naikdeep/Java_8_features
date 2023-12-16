package com.linkedin.multithreading;

public class DataRaceScene extends Thread {
	  static int numOfFlips =10;
      
	  public void run() {
		  for(int i=0;i<100_000_000;i++) {
			  numOfFlips++;
		  }
	  }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DataRaceScene dr1=new DataRaceScene();
		DataRaceScene dr2= new DataRaceScene();
		dr1.start();
		dr2.start();
		dr1.join();
		dr2.join();
		System.out.println(DataRaceScene.numOfFlips);
		}

}
