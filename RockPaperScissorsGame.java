import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = { "Rock", "Paper", "Scissors" };
        
        System.out.println("Welcome to Rock, Paper, Scissors! Game.");
        System.out.println("Choose your move:\n1. Rock \n2. Paper \n3. Scussirs");
        
        int options = scanner.nextInt();
        
        if (options < 1 || options > 3) {
            System.out.println("Invalid choice. Please choose a valid option.");
            scanner.close();
            return;
        }
        
        String userChoice = choices[options - 1];
        String computerChoice = choices[random.nextInt(3)];
        
        System.out.println("Your move: " + userChoice);
        System.out.println("Computer's move: " + computerChoice);
        
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if ((userChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                   (userChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose. Better luck next time!");
        }
        
        scanner.close();
    }
}
