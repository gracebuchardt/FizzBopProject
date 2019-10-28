import java.util.Scanner;

public class Fizz_Buzz_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub





		//Make variables 
		int input;

		//Scanner
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number please.");
		input=in.nextInt();


		//Loop
		for (int x=1;x<=input;x++) {

			//lIf number is divisible by both, print FizzBuzz
			if (x%3==0 && x%5==0)  {
				System.out.println("FizzBuzz");
			}

			// If number  divisible by 3, print Fizz
			else if (x%3==0)  {
				System.out.println("Fizz");
			}


			//f the number is divisible by 5, print Buzz
			else if (x%5==0) {
				System.out.println("Buzz");
			}



			//If number isn't divisible, print the number.

			else {
				System.out.println(x);
			}

		}

	}	
}