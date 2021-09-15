import java.util.Scanner;

public class Fibbonacciserier {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the number ");
		int num = sc.nextInt();
		int a= 0,b=1;
		int c;
		
		
		if(num<10  || num>20) 
		{
			System.out.println("Invalid Value");
			
		}
		
		else 
		{
			
			System.out.print(a +" "+ b);
		for(int i=1;i<=num;i++)
		{
			
		c = a+b;
		a = b;
		b = c;
		System.out.print(" " +c);
		}
	
			
		}
	}

}
