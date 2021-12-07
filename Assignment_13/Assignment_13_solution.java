//import java.sql.SQLOutput;
import java.util.*;
//IMPORTING ALL THE CLASSES
import java.util.Stack;

import com.sun.tools.classfile.StackMap_attribute.stack_map_frame;

public class Tree
{
//Main class
    public static void main(String[] args)
    {
        int no;
        bt b=new bt();
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("**************************************");
            System.out.println("MENU: \n0.To add a root node\n1.To add other nodes \n2.Display the recursive Inorder \n3.Display the non recursive Inorder \n4.Display the recursive Preorder\n5.Display the non Recursive Preorder \n6.Display the recursive Postorder \n7.Display the non recursive Postorder");
            System.out.println("*************************************");
            System.out.println("\nEnter your choice: ");
            no=sc.nextInt();
            switch(no)//Switch case
            {
                case 0:
//                    System.out.println("\n 1 to add root node \n 2 to add a node");
                        System.out.println("enter data:");
                     int rootData=sc.nextInt();
                    b.createRoot(rootData);
                  System.out.println("Added successfully!");
                     break;
                case 1:
                    System.out.println("enter data: ");
                    int data=sc.nextInt();
                    b.create(data);
                    System.out.println("Added successfully!");
                    break;

                case 2:
                    System.out.println("\nThe Recursive Inorder is: ");
                    b.recursiveInorder(b.root);
                    break;
                case 3:
                    System.out.println("\nThe Non Recursive Inorder is: ");
                    b.nonrecursiveInorder();
                    break;
                case 4:
                    System.out.println("\nThe Recursive Preorder is: ");
                    b.recursivePreorder(b.root);
                    break;
                case 5:
                    System.out.println("\nThe Non Recursive Preorder is: ");
                    b.nonrecursivePreorder();
                    break;
                case 6:
                    System.out.println("\nThe Recursive Postorder is: ");
                    b.recursivePostorder(b.root);
                    break;
                case 7:
                System.out.println("\nThe Non Recursive Postorder is:  ");
                b.nonrecursivePostorder();
                break;
                default:
                    System.out.println("Invalid input");
                    break;

            }
            System.out.println("\nDo you want to continue? 1 to continue, 0 to exit");
            no=sc.nextInt();
        }
        while (no==1);
    }
}
class node
{
    node left,right;
    int data;
    public node (int data)//parameterized constructor
    {
        this.left=null;
        this.right=null;
        this.data=data;
    }
}

class bt
{
     node root,ptr;
   // int Stacki[],top;
     int top;
    public bt()
    {
        root=null;
        //Stacki=new int[20];
        top=-1;
    }
//    public bt(node root)
//    {
//        this.root=root;
//    }

//        int rn= input.nextInt();
//        do {
//            System.out.println("enter 1 for adding new node to the left \n 2 for adding new node to the right");
//            int ch= input.nextInt();
//           System.out.println("Enter the value");
//           int val=input.nextInt();
//            //int temp = val;
//            if(ch == 1)
//            {
//
//            }
//            else if(ch == 2)
//            {
//
//            }
//            else
//            {
//
//            }
//        }
//            {
//        }
//    }//Create tree
//    void recursiveInorder(node lRoot)//Recursive inorder function
//    void recursivePreorder(node lRoot)//Recursive Preorder function
//    void recursivePostorder(node lRoot)//Recursive Postorder function
//    void nonrecursivePreorder()//Non Recursive Preorder function
//    void nonrecursivePostOrder()//Non recursive post order function
//}

    Scanner sc=new Scanner(System.in);
    void createRoot(int data)
    {
        node temp;
        temp = new node(data);
        if (root == null)
        {
            root = temp;
        }
    }
//        Scanner input = new Scanner(System.in);

