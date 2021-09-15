import java.util.Scanner;
public class WapToCheckPrimeNumber 
{

	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         
         if(num<0) 
         {
        	 System.out.println("negativ num found: please enter positive number");
         }
         else 
         {
        	 for(int i=2;i<num;i++) 
        	 {
        		 if(num%i==0)
        		 {
        			 temp = temp+1;
        		 }
        	 }
        	 if(temp==0) 
        	 {
        		 System.out.println("num is prime: "+num);
        	 }
        	 else 
        	 {
        		System.out.println("num is not prime:"+num); 
        	 }
         }
	}

}
