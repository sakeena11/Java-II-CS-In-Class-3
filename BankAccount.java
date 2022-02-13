/**
  * BankAccount.java
  * @author Sakeena Younus
  * @description A basic bank account class
  * @version 2.0 2022-01-28
*/

import java.util.Scanner;

public class BankAccount {

  //_____attributes_____
  private final int ACCOUNTNUMBER; //this is a constant (we tell java this by saying final, we tell fellow coders by making all-caps)
  private double balance; //not static because different bank account have different balances
  private static int numberOfAccounts = 0; //starts at zero  //static because there's one variable for all of the bank account instances
  private static final int ROUTINGNUMBER = 1234567890; //declared here because it will never change
  private final String NAME;

  //_____methods_____
  /** constructor */
  public BankAccount(String name, double balance) {
    NAME = name;
    this.balance = balance;
    ACCOUNTNUMBER = 10000 + numberOfAccounts;
    numberOfAccounts++;
    System.out.println(this); //could also be accomplished by: System.out.println(toString())
  }

/**returns ACCOUNTNUMBER for the instance */
  public int getAccountNumber() {
    return ACCOUNTNUMBER;
  }

  /**returns balance for the instance */
  public double getBalance() {
      return balance;
  }

  /** sets balance */
  public void setBalance(double balance) {
        this.balance =  balance;
  }

  /** getter for the NAME instance attribute */
  public String getName() {
    return NAME;
  }

  /** static method that returns number of accounts made */
  public static int getNumberOfAccounts() {  //to access static variables
    return numberOfAccounts;
  }

  /** static method that returns routing number */
  public static int getRoutingNumber() {  //to access static variables
    return ROUTINGNUMBER;
  }

  /** */
  public String toString() {
    String s = "This account is owned by " + NAME;
    s += ". They have $" + balance + ". Their account number ";
    s += "is " + ACCOUNTNUMBER;
    return s;
  }

  /** main method */
  public static void main(String[] args) {
    BankAccount sy = new BankAccount("Sakeena Younus", 2);
    BankAccount malek = new BankAccount("Malek Elaghel", 500);

    System.out.println(sy.getAccountNumber());
    System.out.println(BankAccount.getNumberOfAccounts()); //static attribute
    System.out.println(BankAccount.getRoutingNumber());   //static attribute

  }
} //end of class
