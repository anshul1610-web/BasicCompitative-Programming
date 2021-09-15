import java.util.Scanner;

public class GCD 
{

	public static void GCD(int a, int b)
	{
		int HCF=1;
	     for(int i=1;i<=a;i++) 
	     {
	    	 if(a%i==0 && b%i==0) 
	    	 {
	    	     HCF = i; 
	    	 }
	     }
	     System.out.println("HCF of given number is "+HCF);
	     
	     int LCM = (a*b)/HCF;
	     System.out.println("LCM of given number is "+LCM);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
           GCD(a,b);
	}

}
