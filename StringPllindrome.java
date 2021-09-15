import java.io.*;
import java.util.*;
public class StringPllindrome 
{
	
	    public static void main(String[] args) 
	    {
	    	
	        String b = "";
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the string");
	        String A=sc.next();
	        
	       
	        for(int i =A.length()-1;i>=0;i--)
	        {
	           b = b + A.charAt(i); 
	        }
	        System.out.println(b);
	        
	        if(A.equals(b)) 
	        {
	        	System.out.println("Yes");
	        }
	        else 
	        {
	        	System.out.println("no");
	        }
	    
	
	    StringBuffer sb = new StringBuffer(A);
	    System.out.println(sb.reverse());
	    
	    
	    if(A.equals(b)) 
        {
        	System.out.println("Yes");
        }
        else 
        {
        	System.out.println("no");
        }
	    
	    
	    }
	    

}
