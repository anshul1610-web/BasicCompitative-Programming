import java.util.Random;

public class GenerateRamdomNumber 
{

	public static void main(String[] args) 
	{
		  
		int count;
		Random re = new Random();
		System.out.println("Random Number Generated below");
		
		for(count=1;count<=10;count++)
		{
			System.out.println(re.nextInt(100));
		}
	}

}
