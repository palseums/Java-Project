package package1;

import java.util.function.Function;

/*interface Function < T,R >
{
	public R apply( T );
}*/

// T - Input parameter type 
// R - Output parameter type

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f = n -> (n*n);
		System.out.println(f.apply(5));
		
		Function<String,Integer> f1 = n -> (n.length());
		System.out.println(f1.apply("palaniappan"));
		
		

	}

}
