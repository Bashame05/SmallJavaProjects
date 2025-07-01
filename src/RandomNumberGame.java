import java.util.*;

public class RandomNumberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String ch;
        do{
            int num = rnd.nextInt(1,11);
            int tries = 3;
            for(int i=0;i<tries;i++){
                System.out.print("Guess the number(between 1-10):");
                int ans = sc.nextInt();
                if((i==tries-1)){
                    System.out.println("Sorryyy you ran out of tries the correct answer was "+num);
                    break;
                }
                if(ans==num){
                    System.out.println("Yayyy you guessed the number correctly!!!!!!!");
                    break;
                }else if(ans<num){
                    System.out.println("You guessed too low try a higher number.");
                }else {
                    System.out.println("You guessed too high try a lower number.");
                }
            }
            System.out.print("Do you want to play the game again:(y/n):");
            String choice = sc.next();
            ch = choice.toLowerCase();
        }while(ch.equals("y"));
    }
}
