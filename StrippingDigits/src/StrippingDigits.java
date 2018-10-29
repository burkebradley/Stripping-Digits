import java.util.Scanner;
public class StrippingDigits
	{

		public static void main(String[] args)
			{
//				challengeOne();
//				challengeTwo();
				test();
				
				

			}
		static int [] array = new int [5];
		static int number;
		static int digits; 
		static Scanner userInput = new Scanner(System.in);
		public static void challengeOne()
		{
			System.out.println("Enter in a six digit number.");
			number = userInput.nextInt();
			for (int i = 0; i < 6; i++)
				{
				digits = number % 10;  
				number = number / 10;
				System.out.println(digits);
				}
		}
		public static void challengeTwo() 
		{
			System.out.println("Enter in a number.");
			number = userInput.nextInt();
			int counter = 0; 
			int oddNumbers = 0;
			int sum = 0;
			int roundNumber = sum;
			int lastDigit =sum%10;
			do 
				{
				//challenge1+2
					digits = number %10;
					number = number /10;
					counter ++;
					sum = sum + digits;
				
				//challenge3
				if (digits%2==1)
					{
						oddNumbers++;
					}
				}
			while (number > 0 );
			//challenge5
			if (lastDigit <= 5)
				{
					roundNumber = roundNumber - lastDigit + 10;
				}
			else
				{
					roundNumber = roundNumber - lastDigit;
				}
			if (counter <= 1 && oddNumbers <=1)
				{
					System.out.println("There is " + counter + " digit and " + oddNumbers + " odd number.");
				}
			else 
				{
					System.out.println("There are " + counter + " digits and " + oddNumbers + " odd numbers.");
				}
			System.out.println("The numbers add up to " + sum);
			System.out.println("The rounded number is " + roundNumber);
			
			
			
			
			
			
			
			//challenge4
			
		}
		
		public static void test()
		{
			String name = "hello";
			System.out.println(name.substring(0,3));
		}
	}
