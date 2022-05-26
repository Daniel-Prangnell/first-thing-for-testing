
  
//import statements
import java.util.Scanner;  // Import the Scanner class



public class Main {
  Scanner UserInput = new Scanner(System.in);  // Create a Scanner object
//functions go here
  public static String get_Name(String usersName) {

    System.out.println("What is your name?"); // this is how to print something
    usersName = UserInput.nextLine();  // Read user input
    if (usersName != "") {
      System.out.println("Hello " + usersName); }
      else {
      System.out.println("Name can not be blank"); 
      System.out.println("");
      get_Name(usersName); }
    
    return usersName;
  }

  public static int ageFinder(String usersName, int UsersAge) {
    System.out.println("How old are you? (please enter a whole number)"); // this is how to print something
    int usersAge = UserInput.nextInt();  // Read user input
    if (usersAge <= 12) {
      UserInput.close();
      System.out.println("so you are " + usersAge + " years old"); }
      else {
      System.out.println("Please enter an age"); 
      System.out.println(usersName);
      ageFinder(usersName,usersAge); }
  }

//**********Main Routine **********
  public static void main(String[] args) {
    String usersName = "place holder"; 
    int usersAge = 0;
    get_Name(usersName);
    ageFinder(usersName,usersAge);
  }
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