    void create(int data)
    {
        node temp;
        temp = new node(data);
        ptr = root;
        while (ptr != null)
        {
            System.out.println();
            System.out.println("current data: " + ptr.data);
            System.out.println("Enter '1' to add node to the left and '0' to add node to the right ");
            int c = sc.nextInt();
            if (c == 1)
            {
                if (ptr.left == null)
                {
                    ptr.left = temp;
                    break;
                }
                else
                {
                    ptr = ptr.left;
                }
            }
            else if (c == 0)
            {
                if (ptr.right == null)
                {
                    ptr.right = temp;
                    break;
                }
                else
                {
                    ptr = ptr.right;
                }
            }
        }
    }

    void recursiveInorder(node lroot)
    {
        if(lroot!=null)
        {
            recursiveInorder(lroot.left);
            System.out.print(lroot.data+" ");
            recursiveInorder(lroot.right);
        }
    }

    void nonrecursiveInorder()
    {
        if (root == null)
        {
            System.out.println("Tree is not created");
            return;
        }

        Stack<node> s = new Stack<node>();
        node ptr = root;


        while (ptr!= null || s.size() > 0)
        {
            while (ptr!=  null)
            {
                s.push(ptr);
                ptr= ptr.left;
            }
            ptr = s.pop();
            System.out.print(ptr.data + " ");
            ptr= ptr.right;
        }
    }

    void recursivePreorder(node lroot)
    {
        if(lroot!=null)
        {
            System.out.print(lroot.data+" ");
            recursivePreorder(lroot.left);
            recursivePreorder(lroot.right);
            //System.out.print(lroot.data+" ");
        }
    }

    void nonrecursivePreorder()
    {
        if (root == null)
        {
            System.out.println("Tree is not created");
            return;
        }
        Stack<node> s = new Stack<node>();
        node ptr = root;
        while (ptr!= null || s.size() > 0)
        {
            while (ptr!=  null)
            {
                System.out.print(ptr.data + " ");
                s.push(ptr);
                ptr= ptr.left;
            }
            ptr = s.pop();
            ptr= ptr.right;
        }
    }

    void recursivePostorder(node lroot)
    {
        if(lroot!=null)
        {
            recursivePostorder(lroot.left);
            recursivePostorder(lroot.right);
            System.out.print(lroot.data+" ");
        }
    }
    void nonrecursivePostorder()
    {
    Stack<node> stk = new Stack<node>();
    //Create a stack of Strings or character to store L and R flag
    Stack<String> flagStk = new Stack<>();
    node ptr=root;
    String flag=null;

    do {
    while(ptr!=null)
    {
    stk.push(ptr);
    flagStk.push("L");
    ptr=ptr.left;
    }
    if(stk.empty() == false)
    {
    ptr=stk.pop();
    flag=flagStk.pop();
    if(flag=="L")
    {
    stk.push(ptr);
    flagStk.push("R");
    ptr=ptr.right;
    }
    else
    {
    System.out.print(ptr.data+ " ");
    ptr=null;
    }
    }
    }while(stk.empty() == false);
}
}

//Output:
/*
 * **************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
0
enter data:
50
Added successfully!

Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
1
enter data:
60

current data: 50
Enter '1' to add node to the left and '0' to add node to the right
1
Added successfully!

Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
1
enter data:
70

current data: 50
Enter '1' to add node to the left and '0' to add node to the right
0
Added successfully!

Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
1
enter data:
60

current data: 50
Enter '1' to add node to the left and '0' to add node to the right
1

current data: 60
Enter '1' to add node to the left and '0' to add node to the right
0
Added successfully!

Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
2

The Recursive Inorder is:
60 60 50 70
Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
3

The Non Recursive Inorder is:
60 60 50 70
Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
4

The Recursive Preorder is:
50 60 60 70
Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
5

The Non Recursive Preorder is:
50 60 60 70
Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
6

The Recursive Postorder is:
60 60 70 50
Do you want to continue? 1 to continue, 0 to exit
1
**************************************
MENU:
0.To add a root node
1.To add other nodes
2.Display the recursive Inorder
3.Display the non recursive Inorder
4.Display the recursive Preorder
5.Display the non Recursive Preorder
6.Display the recursive Postorder
7.Display the non recursive Postorder
*************************************

Enter your choice:
7

The Non Recursive Postorder is:
60 60 70 50
Do you want to continue? 1 to continue, 0 to exit
0
*/
 */
