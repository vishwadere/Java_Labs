/*
Assignment 12
vishwa dere
Title: Implementation of Queue using array or linked list.
Problem Statement: Implement Queue as ADT using linked list or array. Use Queue ADT to simulate Pizza delivery operations for a 'Pizza Parlor system'.
*/

import java.util.*;
public class pizza extends Main
{
    String pizzaName;
    String size; // (S-small, M-medium ,L-large)
    int price;
}
 class pizzaParlour
 {
     Scanner scan = new Scanner(System.in);
     int front, rear, size;
     int maxSize;
     pizza order_list[];
     pizza obj = new pizza();

     public pizzaParlour(int q_size)
     {
         front = rear = 0;
         maxSize = q_size;
         order_list = new pizza[maxSize];
     }

     boolean isFull()
     {
         if (rear == maxSize)
         {
             return true;
         } else
             return false;
     }

     boolean isEmpty()
     {
         if (front==rear)//((front < 0)|| (front > rear))
         {
             return true;
         }
         else
             return false;
     }

     void placeOrder() //enqueue
     {
         if (!isFull() && rear< maxSize)
         {
             System.out.println("Enter the details for your order: ");
             System.out.println("Pizza Name: ");
             order_list[rear] = new pizza();
             order_list[rear].pizzaName = scan.next();
             System.out.println("Pizza size: ");
             order_list[rear].size = scan.next();
             System.out.println("Pizza price: ");
             order_list[rear].price = scan.nextInt();
             rear=rear+1;
         }
         else
             System.out.println("Sorry! Cannot place the order, queue is full :(");
     }

     void deliverOrder() //dequeue
     {
        if(isEmpty())
        {
            System.out.println("All orders are delivered!");
        }
        else
        {
            System.out.println("Order delivered!");
            rear=rear-1;
        }
     }

     void displayOrder() //All the orders present in the queue
     {
         if(isEmpty())
         {
             System.out.println("All orders are delivered!");
         }
         else
         {
             System.out.println("your orders are: ");
             for (int i = front; i < rear; i++)
             {
                 System.out.println("**** order " + (i + 1) + " ****");
                 System.out.println("pizza name: " + order_list[i].pizzaName);
                 System.out.println("pizza size: " + order_list[i].size);
                 System.out.println("pizza price: " + order_list[i].price + "\n");
             }
         }
     }
 }
     class Main
     {
         public static void main(String[] args)
         {
             Scanner sc = new Scanner(System.in);
             System.out.println("enter the size of queue: ");
             int q_size = sc.nextInt();
             pizzaParlour piz = new pizzaParlour(q_size);
             int ans;
             do
             {
                 System.out.println("-----Menu-----");
                 System.out.println("Enter\n1. Place Order\n2. Deliver Order\n3. Display Order");
                 int choice = sc.nextInt();
                 switch (choice)
                 {
                     case 1:
                         piz.placeOrder();//call place order for pizza
                         break;
                     case 2:
                         piz.deliverOrder();//call deliver order for pizza
                         break;
                     case 3:
                         piz.displayOrder();
                         break;
                     default:
                         System.out.println("Enter a valid option");
                 }
                 System.out.println("would you like to continue? If yes, enter 1");
                 ans = sc.nextInt();
             } while (ans == 1);

         }

     }

//Output:
/*
enter the size of queue: 
2
-----Menu-----
Enter
1. Place Order
2. Deliver Order
3. Display Order
1
Enter the details for your order: 
Pizza Name: 
cheeze
Pizza size: 
S
Pizza price: 
200
would you like to continue? If yes, enter 1
1
-----Menu-----
Enter
1. Place Order
2. Deliver Order
3. Display Order
1
Enter the details for your order: 
Pizza Name: 
paneer
Pizza size: 
M
Pizza price: 
300
would you like to continue? If yes, enter 1
1
-----Menu-----
Enter
1. Place Order
2. Deliver Order
3. Display Order
3
your orders are: 
**** order 1 ****
pizza name: cheeze
pizza size: S
pizza price: 200

**** order 2 ****
pizza name: paneer
pizza size: M
pizza price: 300

would you like to continue? If yes, enter 1
1
-----Menu-----
Enter
1. Place Order
2. Deliver Order
3. Display Order
2
Order delivered!
would you like to continue? If yes, enter 1
1
-----Menu-----
Enter
1. Place Order
2. Deliver Order
3. Display Order
3
your orders are: 
**** order 1 ****
pizza name: cheeze
pizza size: S
pizza price: 200

would you like to continue? If yes, enter 1
1
-----Menu-----
Enter
1. Place Order
2. Deliver Order
3. Display Order
2
Order delivered!
would you like to continue? If yes, enter 1
1
-----Menu-----
Enter
1. Place Order
2. Deliver Order
3. Display Order
3
All orders are delivered!
would you like to continue? If yes, enter 1
0

Process finished with exit code 0
*/


