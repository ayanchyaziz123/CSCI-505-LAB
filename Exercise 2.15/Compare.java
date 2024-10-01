import java.util.Scanner; // Import the Scanner class

// Rahman code 
// Exercise 2.16:  Compare


// Compare clss
public class Compare {

    // private instance
    private int num1;
    private int num2;

    // constructor
    public Compare(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // compare number and display
    public void compareNumbers(){
        // if first one is larger
        if(this.num1 > num2){
            System.out.printf("%d is larger.%n", this.num1);
        }
        // if second one is larger
        else if(this.num1 < this.num2){
            System.out.printf("%d is larger.%n", this.num2);
        }
        // if they are equal
        else{
            System.out.println("These numbers are equal.");
        }
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

        // Create a Compare object with the provided numbers
        Compare compare = new Compare(number1, number2);
        // call the compareNUmbers()
        compare.compareNumbers();
    }
}
