//Find appropriate class hierarchy, polymorphic behavior in applications like banking and implement it.

import java.util.*;
public class Main
{
public static void main (String[] args)
{
Scanner sc=new Scanner(System.in);
int choice=0, flag =0;
String accno;
double userbal;
System.out.println("Enter\n1.For Savings Account\n2.For Current Account\n");
choice=sc.nextInt();
if (choice==1)
flag=1;
else if (choice==2)
flag=2;
else
System.out.println("Exit");
System.out.println("Enter Your Account Number: ");
accno=sc.next();
System.out.println("Enter Your Balance: ");
userbal=sc.nextDouble();
SavingsAccount sacc = new SavingsAccount (accno,userbal);
CurrentAccount cacc = new CurrentAccount (accno,userbal);
if (flag == 1)sacc.choose();
else if (flag == 2)cacc.choose();
}
}
abstract class BankAccount
{

double bal;
String accno;
Scanner sc=new Scanner(System.in);
abstract void withdraw();
void deposit()
{
double amount = 0;
System.out.println("Enter the amount you want to deposit: ");
amount = sc.nextDouble();
bal=bal + amount;
System.out.println("The Amount you entered was successfully deposited: ");
showDetails();
choose();
}
void choose()
{
int choice=0;
System.out.println("Select one from the options listed down below: ");
System.out.println("Enter\n1. to Withdraw");
System.out.println("2. to Deposit");
System.out.println("3. to View details");
System.out.println("4. to Exit");
choice=sc.nextInt();
if (choice==1)
withdraw();
if (choice==2)
deposit();
else if (choice==3)
{
showDetails();
choose();
}
else
System.out.println("Thank you!\nvisit again!");
}
void showDetails()
{
System.out.println(" Account Number : "+accno+"\nBalance : "+bal );
}

}
class SavingsAccount extends BankAccount
{
SavingsAccount(String acc, double balance){
accno=acc;
bal=balance;
}
double minbal = 2000.00;
void withdraw(){
double amount = 0;
System.out.println("Min balance for Savings Account is "+minbal);
System.out.println("Enter the Amount to be withdrawn ");
amount = sc.nextDouble();
if((bal-amount)>=minbal)
{
bal= bal-amount;
System.out.println("Withdrawal was successfully done");
}
else
{
System.out.println("Min balance for Savings Account is" +minbal+ "Should be maintained\n" + "This action is not allowed\n");
}
showDetails();
choose();
}
}
class CurrentAccount extends BankAccount
{
CurrentAccount(String acc, double balance)
{
accno=acc;
bal=balance;
}
void withdraw()
{
double amount = 0;
System.out.println("Enter Amount to withdraw ");
amount =sc.nextDouble();

bal=bal-amount;
System.out.println("Withdrawl was successfully done!");
if (bal<0)System.out.println("Sorry! cannot complete this action./nAccount was Overdrawn!");
showDetails();
choose();
}
}




