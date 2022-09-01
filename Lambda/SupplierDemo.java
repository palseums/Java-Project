package package1;

// Supplier will not get any Input
// It will just return something
// So we have to specify the return type

import java.util.Date;
import java.util.function.Supplier;
public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Date> s = ()-> new Date();
		System.out.println(s.get());

	}

}
