import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GuessTheNumber {
    public static void main(String[] args) {
        Random random= new Random();
        Scanner scanner=new Scanner(System.in);

        int randomNum=random.nextInt(101);
        int numberOfTries=0;
        int userGuess=0;

        while(userGuess!=randomNum){
            System.out.println("Guess a number (1-100)");
             try {
                 userGuess = scanner.nextInt();
                 numberOfTries++;
                 if(userGuess<randomNum){
                     System.out.println("Too low!Try again");
                 }else if(userGuess>randomNum){
                     System.out.println("Too high!Try again");
                 }else{
                     System.out.println("Congratulations!You've guessed the number in " + numberOfTries + " attempts!");
                 }

             }
             catch (Exception e){
                 System.out.println("Please enter a valid number");
                 scanner.next();


             }


        }


    }
}