//Library Book Data Maintenance
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int choice,k=1,n = 0;
        Library ob = new Library();
        while(k!=0) 
        {
            System.out.println("Enter the choice to perform any operation:");
            System.out.println("1.To enter book details");
            System.out.println("2.Display the book details");
            System.out.println("3.Enter ISBN number to search a book");
            System.out.println("4.Search an author and find all his/her books");
            System.out.println("5.Sort books by ISBN number");
            choice=sc.nextInt();
            switch(choice) 
            {
                case 1:
                    System.out.println("Enter the number of books:");
                    n= sc.nextInt();
                    ob.AcceptBookDetails(n);
                    break;

                case 2:
                    ob.DisplayBookDetails(n);
                    break;

                case 3:
                    ob.searchByISBN(n);
                    break;
                case 4:
                    ob.searchByAuthor(n);
                    break;
                case 5:
                    ob.sortByISBN(n);
            }

            System.out.println("Press 1 to continue and 0 to exit");
            k = sc.nextInt();
        }
    }
}

class Books
{
    String BookName;
    String AuthorName;
    String PubName;
    int ISBNNo;
    Books()
    {
        BookName="";
        AuthorName="";
        PubName="";
        ISBNNo=0;
    }
}
class Library 
{
    Scanner sc = new Scanner(System.in);
    Books book[] = new Books[50];
    void AcceptBookDetails(int n)
    {
        for(int i=0;i<n;i++)
        {
            book[i] = new Books();
            System.out.println("Enter book "+(i+1)+" details");
            System.out.println("Enter the book name:");
            book[i].BookName=sc.next();
            System.out.println("Enter the authors name:");

            book[i].AuthorName=sc.next();
            System.out.println("Enter the ISBN number:");
            book[i].ISBNNo=sc.nextInt();
           
        }
    }
    void DisplayBookDetails(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("\nBook "+(i+1)+" details : \n");
            System.out.println("Book Name: "+book[i].BookName);
            System.out.println("Author name: "+book[i].AuthorName);
            System.out.println("ISBN: "+book[i].ISBNNo);
        }
    }

    void searchByISBN(int n) 
    {
        System.out.println("Enter ISBN number : ");
        int isbn = sc.nextInt();

        for(int i =0;i<n;i++) {
            if(book[i].ISBNNo==isbn) {
                System.out.println("The book is found at index "+(i+1)+"\nBook name : "+ book[i].BookName+"\nAuthor's Name : "+book[i].AuthorName);
                return;
            }
        }
        System.out.println("Book is not available in the library:(");
    }
    void searchbyISBNBinary(int n,int isbn) 
    {
        int i=-1;
        int start =0;
        int end=n;
        while(start<=end) {
            int mid=(end+start)/2;
            if(isbn<book[mid].ISBNNo) 
            {
                end=mid-1;
            }
            else if(isbn>book[mid].ISBNNo)
            {
                start=mid+1;
            }
            else 
            {
                i=mid;
            }
        }
        if(i==-1) 
        {
            System.out.println("Book not found !");
        }
        else 
        {
            System.out.println("The book is found at index "+(i+1)+"\nBook name : "+book[i].BookName+"\nAuthor's Name : "+book[i].AuthorName);
        }
    }
    void searchByAuthor(int n) 
    {
        int x=0;
        System.out.println("Enter author's name : ");
        String an = sc.next();
        for(int i=0;i<n;i++) 
        {
            if(book[i].AuthorName.contains(an))
            {
                x++;
                if(x==1) 
                {
                    System.out.println("Books written by "+an+" are : ");
                }
                System.out.println(book[i].BookName);
            }
        }
        if(x==0) 
        {
            System.out.println("No books found!");
        }
    }
    void sortByISBN(int n) 
    {
        for(int i=0;i<n-1;i++)
        {
            int min = i;
            for(int j =i+1;j<n;j++) 
            {
                if(book[j].ISBNNo<book[min].ISBNNo) 
                {
                    min =j;
                    Books b = book[min];
                    book[min]=book[i];
                    book[i]=b;
                }
            }
        }
        for(int i=0;i<n;i++) 
        {
            System.out.print(book[i].BookName+" : "+book[i].ISBNNo+" \n");
        }
    }
}
