package com.lovecoding.lamdafunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaFunctional {

	public static void main(String[] args) {
		new Thread(()-> {
			System.out.println("Running thread using Lambda..!");
			System.out.println("Running thread using Lambda Line 2..!");
			System.out.println("Running thread using Lambda Line 3..!");
			}).start();	
		
		Employee sam=new Employee("Sam Kom", 27);
		Employee ram=new Employee("Ram Rahim", 18);
		Employee lax=new Employee("Laxman Pita", 65);
		Employee jw=new Employee("John Wick", 55);
		Employee pc=new Employee("Palmera Clark", 19);
		
		List<Employee> empList=new ArrayList<>();
		
		empList.add(sam);
		empList.add(ram);
		empList.add(lax);
		empList.add(jw);
		empList.add(pc);
	
		Function<Employee, String> getLastName= (Employee employee) ->{
			return employee.getName().substring(employee.getName().indexOf(' ')+1);
		};
		
		String lastName=getLastName.apply(empList.get(0));
		//System.out.println(lastName);
		
		Function<Employee, String> getFirstName=employee->{
			return employee.getName().substring(0,employee.getName().indexOf(' '));
		};
		
		Random rand1=new Random();
		
		for(Employee employee: empList){
			if(rand1.nextBoolean()){
				System.out.println(getAName(getFirstName, employee));
			}else{
				System.out.println(getAName(getLastName, employee));
			}
		}
		
		Function<Employee, String> upperCase= employee->employee.getName().toUpperCase();
		
		Function<String, String>  firstName = name -> name.substring(0, name.indexOf(' '));
		
		Function chainedFunction=upperCase.andThen(firstName);
		
		System.out.println(chainedFunction.apply(empList.get(0)));
		
		BiFunction<String, Employee, String> concatAge = (String name, Employee employee) ->{
			return name.concat(" "+employee.getAge());
		};
		
		String upperName= upperCase.apply(empList.get(0));
		System.out.println(concatAge.apply(upperName, empList.get(0)));
		
		IntUnaryOperator incby5= i->i+5;
		
		System.out.println(incby5.applyAsInt(100));
		
		
		//consumer functions
		
		Consumer<String> c1=s->s.toUpperCase();
		Consumer<String> c2=s->System.out.println(s);
		
		c1.andThen(c2).accept("Hello Consumer function..!");
		
		/*printEmployeesByAge(empList, "Employee over age 30..!", x->x.getAge()>30); 
		printEmployeesByAge(empList, "\nEmployee under age 35..!", employee->employee.getAge()<=35); 
		
		printEmployeesByAge(empList, "\nEmployess younger than 20..!", new Predicate<Employee>() {

			@Override
			public boolean test(Employee emp) {
				
				return emp.getAge()<20;
			}
		});
		
		IntPredicate greaterThan5=i->i>5;
		IntPredicate lessThan100=i->i<100;

		System.out.println(greaterThan5.and(lessThan100).test(50));
		System.out.println(greaterThan5.and(lessThan100).test(4));
		
		Random random=new Random();
		Supplier<Integer> randomIntSupplier=()->random.nextInt(100); // Supplier has different type support Int, Double, String etc.
		for(int i=0;i<10;i++){
			System.out.println(randomIntSupplier.get());
		}
		
		empList.forEach(employee->{
			String lastName=employee.getName().substring(employee.getName().indexOf(' ')+1);
			System.out.println("Employee Last Name  is : "+lastName);		
		});*/
	}
	
	private static String getAName(Function<Employee, String> getName, Employee employee){
		return getName.apply(employee);
	}
	private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
	
		System.out.println(ageText);
		System.out.println("========================");
		
		for(Employee employee:employees){
			if(ageCondition.test(employee)){
				System.out.println(employee.getName());
			}
		}
		
		
		
		/*employees.forEach(employee->{
			if(employee.getAge()>35){
				System.out.println(employee.getName());
			}
		});
*/
	}
	
	public final static String doStringStuff(UpperConcat uc, String s1, String s2){
		return uc.upperConcat(s1, s2);
	}

}
