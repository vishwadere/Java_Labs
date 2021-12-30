//Write a modular program to implement primitive operations on Min/Max Heap.
import java.util.*;
public class Heap{
  public static void main(String[] args) {
      Heap1 hp = new Heap1();
      Scanner sc = new Scanner(System.in);
      int ch,ch1,ans;
      do{
          System.out.println("1.Create\n2.Insert\n3.Display\n4.Delete\n5.Sort");
          ch = sc.nextInt();
          switch(ch){
              case 1:
                  hp.create();
                  break;
              case 2:
                  hp.addNode();
                  break;
              case 3:
                  hp.display();
                  break;
              case 4:
                  hp.delete();
                  hp.display();
                  break;
              case 5:
                  hp.heapSort();
                  hp.display();
                  break;
              default:
             System.out.println("Invalid input");
               break;
          }
          System.out.println("Enter 1 to continue: ");
          ch1 =  sc.nextInt();
      }while(ch1 == 1);
      System.out.println("Exit..");
  }
}

class Heap1
{
  Scanner sc =  new Scanner(System.in);
  int h[]=new int[20];
  int size=0;
  void create(){
      System.out.println("Enter any element : ");


      size++;
      h[size]=sc.nextInt();
      h[0] = size;
  }
  void addNode()
  {
      int i=1,parent=0,temp=0,ch=0,n=1;
      do{
          if(size==0){
              create();
          }
          else{
              System.out.println("Enter a new element : ");
              size++;
              h[size]=sc.nextInt();
              i=size;
              while(i>1){
                  parent=i/2;
                  if(h[i]>h[parent]){
                      temp=h[i];
                      h[i]=h[parent];
                      h[parent]=temp;
                      i=parent;
                  }
                  else
                  {
                      break;
                  }
              }
          }
          System.out.println("To add new element add new Node");
          ch = sc.nextInt();
      }while(ch==1);
  }
  void display()
  {
      for(int i=1;i<=size;i++)
      {
          System.out.println(" "+h[i]);
      }
      System.out.println();
  }
  void delete()
  {
      System.out.println("Element to be deleted : "+h[1]);
      int n=h[size];
      int i =1;
      h[i] = n;
      size--;
      downadjustment(i);
  }
  void downadjustment(int i)
  {
      int l=0, r=0, max=0,temp;
      while(l<size && r<size)
      {
          l=2*i;
          r=(2*i)+1;
          if(h[l]>h[r])
          {
             max=l;
          }
          else
          {
              max=r;
          }
          if(h[i]<h[max])
          {
              temp=h[i];
              h[i]=h[max];
              h[max]=temp;
              i=max;
          }
          else
          {
              return;
          }
      }
  }
  void heapify(int i, int n)
  {
      int max=i;
      int l=2*i;
      int r=(2*i)+1;
      int temp=0;
      if(l<n && h[l]>h[max])
      {
          max=l;
      }
      if(r<n && h[r]>h[max])
      {
          max=r;
      }
      if(max!=i)
      {
          temp=h[i];
          h[i]=h[max];
          h[max]=temp;
          heapify(n,max);
      }
  }
  void heapSort()
  {
      for(int i=(size/2);i>=1;i--)
      {
          heapify(size,i);
      }
      for(int i=size;i>=1;i--)
      {
          int temp = h[1];
          h[1] = h[i];
          h[i] = temp;
          heapify(i, 1);
      }
  }
}

//output:
/*
1.Create
2.Insert
3.Display
4.Delete
5.Sort
1
Enter any element :
20
Enter 1 to continue
1
1.Create
2.Insert
3.Display
4.Delete
5.Sort
1
Enter any element :
12
Enter 1 to continue
1
1.Create
2.Insert
3.Display
4.Delete
5.Sort
1
Enter any element :
16
Enter 1 to continue
1
1.Create
2.Insert
3.Display
4.Delete
5.Sort
3
 20
 12
 16

Enter 1 to continue
1
1.Create
2.Insert
3.Display
4.Delete
5.Sort
2
Enter a new element :
15
Enter 1 to continue
1
1.Create
2.Insert
3.Display
4.Delete
5.Sort
3
 20
 15
 16
 12

Enter 1 to continue
1
1.Create
2.Insert
3.Display
4.Delete
5.Sort
4
Element to be deleted : 20
 16
 15
 12

Enter 1 to continue
1
1.Create
2.Insert
3.Display
4.Delete
5.Sort
5
 16
 15
 12

Enter 1 to continue
0
Exit..
*/
