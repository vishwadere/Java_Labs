
/*Create a Dictionary that stores keywords and its meanings, using appropriate data structure.
 Implement its operations such as add, delete, display, search and update its values.*/
import java.util.*;
public class BST
{
    public static void main(String[] args)
    {
        Binary b=new Binary();
        Scanner s=new Scanner(System.in);
        int ch,ch1;
        do
        {
            System.out.print("\n\t**MENU**\n0)Quit\n1)Create\n2)Display\n3)Search\n4)Update\n5)Delete \nEnter choice : ");
            ch1=s.nextInt();
            switch(ch1)
            {
                case 0 : System.out.println("Terminated");
                    break;

                case 1 :
                    System.out.println("enter the word");
                    String word=s.next();
                    System.out.println("enter the meaning of the word");
                    String meaning=s.next();
                    b.create(word, meaning);
                    break;

                case 2 :
                    b.Inorder_non();
                    break;

                case 3 :
                    System.out.println("enter the word to search");
                    String key=s.next();
                    b.search(key);
                    break;

                case 4 :
                    System.out.println("Enter the word to update its meaning");
                    String nkey=s.next();
                    b.update(nkey);
                    break;

                case 5 :
                    System.out.print("Enter word : ");
                    String mkey = s.next();
                    b.delete1(mkey);
                    break;
                default :
                    System.out.println("Invalid");
            }
        } while(ch1!=0);
        s.close();
    }
}

class node
{
    node left ,right;
    String word,meaning;
    public
    node(String word,String meaning)
    {
        left =right=null;
        this.word= word;
        this.meaning=meaning;
    }
}
//class binary
//{
//    Scanner sc = new Scanner(System.in);
//    node root;
//    public binary()
//    {
//        root=null;
//    }
//    void create() ;
//}
class NodeStack{
    int top;
    int MAXSIZE=100;
    node st[];

    public NodeStack() {
        this.top = -1;
        this.st = new node[MAXSIZE];
    }
    public boolean isEmpty()
    {
        if (top==-1)
            return true;
        return false;
    }
    public boolean isFull() {
        if (top==MAXSIZE-1)
            return true;
        return false;
    }
    public void push(node pushedElement)
    {
        if (!isFull()) {
            top++;
            st[top] = pushedElement;
        }
        else {
            System.out.println("Stack is full!");
        }
    }
    public node pop()
    {
        if (!isEmpty())
        {
            int returnedTop = top;
            top--;
            return st[returnedTop];
        }
        else {
            System.out.println("Stack is empty!");
        }
        return null;
    }
}
 class Binary {
    node root,ptr;
    Scanner sc=new Scanner(System.in);
    public Binary() {
        root=null;
    }
    NodeStack nobj=new NodeStack();
    void create(String word,String meaning) {

        node temp=new node(word,meaning);
        //node temp=new node();
        if(root==null)
        {
            root=temp;
        }
        else {
            ptr=root;
            while(ptr!=null) {
                if((temp.word).compareTo(ptr.word)<0) {
                    if(ptr.left==null) {
                        ptr.left=temp;
                        break;
                    }
                    else {
                        ptr=ptr.left;
                    }
                }
                else if((temp.word).compareTo(ptr.word)>0) {
                    if(ptr.right==null) {
                        ptr.right=temp;
                        break;

                    }
                    else {
                        ptr=ptr.right;
                    }
                }
            }
        }
    }
    //display the inorder traveral of BST
    void Inorder_non() {

        if(root==null) {
            System.out.println("Tree is not created");
            return;
        }
        node ptr=root;
        while(ptr!=null||nobj.isEmpty()!=true) {
            while(ptr!=null) {
                nobj.push(ptr);
                ptr=ptr.left;
            }
            ptr=nobj.pop();
            System.out.println();
            System.out.print(ptr.word + " : "+ptr.meaning);
            ptr= ptr.right;
        }
    }
    node search(String key) {
        node ptr=root;
        int flag=0;
        while(ptr!=null) {
            if(key.equals(ptr.word)) {
                flag=1;
                break;
            }
            else if(key.compareTo(ptr.word)<0) {
                ptr=ptr.left;
            }
            else if(key.compareTo(ptr.word)>0) {
                ptr=ptr.right;
            }
        }
        if(flag==1) {
            System.out.println("Meaning of the word "+key+" : "+ptr.meaning);
        }
        else if(flag==0) {
            System.out.println("Word not found :(");
        }
        return ptr;
    }

    void update(String key) {
        //updating the meaning of the word
        node ptr;
        ptr=search(key);
        if(ptr!=null) {
            System.out.println("enter new meaning ");
            String newMeaning=sc.next();
            ptr.meaning=newMeaning;
        }
        System.out.println("--------- Updated -------");
    }
    void delete1(String key) {

        node ptr,parent;
        ptr=root;
        parent=null;
        while(ptr!=null && (ptr.word).equals(key)!=true) {
            parent=ptr;
           // System.out.println("key :"+key);
            //System.out.println("ptr word :"+ptr.word);
            if(key.compareTo(ptr.word)<0) {
                ptr=ptr.left;
               // System.out.println(" left");
            }
            else if(key.compareTo(ptr.word)>0) {
               // System.out.println("right");
                ptr=ptr.right;
            }
        }

        if(ptr.left==null && ptr.right==null) {
            System.out.println("deleted");
            if(ptr!=root) {
                if(parent.left==ptr) {
                    parent.left=null;
                }
                else {
                    parent.right=null;
                }
            }
            else  {
                root=null;
            }
           // System.out.println("deleted leaf...");
        }


        else if(ptr.left!=null && ptr.right!=null) {
            node successor=null;
            if(root==null) {
                System.out.println("Tree is not created");
                return;
            }
            ptr=root;
            while(ptr!=null||nobj.isEmpty()!=true) {
                while(ptr!=null) {
                    nobj.push(ptr);
                    ptr=ptr.left;
                }
                ptr=nobj.pop();
                if(ptr.word==key) {
                    successor=nobj.pop();
                    break;
                }
                ptr= ptr.right;
            }
            String value=successor.word;
            String value_meaning=successor.meaning;
            delete1(successor.word);
            ptr.word=value;
            ptr.meaning=value_meaning;

        }
        else {
            node child=null;
            if(ptr.left!=null) {
                child=ptr.left;
            }
            else {
                child=ptr.right;
            }
            if(ptr!=root) {
                if (ptr== parent.left) {
                    parent.left = child;
                }
                else {
                    parent.right = child;
                }
            }
            else {
                root=child;
            }

        }
    }
}

//output
/*
**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 1
enter the word
opinion
enter the meaning of the word
view

	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 1
enter the word
image
enter the meaning of the word
picture

	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 1
enter the word
car
enter the meaning of the word
vehicle

	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 1
enter the word
mirror
enter the meaning of the word
reflector

	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 2

car : vehicle
image : picture
mirror : reflector
opinion : view
	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 3
enter the word to search
mirror
Meaning of the word mirror : reflector

	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 4
Enter the word to update its meaning
car
Meaning of the word car : vehicle
enter new meaning
fourwheeler
--------- Updated -------

	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 2

car : fourwheeler
image : picture
mirror : reflector
opinion : view
	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 5
Enter word : car
deleted

	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 2

image : picture
mirror : reflector
opinion : view
	**MENU**
0)Quit
1)Create
2)Display
3)Search
4)Update
5)Delete
Enter choice : 0
Terminated

Process finished with exit code 0
*/
