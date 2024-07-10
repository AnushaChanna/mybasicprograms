package basics.addition;
public class Class9_CallingGlobalVs_InMainMethod 
{
	int age = 34;
	static double salary = 67890.33;
	
	public static void main(String[] args)
	{
		System.out.println(salary);
		Class9_CallingGlobalVs_InMainMethod A1=new Class9_CallingGlobalVs_InMainMethod();
		System.out.println(A1.age);
	}

}
