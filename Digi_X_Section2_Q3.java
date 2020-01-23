import java.util.Scanner;

//this is a program that checks input string is a palindrome or not
class Digi_X_Section2_Q3{


	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter your word : ");
		
		String word = scan.nextLine();
		
		int wordLength = word.length();
		char firstLetterOfWord = word.charAt(0);
		char LastLetterOfWord = word.charAt(wordLength-1);
		if(firstLetterOfWord == LastLetterOfWord)
		{
			System.out.println("The word " + word + " is a palindrome");
		}
		else
		{
			System.out.println("The word " + word + " is not a palindrome");
		}
		
	}


}