package package1;

import java.util.function.Predicate;

// Pre-Defined-Functional-INterface
// predicate
// Function
// Consumer
// Supplier
// It is available in the java package is java.util.Function


/* interface Predicate<T>
{
	public abstract boolean test(T t);
}*/

// Predicate --> Takes only one parameter and return boolean value
// Use only if you have conditional checks in your program

public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
		
		// Example 1:
		Predicate<Integer> p = i->(i>10);
		System.out.println(p.test(20)); // true
		System.out.println(p.test(5)); // False
		
		// Example 2 :
		Predicate<String> pr = s ->(s.length() > 4);
		
		System.out.println(pr.test("Welcome")); // true
		System.out.println(pr.test("xyz")); // False
		
		// Example 3:
		String names[] = {"palani","Uma","Adwaidan","Varnikhaa"};
		
		for(String name: names)
		{
			if(pr.test(name))
			{
				System.out.println(name);
			}
		}
		
	}
}
