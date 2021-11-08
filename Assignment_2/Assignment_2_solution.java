import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int op=0;
        float n1,n2,n3,n4;
        int n;
        Scanner sc = new Scanner (System.in);
        System.out.println("let (a1)+(b1)i be the first complex number");
        System.out.println("let (a2)+(b2)i be the second complex number");
        //input for first number
        System.out.println("Enter a1");
        n1=sc.nextInt();
        System.out.println("Enter b1");
        n2 = sc.nextInt();
        //input for second number
        System.out.println("Enter a2");
        n3=sc.nextInt();
        System.out.println("Enter b2");
        n4 = sc.nextInt();
        float num1 = (n1+n2);
        float num2 = (n3+n4);
        System.out.println("The first complex number is: ("+n1+")+("+n2+")i");
        System.out.println("The second complex number is: ("+n3+")+("+n4+")i");
        do
        {
        System.out.println("enter \n1.to Add \n2.to Subtract \n3.to Multiply \n4.to Divide");
                op = sc.nextInt();
        switch(op)
        {
            //addition
            case 1 :
                float real1 = (n1+n3);
                float imaginary1=(n2+n4);
                System.out.println("Addition of ("+n1+")+("+n2+")i and ("+n3+")+("+n4+")i is: ("+real1+")+("+imaginary1+")i");
                break;
                //subtraction
            case 2:
                float real2 = (n1-n3);
                float imaginary2=(n2-n4);
                System.out.println("Subtraction ("+n1+")+("+n2+")i and ("+n3+")+("+n4+")i is : ("+real2+")+("+imaginary2+")i");
                break;
                //multiplication
            case 3:
                float real3 = (n1*n3-n2*n4);
                float imaginary3=(n1*n4+n2*n3);
                System.out.println("Product of ("+n1+")+("+n2+")i and ("+n3+")+("+n4+")i is : ("+real3+")+("+imaginary3+")i");
                break;
                //division
            case 4 :
                float den = (n3*n3+n4*n4);
                float real4 = (n1*n3+n2*n4)/den;
                float imaginary4= (n2*n3-n1*n4)/den;
                System.out.println("Division of ("+n1+")+("+n2+")i and ("+n3+")+("+n4+")i is : ("+real4+")+("+imaginary4+")i");
                break;
           
        }
         
			System.out.println("Press  1 to continue or 0 to exit ");
			 n = sc.nextInt();
		}
		while(n!=0);
    }
}
