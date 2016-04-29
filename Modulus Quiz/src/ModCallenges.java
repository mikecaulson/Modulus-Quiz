import java.util.Scanner;

public class ModCallenges
	{
		static Scanner userInput=new Scanner(System.in);
		static Scanner userInput2=new Scanner(System.in);
		public static void main(String[] args)
			{
				greetUser();
				askForNumber();
				leapYear();
				thirdNumber();
				fizzBuzz();

			}
		public static void greetUser()
			{
				
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
				System.out.println("Hi, "+ name + ", have fun!");
			}
		public static void askForNumber()
		{
			System.out.println("Please type in a number and I will tell you if it is odd or even.");
			int Number = userInput2.nextInt();
			if (Number%2 == 1)
				{
					System.out.println("It is odd.");
				}
			else if (Number %2 == 0)
				{
					System.out.println("The numeber is Even.");
				}
		}
		public static void leapYear()
		{
			System.out.println("Please type a year and I will tell you if it/was a leap year.");
			int Year = userInput2.nextInt();
			if (Year %4 == 0)
				{
					System.out.println("It is/was a leap year.");
				}
			else if (Year %4 == 1||Year %4==3)
				{
					System.out.println("It is/was not a leap year.");
				}
		}
		public static void thirdNumber()
		{
			int [] thirdnumber = {2, 5, -7, 1, 3, 12, 19, -16, 4};
			for (int i = 0; i<thirdnumber.length;i++)
				{
					if (i%3==0)
						{
							System.out.println(thirdnumber[i +2]);
						}
				}
		}
		public static void fizzBuzz()
		{
			System.out.println("We will now play Fizz Buzz.");
			for (int j = 1; j<101;j++)
				{
					if (j%3==0&&j%5!=0)
						{
							System.out.println("Fizz");
						}
					else if (j%3!=0&&j%5==0)
						{
							System.out.println("Buzz");
							
						}
					else if (j%3==0&&j%5==0)
						{
							System.out.println("Fizz Buzz");
						}
					else
						{
							System.out.println(j);
						}
				}
		}

	}
