package method;

public class StaticMethodCall {
	//static method call in same class
	public static void m1()
	{
		System.out.println("m1 get called");
	}
public static void m2()
{
	System.out.println("m2 get called");
}
public static void m3()
{
	System.out.println("m3 get called");
}
	public static void main(String[] args) {
	m1();
	
	m2();
	StaticMethodCall.m3();//but no need to write class name to call in same class
	
	}

}
