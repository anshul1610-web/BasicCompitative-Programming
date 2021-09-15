
public class PallindromrNumber
{
	
	public static void getPaliindrome(int num) 
	
	{
		int rem;
		int sum =0;
		int t= num;
		
		while(num!=0) 
		{
			rem = num%10;
			sum = sum*10+rem;
			num = num/10;
		}
		if(t==sum)
		{
			System.out.println(t +  "is a Pallindrome");
		}
		else 
		{
			System.out.println( "not a a Pallindrome");
		}
	}
	
	
	
	
	public static void main(String[] args)
	
	
	{
		getPaliindrome(222);

	}

}
