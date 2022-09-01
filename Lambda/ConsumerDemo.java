package package1;
import java.util.function.*;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer <String> c = s -> System.out.println(s);
		c.accept("Palaniappan");
		

	}

}
