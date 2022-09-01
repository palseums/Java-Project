package package1;

import java.util.function.Function;
import java.util.function.Predicate;

class Employee1
{
	String ename;
	int salary;
	
	public Employee1(String ename, int salary) {
		
		this.ename = ename;
		this.salary = salary;
	}
	
	
}

public class FunctionalInterfaceWithClass {

	public static void main(String[] args) {
		
		Predicate<Integer> pr = i -> (i > 1000);
		
		Function<Employee1,Integer> f = n-> {
			if (pr.test(n.salary))
			
				return 10;
			return 20;
			
			
			};
			System.out.println(f.apply(new Employee1("Palaniappan",500)));
		

	}

}
