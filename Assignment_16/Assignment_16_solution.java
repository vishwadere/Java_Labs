/* A news paper delivery boy every day drops news paper in a society having many lanes and houses. Represent this as a graph using adjacency matrix or adjacency list. Perform Depth First traversal and Breadth First traversal.*/

package graph;
import java.util.*;
public class BFSDFS
{
public static void main(String args[])
{
Graph g=new Graph();
Scanner sc=new Scanner(System.in);
int ch;
do
{
System.out.println("\nMENU");
System.out.println("1.create graph\n2.BFS \n3.DFS \n4.exit");
System.out.println("Enter your choice: ");
ch=sc.nextInt();
switch(ch)
{
case 1:
g.createGraph();
g.adjlistdis();
break;

case 2:
g.graphBFS();
break;

case 3:
g.callDFS();
break;

case 4:
System.out.println("Terminating...");
break;

default:
System.out.println("invalid input");
break;

}
}while(ch!=4);
}
}

class Node
{
Node next;
int data;
Node(int d)
{
data=d;
next=null;
}
}

class Graph
{
Scanner sc=new Scanner(System.in);
Node Head[]=new Node[20];
int adjmat[][]=new int[10][10];

int v,e;

void createGraph()
{
System.out.println("\nEnter the number of houses: ");
v=sc.nextInt();

for(int i=1;i<=v;i++)
Head[i]=null;

System.out.println("Enter the number of lanes: ");
e=sc.nextInt();

for(int i=1;i<=e;i++)
{
int start,end;
System.out.print("Enter the starting house: ");
start=sc.nextInt();
System.out.print("Enter the ending house: ");
end=sc.nextInt();

insertedge(start,end);
insertedge(end,start);

adjmat[start][end]=1;
adjmat[end][start]=1;

System.out.println();
}
System.out.println("\n Adjacency Matrix: ");

for(int n=1;n<=v;n++)
System.out.print("    "+n+"");

System.out.println();
for(int j=1;j<=v;j++)
{
System.out.print((j)+"  ");
for( int k=1;k<=v;k++)
System.out.print(" "+adjmat[j][k]+"   ");

System.out.println();
}

}

void insertedge(int st,int en)
{
Node point=new Node(st);
Node temp=new Node(en);

if(Head[st]==null) //if no node is linked to vertex st;
{
Head[st]=point;
Head[st].next=temp;
}
else
{ //if nodes are linked with vertex st;
Node ptr;
ptr=Head[st];
while(ptr.next!=null)
ptr=ptr.next;
ptr.next=temp;
}
}

void adjlistdis()
{
System.out.println("\nAdjacency List: ");

for(int i=1;i<=v;i++)
{
if(Head[i]==null)
{
System.out.println(i+"->null");
}
else
{
Node ptr;
ptr=Head[i];
System.out.print("|"+Head[i].data+"|-> ");
while(ptr.next!=null)
{
ptr=ptr.next;
System.out.print(+ptr.data+" -> ");
}
System.out.print("null");
}
System.out.println("");
}

}

void graphBFS()
{
System.out.println("\n BFS: ");
int s; //start vertex
int vs; //visited vertex
int visited[]=new int[v+1]; //visit array
        Queue<Integer> queue=new LinkedList<Integer>();
        System.out.println("Enter the vertex to start traversal with: ");
        s=sc.nextInt();
        queue.add(s);
        visited[s]=1;
        System.out.println("Traversal is: \n");
        while(queue.isEmpty()==false)
        {
       vs=queue.remove();
       System.out.print(vs+"\t");
       for(int i=1;i<=v;i++)
       {
       if(adjmat[vs][i]==1 && visited[i]!=1)
       {
       queue.add(i);
       visited[i]=1;
       }
       }
        }
        System.out.println();
    }
  int visited[];           //visit array

void callDFS()
{
int s; //start vertex
  System.out.println("\nDFS: ");
  System.out.println("Enter the vertex to start traversal with: ");
  s=sc.nextInt();
  visited=new int[v+1];
  graphDFS(s,v); //s::start vertex,v::total no of vertexs
}

void graphDFS(int s,int v)
{
visited[s]=1;
Node p;
int w;
p=Head[s];
System.out.print(s+"\t");
while(p!=null)
{
w=p.data;
if(visited[w]==0)
graphDFS(w,v);
p=p.next;
}
}
}

/*
 Output:
 

MENU
1.create graph
2.BFS
3.DFS
4.exit
Enter your choice:
1

Enter the number of houses:
7
Enter the number of lanes:
11
Enter the starting house: 0
Enter the ending house: 1

Enter the starting house: 1
Enter the ending house: 2

Enter the starting house: 2
Enter the ending house: 3

Enter the starting house: 3
Enter the ending house: 0

Enter the starting house: 3
Enter the ending house: 4

Enter the starting house: 4
Enter the ending house: 2

Enter the starting house: 4
Enter the ending house: 6

Enter the starting house: 6
Enter the ending house: 1

Enter the starting house: 1
Enter the ending house: 5

Enter the starting house: 5
Enter the ending house: 2

Enter the starting house: 1
Enter the ending house: 3


 Adjacency Matrix:
    1    2    3    4    5    6    7
1   0    1    1    0    1    1    0  
2   1    0    1    1    1    0    0  
3   1    1    0    1    0    0    0  
4   0    1    1    0    0    1    0  
5   1    1    0    0    0    0    0  
6   1    0    0    1    0    0    0  
7   0    0    0    0    0    0    0  

Adjacency List:
|1|-> 0 -> 2 -> 6 -> 5 -> 3 -> null
|2|-> 1 -> 3 -> 4 -> 5 -> null
|3|-> 2 -> 0 -> 4 -> 1 -> null
|4|-> 3 -> 2 -> 6 -> null
|5|-> 1 -> 2 -> null
|6|-> 4 -> 1 -> null
7->null


MENU
1.create graph
2.BFS
3.DFS
4.exit
Enter your choice:
2

 BFS:
Enter the vertex to start traversal with:
0
Traversal is:

0 1 3 2 5 6 4

MENU
1.create graph
2.BFS
3.DFS
4.exit
Enter your choice:
3

DFS:
Enter the vertex to start traversal with:
0
0 1 2 3 4 6 5
MENU
1.create graph
2.BFS
3.DFS
4.exit
Enter your choice:
4
Terminating...


 */

