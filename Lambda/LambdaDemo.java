package package1;

// This is a functional interface as it has only one Abstract method 
interface Cab 
{
	public void bookcab(String source, String destination);
	

}

class Ola implements Cab
{
	public void bookcab(String source, String destination)
	{
		System.out.println("The Ola cab is booked from " + source + " to " + destination);
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		
		// Lambda expression can be written only for functional Interface
		// Writing Lambda expression for functional interface
		
		Cab c = (String source, String destination) -> System.out.println("The Ola cab is booked from lambda " + source + " to " + destination);
		
		//or
		// Cab c = (source,destination) -> System.out.println("The Ola cab is booked from lambda " + source + " to " + destination);
		c.bookcab("chennai", "Tenkasi");
	


	}

}
