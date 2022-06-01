
  
//import statements
import java.util.Scanner;  // Import the Scanner class

public class Main {
//functions go here
  private Scanner scanner = new Scanner(System.in);

  public Scanner getScanner() {
    return scanner;
  }

  
  public String Name(String name) {
    name = "";
    while (name.isBlank() == true) {
    System.out.println("please enter your name");
    Scanner ln = getScanner();
    name = (scanner.nextLine());
      if (name.isBlank() == false) {
        System.out.println("you entered: " + name);
      }
    }
  return name;
  }
  
  public int Age(int Age) {
    Age = 0;
    while (Age < 12) {
      System.out.println("please enter your age");
      Scanner ln = getScanner();
      Age = (scanner.nextInt());
      if (Age >= 12) {
        System.out.println("you entered: " + Age);
      }
      else if (Age < 12) {
        System.out.println("please enter a valid integer");
      }
    }
    return Age;
  }



  
//**********Main Routine **********
    public static void main(String[] args) {
      Main m = new Main();
      String name = "";
      m.Name(name);
      System.out.println(name);

      int Age = 0;
      m.Age(Age);
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

