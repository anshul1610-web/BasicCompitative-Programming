
	import java.io.*;
	import java.util.*;
	import java.text.*;
	import java.math.*;
	import java.util.regex.*;

	public class AreaOfParameter 
	{

		static int a;
		static int b;

		
		
		public  static void  strLength(String A,String B) 
		{	
		System.out.println(A.length()+B.length()); 	
		}
		public  static void  orderPrese(String A,String B) 
		{
			 if(A.compareTo(B)<0) 
		        {
		        	System.out.println("NO");
		        	
		        }
		}
		public  static void  pattern(String A,String B) 
		{
			System.out.println((A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1)));
		}
		
		
		public static void main(String[] args) 
		{
		        int strl =0;
		       Scanner sc=new Scanner(System.in);
		        String A=sc.next();
		        String B=sc.next();
		      
		        strLength(A, B);
		        orderPrese(A,B);
		        pattern( A ,B);
		  }
		     		      		        
		        

	}
			
		
	

