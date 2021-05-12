package edu.wmich.CS3310.PA1.RajBasnet;

import java.util.Scanner;

/**
 * @author Raj
 * This is the main class which runs the main method for checking the balanced parentheses using stacks and queues
 */
public class Application {

	/**
	 * This is the main method of the class Application which checks for balanced parentheses.
	 * Creates an object checker1 and checker2 using StackParenthesesChecker and QueueParenthesesChecker class respectively.
	 * Initializes variable userInput as null and later asks the user to enter the string to be checked for balanced parentheses
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IParenthesesChecker checker1 = new StackParenthesesChecker();
		IParenthesesChecker checker2 = new QueueParenthesesChecker();

		/*
		 * The objects below are already created in the respective classes.
		 * Only one queue was used to check for balanced parentheses without using idea of converting two queues into stack
		 */
		//IStack<String> stack = new Stack<String>();
		//IQueue<String> queue1 = new Queue<String>();
		//IQueue<String> queue2 = new Queue<String>();

		String userInput = null;

		while(true) {

			/*
			 * Gives the choices for user either to continue checking for balanced parentheses or exit the program
			 * Introduces the scanner object for user input
			 */
			System.out.println("You have two choices: \n A: Continue checking with strings for balanced parentheses. \n B: Exit the program");
			Scanner input = new Scanner(System.in);

			/*
			 * If the choice is A, then continue, if B then exit the program, anything else asks the user again to choose until valid choice 
			 */
			while(true) {
				System.out.println("Enter your choice {A, B}");
				String choice = input.nextLine();
				if (choice.equalsIgnoreCase("B")) {
					System.exit(0);
				} else if (choice.equalsIgnoreCase("A")) {
					break;
				} else {
					System.out.println("Invalid choice");
				}
			}

			/*
			 * Asks the user to enter the random string that contains parentheses
			 * If user gives the valid string, then continue to check for balanced parentheses
			 * Else, keep on asking user to enter the string until valid string is given
			 */
			while (true) {
				int k = 0;
				System.out.println("Enter the paretheses:");
				String randomString = input.nextLine();
				userInput = randomString;
				for(int i = 0; i < userInput.length(); i++) {
					if (userInput.charAt(i) != '(' && userInput.charAt(i) != ')') {
						k = 10;
						break;
					} else {
						k = 0;
					}
				}
				if (k == 10) {
					System.out.println("Please, enter the valid parentheses only!!!");
				}
				if (k != 10) {
					break;
				}
			}

			//Prints the parentheses given by user
			System.out.println(userInput);

			//If user does not give any input, then print No parentheses entered
			if (userInput.isBlank()) {
				System.out.println("No parentheses entered");

				/*
				 * Using objects checker1 and checker2, check for the balanced parentheses using stack and queue respectively
				 */
			}else {

				/*
				 * Returns true for balanced parentheses if results from both stack and queue are true
				 * Gives message to user that input string has balanced parentheses 
				 */
				if(checker1.isBalanced(userInput) && checker2.isBalanced(userInput)) {
					System.out.println("The input string\t" + userInput + "\thas balanced parentheses.");
					//If even one of the result gives false, give message to user that string has unbalanced parentheses
				}else{
					System.out.println("The input string\t" + userInput + "\tdoes not have balanced parentheses.");	
				}
			}

			/*
			 * Asks the user for continuation to check the balanced parentheses
			 * If yes, the loop continues to check for another string
			 */
			System.out.println("Do you want to continue [Y/N]");
			String choice = input.nextLine();
			if (choice.equalsIgnoreCase("y")) {
				continue;

				//If no, close the scanner object and exit the program
			} else  {
				input.close();
				System.exit(0);
			}
		}
	}

}

