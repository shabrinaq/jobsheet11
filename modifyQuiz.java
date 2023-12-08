import java.util.Random;
import java.util.Scanner;

/**
 * modifyQuiz
 */
public class modifyQuiz {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        Random rand = new Random();
        int userGuess;
        
        char menu = 'y';
            do {
                int number = rand.nextInt(10) + 1;
                boolean success = false;
                do {
                System.out.print("Enter your guess number (1-10): ");
                userGuess = input24.nextInt();
                input24.nextLine();
                success = (userGuess == number);

                if (userGuess == number) {
                    System.out.println("Your guess is correct!");
                } else if (userGuess < number) {
                    System.out.println("Try again! your guess is too low because it's smaller than the correct number.");   
                } else {
                    System.out.println("Try again! Your guess is too high because it is bigger than the correct number");    
                }

                } while (!success);
                System.out.print("Do you want to repeat the game (Y/N)" + ": ");
                menu = input24.next().charAt(0);
                input24.nextLine();
            } while (menu == 'Y' || menu == 'y');         
        }
    }

