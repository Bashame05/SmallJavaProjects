import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        //gathering variables
        String userChoice;
        String compChoice;
        String[] choices = {"rock🪨" , "paper📄" , "scissors️✂️"};
        String playAgain;
        //assigning choices
        do{
            System.out.println("    🪨  📄  ✂️     ");
            System.out.print("Enter your move(rock/paper/scissors): ");
            userChoice = sc.nextLine().toLowerCase();
            if(userChoice.equals("rock")){
                userChoice += "🪨";
            } else if (userChoice.equals("paper")) {
                userChoice += "📄";
            } else if (userChoice.equals("scissors")) {
                userChoice += "✂️";
            }
            compChoice = choices[random.nextInt(3)].toLowerCase();
            if (!userChoice.equals("rock🪨") && !userChoice.equals("paper📄") && !userChoice.equals("scissors✂️")) {
                System.out.println("Invalid input! Please enter rock, paper, or scissors.");
                playAgain = "y";
                continue; // Skip to next iteration
            }

            if(userChoice.equals(compChoice)){
                System.out.println("The user selected : "+userChoice);
                System.out.println("The computer selected : "+compChoice);
                System.out.println("ITS A TIEEEEEE!!!");
            } else if (userChoice.equals("rock🪨") && compChoice.equals("scissors✂️") ||
                    userChoice.equals("paper📄")&&compChoice.equals("rock🪨") ||
                    userChoice.equals("scissors✂️")&&compChoice.equals("paper📄")) {
                System.out.println("The user selected : "+userChoice);
                System.out.println("The computer selected : "+compChoice);
                System.out.println("YAYYY YOU WONNNN!!!");
            }else{
                System.out.println("The user selected : "+userChoice);
                System.out.println("The computer selected : "+compChoice);
                System.out.println("SORRYYY YOU LOSTTTTT!!!");
            }
            System.out.print("Do you wanna play again(y/n): ");
            String again = sc.nextLine();
            playAgain = again.toLowerCase();
        }while(playAgain.equals("y"));
        System.out.println("THANKS FOR PLAYING!!!!!");
        sc.close();
    }
}
