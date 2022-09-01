package package1;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int expreience;
	
	public Employee(String ename, int salary, int expreience) {
		
		this.ename = ename;
		this.salary = salary;
		this.expreience = expreience;
	}
}

public class PredicateWithClass {

	public static void main(String[] args) {
		
		//Employee e1 = new Employee("palani",50000,11);
		
		Predicate<Employee> pr = e -> ((e.salary>45000) && (e.expreience > 10));
		
		ArrayList<Employee> al = new ArrayList<>();
		
		al.add(new Employee("palani",20000,41));
		al.add(new Employee("Uma",40000,35));
		al.add(new Employee("Varnikhaa",60000,13));
		al.add(new Employee("Adwaidan",80000,06));
		
		for(Employee e1:al)
		{
		
				if(pr.test(e1))
				{
					System.out.println(e1.ename);
				}
		
		}
	}

}
