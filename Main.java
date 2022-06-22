//import statements
import java.util.Scanner;  // Import the Scanner class
import java.util.ArrayList; //importing lists
import java.io.PrintWriter; // im porting way to print things to a txt file
import java.io.IOException;

public class Main {
//functions go here
  private Scanner scanner = new Scanner(System.in);

  public Scanner getScanner() {
    return scanner;
  }

  
  public String Name(String name) {
    name = "";
    Scanner ln = getScanner();
    while (name.isBlank() == true) {
      System.out.println("please enter your name");
      name = (scanner.nextLine());
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
      scanner.next();
    }
  }
    System.out.println();
    return Age;
  }



  
//**********Main Routine **********
  public static void main(String[] args) throws IOException {
    Main m = new Main();
    int tickets = 5;
    String name = "";
    String ExitCode = "xxx";
    double Cost = 0;
    double Profit = 0;
    Boolean ValidName = false;
    Boolean ValidAge = false;
    ArrayList<String> AllNames = new ArrayList<String>();
    ArrayList<Integer> AllAges = new ArrayList<Integer>();
    ArrayList<Double> AllCosts = new ArrayList<Double>();
    ArrayList<Double> AllProfits = new ArrayList<Double>();
    int Age = 0;
    


    
    while ((tickets > 0) & (name.equals(ExitCode) == false)) {
      
      System.out.println("There are " + tickets + " tickets left");
      name = m.Name(name);
      Age = m.Age(Age);


      
      if (130 >= Age && 12 <= Age) {
        ValidAge = true;
        }
      if (name.isBlank() == false) {
        ValidName = true;
        }
      if (ValidAge == true && ValidName == true) {
        tickets = tickets-1;
        if ((Age >= 12)& (Age <= 15)){
          Cost = 7.5;
          Profit = 2.5;
        }
        else if ((Age > 16) & (Age < 65)){
          Cost = 10.5;
          Profit = 5.5;
        }
        else if (Age >= 65) {
          Cost = 6.5;
          Profit = 1.5;
        }
        AllCosts.add(Cost);
        AllProfits.add(Profit);
        AllNames.add(name);
        AllAges.add(Age);
        
        int TicketsSold = AllNames.size() - 1;
        PrintWriter out = new PrintWriter("thing.txt");
        while (TicketsSold != -1){
          out.println("Name: " + AllNames.get(TicketsSold));
          out.println("Age: " + AllAges.get(TicketsSold));
          out.println("Cost: $" + AllCosts.get(TicketsSold));
          out.println("Profit: $" + AllProfits.get(TicketsSold));
          out.println();
          if (TicketsSold == 0) {out.close();} // Close the file.
          TicketsSold--;
        }
        
        
        
        
      
        
      
      } else {
        System.out.println("***Error - ticket not sold.***");
        }
      
      
      
    }
    
    System.out.println(AllCosts);
    System.out.println(AllProfits);
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








