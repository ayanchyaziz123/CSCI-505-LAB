import java.util.Scanner; // Import the Scanner class
import java.math.*;;

// Rahman code
// Exercise 2.15:  Arithmetic


// Arithmetic class
public class Arithmetic {

    // private instance 
    private int num1;
    private int num2;

    // constructor initialize
    public Arithmetic(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // public method
    public  int getSum(){
        return this.num1 + this.num2;
    }
    public  int getProduct(){
        return this.num1 * this.num2;
    }

    public int getDifference(){
        return Math.abs(this.num1-this.num2);
    }

    public int getQuotient(){
        return this.num1 / this.num2;
    }

    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the first integer
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt(); // Read the first integer

        // Prompt the user to enter the second integer
        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt(); // Read the second integer

        // Calculate the sum, product, difference, and quotient

        Arithmetic arithmetic = new Arithmetic(number1, number2);

        // Display the results
        System.out.printf("Sum: %d%n", arithmetic.getSum());
        System.out.printf("Product: %d%n", arithmetic.getProduct());
        System.out.printf("Difference: %d%n", arithmetic.getDifference());
        if(number2 == 0){
            System.out.printf("Quotient: Can not be divided by 0");
        }
        else{
            System.out.printf("Quotient: %d%n", arithmetic.getQuotient());
        }
    }
}
