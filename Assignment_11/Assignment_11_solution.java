*Assignment 4
Implementation of Stack using array or linked list.*/
//code:

import java.util.*;
 class Stack //create a class
{
    int max_size;
    int []stk;
    char []stkn;
    int top;
    int flag;
    String str;
    public Stack(int s) //initialize all variables
    {
        max_size=s;
        stk=new int [max_size];
        top=-1;
        flag=0;
    }
    public Stack(String sstr)
    {
        str=sstr;
        max_size=sstr.length();
        stkn=new char [max_size];
        top=-1;
        flag=1;
    }
    int isfull()
    {
        if (top==max_size-1)
        {
            return 1;
        }
        else
            return 0;
    }
    int isempty()
    {
        if(top==-1)
            return 1;
        else
            return 0;

    }
    void push(int element)
    {
        if(this.isfull()==0)
        {
            top++;
            stk[top] = element;
            //System.out.println("pushed element: "+element);
        }
        else
        {
            System.out.println("stack is full");
        }
    }
    void push(char element)
    {
        if(this.isfull()==0)
        {
            top++;
            stkn[top] = element;
            //System.out.println("pushed element: "+element);
        }
        else
        {
            System.out.println("stack is full");
        }
    }

    void pop()
    {
        if(this.isempty()==0)
        {
            int returnedTop=top;

            if (flag==1) {
                System.out.print(""+stkn[top]);
                top=top-1;
            }
            else {
                System.out.println(""+stk[top]);
                top=top-1;
            }
        }
        else {
            System.out.println("Stack is empty");
        }
    }
    int isOperator(char c)
    {
        if((c=='+')||(c=='*')||(c=='/')||(c=='-')) {
            return 1;
        }
        else
            return 0;
    }
    void evaluate(String str)
    {
        Scanner scan = new Scanner(System.in);
        int i=0, finalval=0;
        for(i=0;i<str.length();i++)
        {
            if(this.isOperator(str.charAt(i))==0)
            {
                System.out.println("enter value for "+str.charAt(i));
                int temp=scan.nextInt();
                this.push(temp);
            }
            else
            {
                if(this.isempty()==0)
                {
                    int op1=(stk[top]);
                    int op2=(stk[top-1]);
                    top=top-2;
                    if(str.charAt(i)=='+')
                    {
                        finalval=op1+op2;
                    }
                    else if(str.charAt(i)=='-')
                    {
                        finalval=op2-op1;
                    }
                    else if(str.charAt(i)=='*')
                    {
                        finalval=op2*op1;
                    }
                    else if(str.charAt(i)=='/')
                    {
                        finalval=op2/op1;
                    }
                    this.push(finalval);
                }
            }
        }
        System.out.println("final answer is: "+(stk[top]));
    }
    void reverse(){
        int i=0;
        for(i=0;i<str.length();i++) {
            if (this.isfull()==0) {
                this.push(str.charAt(i));
            }
        }
        i=0;
        for(i=0;i<str.length();i++)
        {
            if (this.isempty()==0) {
                this.pop();
            }
        }

    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum size of stack:");
        int max = sc.nextInt();
        int exit=0;
        Stack s1= new Stack(max);
        int ans;
        do{ //Make Menu Driven Program
            System.out.print("Enter 1 for solving postfix expression and 2 for reversing a sting");
            System.out.println("\nenter option");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1: {
                    System.out.println("\nEnter a postfix expression");
                    String mystr=sc.next();
                    Stack s3=new Stack(mystr.length());
                    s3.evaluate(mystr);
                }
                    break;
                case 2:
                {
                    System.out.println("\nEnter a string:");
                    sc.nextLine();
                    String s = sc.nextLine();
                    Stack s2= new Stack(s);
                    System.out.println("Reverse of the string:");
                    s2.reverse();
                }
                break;
                default:
                {
                    System.out.println("Enter Valid Option!!");
                }
            }
            System.out.print("\nWould you like to continue? if yes,enter 1");
            ans=sc.nextInt();
        }while(ans==1);
    }
}
/*OUTPUT:
Enter maximum size of stack:
10
Enter 1 for solving postfix exp and 2 for reversing a sting
enter option
1

Enter a postfix expression
ab-
enter value for a
5
enter value for b
4
final answer is: 1

Would you like to continue?if yes,enter 11
Enter 1 for solving postfix exp and 2 for reversing a sting
enter option
2

Enter a string:
vishwa
Reverse of the string:
awhsiv
Would you like to continue?if yes,enter 10

Process finished with exit code 0

 */