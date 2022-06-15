//import statements
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; //importing lists

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
      name = (scanner.next());
      if (name.isBlank() == false) {
        System.out.println("you entered: " + name);
        } else {
        System.out.println("ERROR. Please enter a valid name.");
      }
    }
    return name;
  }
  
  public int Age(int Age) {
    Scanner ln = getScanner();
    int Age_Answered = 0;
    while (Age_Answered != 1) {
      Age = 0;
      try {
        System.out.println("please enter your age");
        Age = scanner.nextInt();
        if (Age >= 12 & Age <= 130) {
          System.out.println("you entered: " + Age);
          Age_Answered = 1;
          } else if (Age < 12) {
            System.out.println("Sorry you are not old enough to see this film.");
          Age_Answered = 1;
          } else if (Age > 130) {
            System.out.println("Sorry you are too old to see this film.");
          Age_Answered = 1;
          } else {
          System.out.println("ERROR. Please enter a valid integer (whole number).");
          }
      }catch (Exception e) {
      System.out.println("please enter a valid integer (whole number like 1, 2, 3)");
      System.out.println("error");
    }
  }
    System.out.println();
    return Age;
  }



  
//**********Main Routine **********
  public static void main(String[] args) {
    Main m = new Main();
    int tickets = 5;
    String name = "";
    Boolean ValidName = false;
    Boolean ValidAge = false;
    ArrayList<String> AllNames = new ArrayList<String>();
    ArrayList<Integer> AllAges = new ArrayList<Integer>();
    int Age = 0;
    
    while (tickets > 0) {
      System.out.println("There are " + tickets + " tickets left");
      name = m.Name(name);
      Age = m.Age(Age);
      //System.out.println(Age);
      if (Age >= 12) {
        ValidAge = true;
        }
      if (name.isBlank() == false) {
        ValidName = true;
      }
      if (ValidName == true) {
        AllNames.add(name);
      }
      if (ValidAge == true) {
        AllAges.add(Age);
      }
      if (ValidAge == true && ValidName == true) {
        tickets = tickets-1;
        
      } else {
        System.out.println("***Error - ticket not sold.***");
      }
      
      
    }
    
    System.out.println(AllNames);
    System.out.println(AllAges);
  }

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







/*

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
  }
}*/

