import java.util.Scanner;
 class Student 
{
   
     String name;
     double Per;
    int age;
    
    Student()
    {
        name=null;
        age=1;
        Per=0;
    }
    void Accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name: ");
        name= sc.next();
        System.out.println("enter age ");
        age=sc.nextInt();
        System.out.println("enter percentage ");
        Per=sc.nextInt();
    }
    void Display()
    {
        System.out.println("Student Name: "+name);
        System.out.println("age : "+age);
        System.out.println("percentage "+Per);
       
    }
}
 class Eligible extends Exception
{
    Eligible(String s)
    {
        super(s);
    }
}
class Main
{
    static void val(double Per)throws Eligible
    {
        if(Per<60)
        throw new Eligible ("not eligible ");
        else
        System.out.println("you are eligible ");
    }
    public static void main(String[]args)
    {
       Scanner sc= new Scanner(System.in);
        //System.out.println("enter number of students ");
        //int n=sc.nextInt();
        int n=2;
        Student ns[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter information of "+(i+1)+" student ");
             ns[i]=new Student();
            ns[i].Accept();
        }
        for(int j=0;j<n;j++)
        {
            System.out.println("Displaying the information of "+(j+1)+" student");
            ns[j].Display();
          
        }
        try
        {
            for(int i=0;i<2;i++)
            {
                System.out.println("Candidate "+(i+1));
                val(ns[i].Per);
                System.out.println();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception occured "+e);
        }
    }
}
