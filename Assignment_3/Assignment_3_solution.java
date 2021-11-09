import java.io.*;
import java.util.*;
public class Main{
    static int top_band_Student_grade=80;
    int Roll_NO;
    String name;
    int []Marks=new int[5];
    Main(int Roll_NO,String name,int []marks)
    {
        this.Roll_NO=Roll_NO;
        this.name=name;
        for(int i=0;i<5;i++)
        {
            Marks[i]=marks[i];
        }
    }
    String Calculate_grade(String str)
    {
        int avg;
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=Marks[i];
        }
        avg=sum/5;
       
        if (avg>=Main.top_band_Student_grade)
            str+="Roll No:"+Roll_NO+" Name: "+name+"\n";
        return str;
    }
    void Display_data()
    {
         System.out.println("\nRoll NO:"+Roll_NO);
         System.out.println("Name:"+name);
         System.out.println("Marks:\n");
         for(int i=0;i<5;i++)
         {
           System.out.print(" "+Marks[i]);
         }
    }
    public static void main(String []args)
    {
        Main []StudentDB=new Main[10];
        int Roll_NO;
        String name;
        int []Marks=new int[5];
       
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter Roll NO of student");
            Roll_NO=sc.nextInt();
            System.out.println("Enter name of student");
            name=sc.next();
       
            System.out.println("Enter Marks of 5 subjects");
       
            for(int j=0;j<5;j++)
            {
                 Marks[j]=sc.nextInt();
            }
       
            Main obj=new Main(Roll_NO,name,Marks);
            StudentDB[i]=obj;
        }
       
       
        System.out.println("\nData of all students");
        for(int i=0;i<10;i++)
        {
            StudentDB[i].Display_data();
        }
       
        System.out.println("\nTop Band students List\n");
       
        String str="";
        String str2="";
        for(int i=0;i<10;i++)
        {
            str2=StudentDB[i].Calculate_grade(str);
            str=str2;
        }
       
        System.out.println(str);
    }
}
