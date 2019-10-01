package com.lovecoding.lamdafunctions;



public class AnotherClass {

	public String doSomething(){
		
		 int i=0;

		 UpperConcat uc =(s1, s2)->{
			 System.out.println("The Lamdbda expression's class is "+getClass().getSimpleName());
			 System.out.println("i (inside annonymous class):"+ i);
			 return s1.toUpperCase()+s2.toUpperCase();
		 };
		 
		 System.out.println("Another class name is : "+getClass().getSimpleName());
			
		return LambdaFunctional.doStringStuff(uc, "Sam", "Kom");
	}
	
	public void printValue(){
	int number =25;
	
	Runnable r=()->{
		try{
			Thread.sleep(3000);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		System.out.println("The value of number is : "+ number);
		
	};
	
	new Thread(r).start();
	}
}
