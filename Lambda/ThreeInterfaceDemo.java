package package1;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee2
{
	String ename;
	int salary;
	String gender;
	
	public Employee2(String ename, int salary, String gender) {
		
		this.ename = ename;
		this.salary = salary;
		this.gender = gender;
	}
	
	
}

public class ThreeInterfaceDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee2> al = new ArrayList<>(); 
		al.add(new Employee2("Palani",5000,"Male"));
		al.add(new Employee2("uma",60000,"Female"));
		al.add(new Employee2("varnikhaa",70000,"Female"));
		al.add(new Employee2("Adwaidan",80000,"Male"));
		
		// Function
		
		Function<Employee2,Integer> f = i -> (i.salary*10)/100;
		
		// Predicate
		
		Predicate<Integer> p = j -> (j >= 5000);
		
		// Consumer
		
		Consumer<Employee2> c = k -> {
			
			System.out.println(k.ename);
			System.out.println(k.salary);
			System.out.println(k.gender);
		};

		
		for(Employee2 e2: al)
		{
			int bonus = f.apply(e2);
			if(p.test(bonus))
			{
				c.accept(e2);
			}
		}
		
		
	}

}
