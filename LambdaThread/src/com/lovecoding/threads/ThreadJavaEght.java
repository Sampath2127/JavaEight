package com.lovecoding.threads;

public class ThreadJavaEght {

	public static void main(String[] args) throws Exception {
	Thread t1=new Thread(()->{
			for(int i=0; i<10; i++) System.out.println("Hello Thread1..!");
		});
	Thread t2=new Thread(()->{
		for(int i=0; i<10; i++) System.out.println("Hello Thread2..!");
	});
	t1.start();
	
	try{Thread.sleep(10);}catch(Exception e){};
	t2.start();
	
	t1.join();
	t2.join();
	
	System.out.println("End..!");
	
	}

}
