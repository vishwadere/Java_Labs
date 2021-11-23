import java.util.Scanner;
public class Node {

	public static void main(String[] args) {
		bank obj=new bank();
		
		Scanner a=new Scanner(System.in);
		int cont=1;
		do {
			System.out.printf("Enter your choice : \n 1]Create Accounts \n 2]Display Accounts \n3]Insert an account \n4]Delete an account \n 5]Deposit Money \n 6]Withdraw Money ");
			
			int ch=a.nextInt();
			switch(ch) {
			case 1:
				obj.create();
				break;
			case 2:
				obj.display();
				break;
			case 3:
				obj.insert();
				break;
			case 4:
				obj.delete();
				break;
			case 5:
				obj.deposit();
				break;
			case 6:
				obj.withdraw();
				break;
			default :
				System.out.println("Invalid choice");
			}
		}while(cont!=0);
          
	}

}
class Account_node 
{	
   Scanner sc=new Scanner (System.in);
   long Account_no;
   String Name;
   String address;
   float balance;
   Account_node link;  
   Account_node(){}
   Account_node(String name,String addr,long ac,float b)
  {
   Account_no=ac;
   address=addr;
   Name=name;
   balance=b ;
   link=null; 
  }
}
class bank extends Account_node
{
  Account_node head;
  Account_node ele=new Account_node();
  
  void create(){
	  System.out.println("Enter total number of accounts to be created");
	  int num=sc.nextInt();
	  do {
	  System.out.println("Enter Account number");
	  Account_no=sc.nextLong();
	  sc.nextLine();
	  System.out.println("Enter Name");
	  Name=sc.nextLine();
	  System.out.println("Enter Address");
	  address=sc.nextLine();
	  System.out.println("Enter Balance");
	  balance=sc.nextFloat();
	  Account_node temp=new Account_node(Name,address,Account_no,balance);
	  if(head==null) {
		  head=temp;
	  }
	  else {
		  ele=head;
		  while(ele.link!=null) { //ele.link refers to next node
			  ele=ele.link;
		  }
		  ele.link=temp;	  
			  
	     }
	  num--;
	  }while(num!=0);
	 }
  void insert() {
	  //function declaration
	  int count=1;
	  do {
		 ele=head; 
		 System.out.println("Enter the position at which new account is to be inserted");
		  int pos=sc.nextInt();
		  System.out.println("Enter Account number");
		 Account_no=sc.nextLong();
		  sc.nextLine();
		  System.out.println("Enter Name");
		  Name=sc.nextLine();
		  System.out.println("Enter Address");
		  address=sc.nextLine();
		  System.out.println("Enter Balance");
		  balance=sc.nextFloat();
	 Account_node temp=new Account_node(Name,address,Account_no,balance);
	      if(pos==1) {
	    	  head=temp;
	      }
	      else {
	    	  Account_node pre=new Account_node();
	    	  for(int i=1;i<=pos-1;i++) {
	    		  pre=ele;
	    		  ele=ele.link;
	    	  }
	    	  pre.link=temp;
	    	  temp.link=ele;
	      }
	      System.out.println("Press 0 to exit and any number to continue");
	      int p=sc.nextInt();
	      count=p;
		  }while(count!=0);
  }
  void delete() 
  {
	  System.out.println("\nEnter account number to delete the acccount :");
		int pos=sc.nextInt();
		int i=0,yes=0;
		Account_node ref = head;
		Account_node prev =null;
	    if ((pos==head.Account_no)&&(ref!=null)){
	    	head=ref.link;
	    	yes=1;
	    }
	    else {
	    	while(ref!=null) {
				if (pos==ref.Account_no) {
					yes=1;
					break;
				}
				prev=ref;
				ref=ref.link;
				i++;
			}
	    	if (yes==1) {
	    		prev.link=ref.link;
	    		System.out.println("Account deleted!");
	    	}
	    		
	    	    
	    	if (yes==0)
	    		System.out.println("Account not found!");
	    }
  }
  void display() 
  {
	  if(head==null)
		  System.out.println("No data present");
	  else {
		  ele=head;
		  do {
			 System.out.println("Account number : "+ele.Account_no);
			 System.out.println("Name : "+ele.Name);
			 System.out.println("Address : "+ele.address);
			 System.out.println("Balance : "+ele.balance);
			 ele=ele.link;
		  }while(ele!=null);
		  
	  }
  }
  void deposit() 
  {
	  int yes=0;
		System.out.println("\nEnter account number:");
		int acc_no=sc.nextInt();
		Account_node ref = head;
		while(ref!=null) {
			if (ref.Account_no==acc_no) {
				yes=1;
				break;
			}
			ref=ref.link;
		}
		if( yes==1) {
			System.out.println("\nEnter amount to be deposited:");
			float amt=sc.nextFloat();
			ref.balance = ref.balance+amt;
			System.out.println("New Balance :"+ref.balance);
		}
		else {
			System.out.println("Account not found!");
		}
  }
  void withdraw()
  {
	  int yes=0;
		System.out.println("\nEnter account number:");
		int acc_no=sc.nextInt();
		Account_node ref = head;
		while(ref!=null) {
			if (ref.Account_no==acc_no) {
				yes=1;
				break;
			}
			ref=ref.link;
		}
		if(yes==1) {
			System.out.println("\nEnter amount to withdraw:");
			float amt=sc.nextFloat();
			if(amt<=ref.balance) {
				ref.balance = ref.balance-amt;
				System.out.println("New Balance :"+ref.balance);
			}
			else {
				System.out.println("Insufficient Balance!");
			}
		}
		
		else {
			System.out.println("Account not found!");
		}

	}
	bank()
	{
	  head=null;
	}
  }
  
  /*OUTPUT*/
/*Enter your choice : 
 1]Create Accounts 
 2]Display Accounts 
3]Insert an account 
4]Delete an account 
 5]Deposit Money 
 6]Withdraw Money 1
Enter total number of accounts to be created
2
Enter Account number
10
Enter Name
Vishwa
Enter Address
west2
Enter Balance
345000
Enter Account number
20
Enter Name
Piyusha
Enter Address
south2
Enter Balance
321344
Enter your choice : 
 1]Create Accounts 
 2]Display Accounts 
3]Insert an account 
4]Delete an account 
 5]Deposit Money 
 6]Withdraw Money 3
Enter the position at which new account is to be inserted
2
Enter Account number
30
Enter Name
Samiksha
Enter Address
south78
Enter Balance
300900
Press 0 to exit and any number to continue
0
Enter your choice : 
 1]Create Accounts 
 2]Display Accounts 
3]Insert an account 
4]Delete an account 
 5]Deposit Money 
 6]Withdraw Money 4

Enter account number to delete the acccount :
30
Account deleted!
Enter your choice : 
 1]Create Accounts 
 2]Display Accounts 
3]Insert an account 
4]Delete an account 
 5]Deposit Money 
 6]Withdraw Money 5

Enter account number:
10

Enter amount to be deposited:
500
New Balance :345500.0
Enter your choice : 
 1]Create Accounts 
 2]Display Accounts 
3]Insert an account 
4]Delete an account 
 5]Deposit Money 
 6]Withdraw Money 6

Enter account number:
20

Enter amount to withdraw:
500
New Balance :320844.0*/