import java.util.Scanner;
public class Main
 {
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
		int option=0;	
		String s2;
		String s3;
	
		//Accepting string from user
		int length;
		int n;
		int z;
		String s1;
		System.out.print("Enter a string : ");
		s1 = sc.nextLine();
		System.out.println("1 Enter 1 to print the length of string");
      		 System.out.println("2 Enter 2 to concatenate");
   		 System.out.println ("3 Enter 3 to reverse the string");
   		System.out.println ("4 Enter 4 to Compare the strings");
System.out.println ("5 Enter 5 for Substring");
System.out.println ("6 Enter 6 to Exit");
			option = sc.nextInt();
			
		switch(option)
		{
		 case 1:
		     {
		//Printing the output
		System.out.println("Entered string is : " +s1);
		break;
		     }
		case 2:
		    {
		length = s1.length();
		System.out.println("Length of entered string is : " +length);
		break;
		    }
		case 3:
		    {
		//String concatenation
		System.out.println("Enter string 2 :");
		s2 = sc.nextLine();
		System.out.println(s1+""+s2);
		s1 = s1.concat(s2);
		System.out.println("The concatenated string is :"+s1 );
		break;
		    }
		case 4:
		    {
		//Reverse the string
		char ch;
		System.out.println(" The reversed string is : ");
		String rev = " " ;
		for (int i = s1.length();i>0;--i) 
		{
		    System.out.print(s1.charAt(i-1));
		}
		    break;
		    }
		 case 5:
		 {
		//Comparing two strings
		System.out.println(" Enter string 2 : ");
		s3 = sc.nextLine();
		if (s1 == s3)
		{
		    System.out.println(" \nThe strings are equal ");
		} 
       else
       System.out.println("\n The strings are not equal ");
       break;
		 }
		 case 6:
		     {
		      System.out.println("enter index for substring ");
		      n = sc.nextInt();
		     System.out.println(s1.substring(n));
		     break;
		     }
		 default:
		 System.out.println("invalid input");
		     
		}
	
			}	
	
}
