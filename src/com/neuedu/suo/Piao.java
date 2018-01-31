package com.neuedu.suo;

public class Piao implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		  try {
			Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int Count=40;
		while(Count>0) {
			System.out.println(Thread.currentThread().getName()+"Âô³ö"+Count+"ÕÅÆ±");
			Count--;
		}
	}

}
