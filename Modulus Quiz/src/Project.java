import java.util.Scanner;

public class Project
	{
		static Scanner userInput=new Scanner(System.in);
		static int answer,randomnumber,randomnumber2, answer2, correct;
		public static void main(String[] args)
			{
				greetUser();
				informPlayer();
				aksForQuestions();
//				generateRandomNumbers();
//				askQuestions();
				askQuestions1();
				tellResult();
			}
		public static void greetUser()
			{
				
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
				System.out.println("Hi, "+ name + ", have fun!");
			}
		public static void informPlayer()
		{
			System.out.println("Today we will be answering random questions using modulus.");
		}
		public static void aksForQuestions()
		{
			System.out.println("How many questions would you like to generate?");
			answer = userInput.nextInt();
			answer = answer+1;
		}
//		public static void generateRandomNumbers()
//		{
//			randomnumber = (int)(Math.random()*30)+1;
//			randomnumber2 = (int)(Math.random()*30)+1;
//		}
		public static void askQuestions()
		{
			for (int i = 0; i<answer;i++)
				{
					randomnumber = (int)(Math.random()*answer)+1;
					randomnumber2 = (int)(Math.random()*answer)+1;
					if (randomnumber>randomnumber2||randomnumber ==randomnumber2)
						{
							if (i%5==0)
								{
									System.out.println("What is the remainder of "+randomnumber+ " divided by "+randomnumber2 +"?");
									answer2 = userInput.nextInt();
								
									if (randomnumber%randomnumber2==answer2)
										{
											System.out.println("That is correct, good job.");
											System.out.println("On to the next question.");
										}
									else if (randomnumber%randomnumber2!=answer2)
										{
											System.out.println("That is incorrect, let's go to the next question.");
										}
								}
							else 
								{
									System.out.println();
								}
						}
								
							
						
					else
						{
							System.out.println("What is the remainder of "+randomnumber+ " divided by "+randomnumber2 +"?");
							
							answer2 = userInput.nextInt();
							
							if (randomnumber%randomnumber2==answer2)
								{
									System.out.println("That is correct, good job.");
									System.out.println("On to the next question.");
								}
							else if (randomnumber%randomnumber2==answer2)
								{
									System.out.println("That is incorrect, let's go to the next question.");
								}
						}
					
						
						
						
				
				}
		}
		public static void askQuestions1()
		{
			for (int j=0;j<answer;j++)
				{
					if (j%5==0&&j%3!=0)
						{
							randomnumber = (int)(Math.random()*10)+1;
							randomnumber2 = (int)(Math.random()*30)+10;
							System.out.println("What is "+randomnumber+ " % "+randomnumber2 +"?");
							answer2 = userInput.nextInt();
							if (randomnumber%randomnumber2==answer2)
								{
									System.out.println("That is correct, good job.");
									correct = correct +1;
								}
							else if (randomnumber%randomnumber2!=answer2)
								{
									System.out.println("That is incorrect, the correct answer is, "+randomnumber%randomnumber2+", let's go to the next question.");
								}
						}
					else if (j%3!=0&&j%5!=0)
						{
							randomnumber = (int)(Math.random()*30)+10;
							randomnumber2 = (int)(Math.random()*10)+1;
							System.out.println("What is "+randomnumber+ " % "+randomnumber2 +"?");
							answer2 = userInput.nextInt();
							if (randomnumber%randomnumber2==answer2)
								{
									System.out.println("That is correct, good job.");
									correct = correct +1;
								}
							else if (randomnumber%randomnumber2!=answer2)
								{
									System.out.println("That is incorrect, the correct answer is, "+randomnumber%randomnumber2+", let's go to the next question.");
								}
						}
					else if (j%5!=0&&j%3==0)
						{
							randomnumber = (int)(Math.random()*30)+10;
							System.out.println("What is "+randomnumber+ " % "+randomnumber +"?");
							answer2 = userInput.nextInt();
							if (randomnumber%randomnumber==answer2)
								{
									System.out.println("That is correct, good job.");
									correct = correct +1;
								}
							else if (randomnumber%randomnumber!=answer2)
								{
									System.out.println("That is incorrect, the correct answer is, "+randomnumber%randomnumber2+", let's got to the next question.");
								}
						}
				}
		}
		public static void tellResult()
		{
			answer = answer-1;
			System.out.println("You got "+correct+" correct answers out of "+answer+" problems.");
		}
	}
	

	
