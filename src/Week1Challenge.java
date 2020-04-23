/**
 * This program is a simulation of a dice game
 * When the game start, two number are randomly selected
 * if one of the number is 1, the score is 0
 * if both numbers are 1, the score is 25
 * otherwise, the score is the sum of both numbers
 * The user can decide at any time to stop playing
 * The game will end if the score is 100 or above
 */

/**
 * Start
 * Declare two integer variables
 * Declare an integer variable sum and assign 0
 * Two numbers are randomly selected from 1-6
 *      and assigned to the first 2 integer declared
 * If the two numbers are 1, assign 25 to sum
 * Else If one of the two numbers is 1, assign 0 to sum
 * Else, assign the two numbers to sum
 * If the sum is less than 100, Ask the user if he wants to continue
 *     If the user answer yes, randomly select two numbers again and check them
 *     If the user answer if no, end the game.
 * If the sum is equal or more than 100, end the game and display the score.
 *
 */

import java.util.Scanner;
import java.util.Random;

public class Week1Challenge {
    public static void main (String [] args) {
        Random rd = new Random();
        Scanner in = new Scanner(System.in);

        //Declare the two numbers
        int num1, num2, total;
        //Declare sum and assign 0 to it
        int sum = 0;
        //Declare the user answer and assign yes
        //Declare a boolean variable and assign true
        //This is to start the first run
        String ans = "yes";
        boolean bool = true;

        //Welcome the user and start the game
        System.out.println("Welcome! Let's Play Roll Dice! ");
        while (bool && sum < 100 ) {

            //Randomly assigning values to the two integer
            num1 = 1 + rd.nextInt(6);
            num2 = 1 + rd.nextInt(6);

            //Check if one of the two numbers is 1
            if ((num1 == 1 && num2 != 1) || (num1 != 1 && num2 == 1)) {
                sum += 0;
            }

            //Check if both numbers are 1
            else if (num1 == 1 && num2 == 1) {
                sum += 25;
            }

            else {
                total = num1 + num2;
                sum += total;
            }

            //Display the numbers and the score
            System.out.println("Your rolls " + num1 + " & " +  num2);
            System.out.println("Score: " + sum);

            //End the game if the score is over 100
            if (sum >= 100) {
                System.out.println("You have scored over 100");
                System.out.println("Thank you for playing!");
                bool = false;
            }

            //Otherwise, ask the user to continue
            else {
                System.out.println("Roll again? ");
                ans = in.nextLine();

                //Continue the game if the user answer yes
                if (ans.equals("yes")  || ans.equals("y")) {
                    bool = true;
                }

                //End the game if the user answer no
                else {
                    bool = false;
                    System.out.println("Thank you for playing.");
                }

            }
        }

    }
}