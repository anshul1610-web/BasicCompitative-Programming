import java.util.Scanner;

public class NumberReverse 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the digit to be reverse");
		int num = sc.nextInt();
		int rem;
		int sum =0;
	while(num!=0) 
	
	{
		rem = num%10;
		sum = sum*10+rem;
		num = num/10;
	}
	System.out.println("Reverse of given digit is::");
	System.out.println(sum);
		
		
	}

}
