import java.util.Arrays;

public class AnagramPattern {

	public static void main(String[] args) {
		
		String a = "anagramm";
		String b  = "margana";
		
		char[] c = a.toLowerCase().toCharArray();
		char[] d = b.toLowerCase().toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(d);
	
		if(Arrays.equals(c, d))
		{
			System.out.println("true");
		}	
		else
		{
			System.out.println("false");
		}
 		
		

	}

}
