package package1;

public interface Car {
	
	int palx =10;
	
	public int palnumber();
	public String palgetString();
	// Demo for Interface having default method
	public default int palmulti_default()
	{
		return 5;
	}
	public static int palsub()
	{
		return 100;
	}
	// private method in interface introduced in JAVA 9
	private int dosomething()
	{
		return 1000;
	}

}
