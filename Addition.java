package basics.addition;

public class Addition
{
	static void addition()
	{
		int a=88;
		int b=1;
		int sum=a+b;
		System.out.println("Addition value without parameter is " + sum);
	}
	static void sum(int a)
	{
		int sum=a+10;
		System.out.println("print a value " + sum);
	}
	public static void main(String[] args) 
	{
		addition();
		sum(100);
	}

}
