



//this is a program that prints the multiples of 3 and 5
class Digi_X_Section2_Q1 {
	
	public static void main(String[] args)
	{
		//int count=0;
		for(int i=1; i<=100; i++)
		{
			if(i%3==0 || i%5==0)
			{
				System.out.print(i + " ");
				//count++;
			}
		}
		System.out.println(" ");
		//System.out.println("The total number of multiples of 3 and 5 is :" + " " + count);
		
	}
}