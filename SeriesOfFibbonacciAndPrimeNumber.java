import java.util.Scanner;

public class SeriesOfFibbonacciAndPrimeNumber 
{
	
	public static void fobbonaci(int n)
 {
	int a=0;
	int b=1;
	int c =0;
	for(int i=1;i<=n;i++)
	{
		c = a+b;
		a= b;
		b= c;
	}
      System.out.println(a);
}
	
	public static void prime(int n)
	{		 
		int num=1, count=0,i;  
		while (count < n)  
		{  
		  num=num+1;  
		     for ( i = 2; i <= num; i++)  
		    {   	  
		      if (num % i == 0)   
		       {  	
		         break;  
		       }  
		     }  
		       if (i == num)  
		       {   
		         count = count+1;  
		       }	     
		}  
		    System.out.println(num);
	}
		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		if(n%2==1) 
		{
			SeriesOfFibbonacciAndPrimeNumber.fobbonaci(n/2 +1);
		}
		else
		{
		SeriesOfFibbonacciAndPrimeNumber.prime(n/2);
		}
	}

}
