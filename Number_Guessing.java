import java.util.Scanner;

public class Number_Guessing {
    public static void main(String[] args) {
        String choice;
        Scanner sc = new Scanner(System.in);

        do {
            int number = (int) (Math.random() * 100) + 1;
            int guess = 0;
            int count = 0;
            int max_count = 10;
            boolean flag = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have " + max_count + " attempts to guess the number.");

            while (count < max_count && !flag) {
                System.out.print("Enter your guess between 1 and 100: ");
                guess = sc.nextInt();
                count++;

                if (guess == number) {
                    System.out.println("You guessed it in " + count + " attempts!");
                    flag = true;
                } else if (guess < number) {
                    System.out.println("Your guess is too low.");
                    System.out.println((max_count - count) + " attempts remaining.");
                } else if (guess > number) {
                    System.out.println("Your guess is too high.");
                    System.out.println((max_count - count) + " attempts remaining.");
                }
            }

            if (!flag) {
                System.out.println("You have used all your attempts. The number was: " + number);
            }

            
            System.out.print("Do you want to play again (Yes/No): ");
            sc.nextLine();
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}