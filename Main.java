
  
//import statements
import java.util.Scanner;  // Import the Scanner class

public class Main {
//functions go here
  public static String get_Name(String usersName) {
    Scanner name = new Scanner(System.in);  // Create a Scanner object
    System.out.println("What is your name?"); // this is how to print something
    usersName = name.nextLine();  // Read user input
    if (usersName.isBlank() == false) {
      System.out.println("Hello " + usersName); 
      } 
    else {
      System.out.println("Name can not be blank"); 
      System.out.println("");
      get_Name(usersName); 
        }
    return usersName;
  }

  public static void ageFinder() {
    Scanner age = new Scanner(System.in);  // Create a Scanner object
    System.out.println("How old are you?"); // this is how to print something
    int usersAge = age.nextInt();  // Read user input
    if (usersAge >= 12) {
      age.close();
      System.out.println("You are " +usersAge +" year old?");
      }
      else if (usersAge < 12) {
      System.out.println("Sorry you need to be over the age of 12 to go to this movie."); 
      System.out.println("");
        }
      else if (usersAge < 12) {
      System.out.println("PLease enter a whole number"); 
      System.out.println("");
      ageFinder(); 
        }
  }

//**********Main Routine **********
  public static void main(String[] args) {
    String usersName = "place holder"; 
    get_Name(usersName);
    ageFinder();
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