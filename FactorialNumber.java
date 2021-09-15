
public class FactorialNumber 
{
	public static void getFactorial(int num) 
	{
		int t=1;
		for(int i=1;i<=num;i++) 
		{
			t = t*i;
		}
		System.out.println(t);
	
	
	}   
	
	
	public static void main(String[] args)
	{
		getFactorial(5);
          
	}

}
