import java.util.Scanner;

/**
 * this program enters 1 to the number the user enters
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //creates variable for the number entered
    int n, i;
    
    //asks the user to enter a positive interger
    System.out.println("Please enter a positive integer");
    n = input.nextInt();

    //for loop that counts from 1 until it reaches the number entered
    for(i = 1; i >= 0; i++){
      System.out.print(i + ",");
    //when the entered number is reached stop the loop
    if(n==i)
      break;
    }

  }
}
