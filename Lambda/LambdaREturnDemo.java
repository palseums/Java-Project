package package1;


//This is a functional interface as it has only one Abstract method 
interface Cab1 
{
	public int bookcab(String source, String destination);
	

}

/* class Ola implements Cab1
{
	public int bookcab(String source, String destination)
	{
		System.out.println("The Ola cab is booked from " + source + " to " + destination);
		return 5000;
		
	}
}*/

public class LambdaREturnDemo {

	public static void main(String[] args) {
	
		
		//  Lambda expression with retrun statement.
		Cab1 c = (source,destination) ->
				{
			
			System.out.println("The Ola cab is booked from " + source + " to " + destination);
			return 5000;
			
		};
		System.out.println(c.bookcab("Chennai","Tenkasi"));
		
	}

}
