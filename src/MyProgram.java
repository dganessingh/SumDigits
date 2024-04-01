import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        long inputNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String userInput = scanner.nextLine();        
        if (userInput.matches("^\\d+$") == false) {  //regular expression for matching for a number
            System.out.println("Invalid input. Please enter an integer.");
            return;
        }
        inputNumber = Long.parseLong(userInput);
        int sumOfDigits = SumDigits.sumDigits(inputNumber);
        System.out.println("The sum of digits for " + inputNumber + ": " + sumOfDigits);
    }
}

class SumDigits {
    //Note: Finds the sum of digits in provided number
    public static int sumDigits(long n){
        int sum = 0;
        // Loop while the number (n) is not equal to 0
        while (n != 0) {
            // Finds the last digit from the number and adds it to the variable sum
            sum += n % 10;  //sum = sum + (int)(n % 10);
            // Removes the last digit from the number
            n /= 10;  //n = n/10;
        }
        return sum;
    }
}

