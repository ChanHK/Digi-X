import java.util.Scanner;

// this is a program that shows the highest common factor of inserted range from 5 numbers
class Digi_X_Section2_Q2{


	public void findHCF(int num, int[] array)
	{
		int highestNum=0;
		int[] arrayCopy  = new int[5];
		
		for(int i=0; i<5; i++)
		{
			arrayCopy[i] = array[i];	
		}
		
		for(int i=0; i<5; i++)
		{
			if(array[i]<0)
			{
				array[i]=0;
			}
			if(array[i]>highestNum)
			{
				highestNum = array[i];
			}
			
		}
		
		int BigComonFactor=0;
		for(int i=1; i<=highestNum; i++)
		{
			if((array[0]%i==0) && (array[1]%i==0) && (array[2]%i==0) && (array[3]%i==0) && (array[4]%i==0))
			{
				BigComonFactor=i;
			}
		}
		//printing out result
		System.out.print("findHCF(" + num + ", [");
				
		for(int j=0; j<5; j++)
		{
			System.out.print(arrayCopy[j]);
			if(j!=4)
			{
				System.out.print(",");
			}
		}
		
		System.out.print("] ) --> " + BigComonFactor);
		
		System.out.println(" ");
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Number of positive integers :");
		int positiveInt = scan.nextInt();
		
		System.out.println(" ");
		
		
		int []array = new int[5];
		
		System.out.print("Enter 5 numbers : ");
		for(int i=0; i<5; i++)
		{
			array[i] = scan.nextInt();
			//System.out.println(array[i]);
			
		}
		Digi_X_Section2_Q2 obj = new Digi_X_Section2_Q2();
		obj.findHCF(positiveInt, array);
	}

}