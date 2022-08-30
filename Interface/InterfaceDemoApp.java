package package1;

public class InterfaceDemoApp {
	


	public static void main(String[] args) {
		
		Honda h = new Honda();
		// Accessing the Interface default method
		h.palmulti_default();
		System.out.println(h.palx);
		// Accessing the Interface static method in static way
		System.out.println(Car.palsub());

	}

}
