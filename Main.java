import java.util.Scanner;  // Import the Scanner class


public class Main {
//import statements


//functions go here
  public static void not_blank() {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What is your name?"); // this is how to print something
    String usersName = myObj.nextLine();  // Read user input
    System.out.println("Hello " + usersName);
  }
  
  public static void main(String[] args) {
    not_blank();
  }
  
//**********Main Routine **********

//set up dictionarius / lists needed to hold data

//Ask user if they have used the program before & show instructions if necessary

//Loop to get ticket details

  //get name (can't be blank)

  //get age (between 12 and 130)

  //calculate ticket price

  //loop to ask for snacks

  //calculate snack price

  //askfor payment method (and apply surcharge if necesary)

//calculate total sales and profit

//output data into text file

}



/*

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}*/