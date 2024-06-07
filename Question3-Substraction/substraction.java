
package substraction;
import java.util.Random;
import java.util.Scanner;
public class substraction {
   public static void main(String[] args) {
        
        Random random = new Random();
        int number1 = random.nextInt(20); 
        int number2 = random.nextInt(20); 
      
        if (number1 < number2) {
            int num1 = number1;
            number1 = number2;
            number2 = num1;
        }
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int studentAnswer = input.nextInt();

        //  Check the student's answer and display the result
        int correctAnswer = number1 - number2;
        if (studentAnswer == correctAnswer) {
            System.out.println("Correct! The answer is " + correctAnswer + ".");
        } else {
            System.out.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }
        
    }  
}
