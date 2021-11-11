import java.util.*;
public class main 
{
     public static void main(String args[])
     {
          int n;
         for(n=0;n<=3;n++)
         {
         employee employeobj=new employee();
         employeobj.read(); 
      employeobj.display(); 
         }
         
     }
}
class employee
{
   
     private String employeid;
     private String empname,apname,apnum,pincode;
     private double basicsalary,HRA,DA,GS,incometax,netsalary;
     public void read()
     {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the employee id");
        employeid=scan.next();
        System.out.println("Enter the employee name");
        empname=scan.next();
        System.out.println("Enter the basic salary of an employee");
        basicsalary=scan.nextInt();
        calculate();
        System.out.println("Enter the apartment name");
        apname=scan.next();
        System.out.println("Enter the apartment number");
        apnum=scan.next();
        System.out.println("Enter the pincode");
        pincode=scan.next();
     }
     public void calculate()  //calculating all the parameters
     {
        HRA=0.2*basicsalary;
        DA=0.45*basicsalary;
        GS=basicsalary+DA+HRA;
        incometax=0.07*basicsalary;
        netsalary=GS-incometax;
     }
     public void display()  //displaying the calculating parameters
     {
         System.out.println("Details of the employee are: ");
         System.out.println("\nEmployee id  :  "+employeid+"\nEmployename  :  "+empname+"\nEmployee basic salary :  "+basicsalary+"\nHRA  :  "+HRA+"\nDA  :  "+DA+"\nGS  :  "+GS+"\nIncometax  :  "+incometax+"\nnetsalary  :  "+netsalary);
     
         System.out.println("Address : "+apname+" "+apnum+" "+pincode);
        
     }
 
}
