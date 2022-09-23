import java.util.*;

public class GuessingGame {
    public static void main(String[] args) throws InterruptedException{
        Scanner input = new Scanner(System.in);
        boolean correctGuess = false;
        int guess = 0;
        int increment = 0;

        System.out.println("Hello user. What is your name?");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " I'm thinking of a number between 1 and 100.");
        Random rand = new Random();
        int number = rand.nextInt(100);

        //Print "Try to guess my number."
        System.out.println("Try to guess my number.");

        //Create a while loop, and set the condition to correctGuess being equal to false
        while (correctGuess == false)
        {
            //increase the increment value by 1
            increment++;

            //Create a try catch statement that catches Exception e
            try
            {
                //Set guess equal to input.nextInt()
                guess = input.nextInt();
            }
            catch (Exception e)
            {
                //Create a new String called badInput and set it to input.next()
                String badInput = input.next(); //needed to progress past the bad input

                //Print "That's not an integer, try again"
                System.out.println("That's not an integer, try again");

                //Use continue to skip back to the beginning of the while loop
                continue;
            }

            //Use an if statement to see if the guess is greater than 100 or less than 1
            if (guess > 100 || guess < 1)
            {
                //Print "You're guess is out of range. Please try again."
                System.out.println("You're guess is out of range. Please try again.");
            }

            //Use an else-if statement to check if the guess is greater than the number
            else if (guess > number)
            {
                //Print "You're guess is too high. Please try again."
                System.out.println("You're guess is too high. Please try again.");
            }

            //Use an else-if statement to check if the guess is less than the number
            else if (guess < number)
            {
                //Print "You're guess is too low. Please try again."
                System.out.println("You're guess is too low. Please try again.");
            }

            //Use an else-if statement to check if the guess is equal to number
            else if (guess == number)
            {
                //Print "Well done, name! You found my number in increment tries!"
                System.out.println("Well done, " + name + "! You found my number in " + increment + " tries!");

                //Set correctGuess equal to true
                correctGuess = true;
            }


        }
        new MarsExpedition(); //creating an instance of the MarsExpedition class
        new FindingsLists();
    }

}
