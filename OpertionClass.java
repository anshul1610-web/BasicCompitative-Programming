
public class OpertionClass
{

	public static void main(String[] args) 
	{
		int [] arr = new int[] {11,27,30,44,555,60,};
		int max =arr[0];
		int small =arr[0];
		for(int i=0;i<arr.length;i++)
		{
		
			if(arr[i]>max) 
			{
				max = arr[i];
			}
			else if(arr[i]<small)
			{
				small = arr[i];
				
			}
		}
		System.out.println("max value is:"+   max);
		System.out.println("small value is :"+  small);
		
	}

}