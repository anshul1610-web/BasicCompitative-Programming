import java.util.Scanner;

public class ArrayOpertion
{

	public static void main(String[] args) 
	{
		
		int[] ar = new int[] {-4, 3, -9, 0, 4, 1}; 
		
		float zero =0;
		double positive =0;
		double negative =0;
		
		int total = ar.length;
		
		
		
		for(int i=0;i<ar.length;i++)
		{
		   if (ar[i]==0) 
		   {
			  zero = zero+1; 
		   }
		   else if(ar[i]>0) 
		   {
			   positive++;
		   }
		   else if(ar[i]<0)
		   {
			   negative++;
		   }
		}
			System.out.println(positive/total);
			System.out.println(negative/total);	
			System.out.println(zero/total);	

	}

}
