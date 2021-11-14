import java.util.*;
public class Main {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("For book:\nenter the name\nprice\nquantity\nisbn no");
		Book b=new Book(sc.nextLine(),sc.nextDouble(),sc.nextInt(),sc.nextInt());
		
		
		System.out.println("For magzine\nenter the name\nprice\nquantity\ndate of issue");
		Magzine m=new Magzine(sc.next(),sc.nextDouble(),sc.nextInt(),sc.next());
		
		
		System.out.println("For CD\nenter the name\nprice\nquantity\nduration");
		CD c=new CD(sc.next(),sc.nextDouble(),sc.nextInt(),sc.next());
		
		
		System.out.println("Book Details are: ");
		b.display();
		System.out.println();
		System.out.println("Magzine Details are: ");
		m.display();
		System.out.println();
		System.out.println("CD details are: ");
		c.display();
			
	}

}

 class Reads
 {
	private String title;
	private double price;
	protected double totalprice;
	private int qty;
	public Reads(String title, double price,int qty) 
	{
		super();
		this.title = title;
		this.price = price;
		this.qty=qty;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public int getQty() 
	{
		return qty;
	}
	public void setQty(int qty) 
	{
		this.qty=qty;
	}
	public void calculate(double price,int qty)
	{
		totalprice=price*qty;
	}
	public void display() 
	{
		System.out.println("TITLE :"+title);
		System.out.println("PRICE :"+price+"/-");
		System.out.println("QUANTITY :"+qty);
	}
}



 class Book extends Reads 
 {

	private int isbnNo;
	
	public Book(String title, double price,int qty, int isbnNo) 
	{
		super(title, price,qty);
		this.isbnNo = isbnNo;
	}

	public int getIsbnNo() 
	{
		return isbnNo;
	}

	public void setIsbnNo(int isbnNo) 
	{
		this.isbnNo = isbnNo;
	}
	
	public void display() 
	{		
		super.display();
		System.out.println("ISBN NO: "+isbnNo);
		System.out.println("TOTAL PRICE: "+getPrice()*getQty()+"/-");
	}
}


 class Magzine extends Reads 
 {
	private String month;
	public Magzine(String title, double price,int qty, String month) 
	{
		super(title, price,qty);
		this.month = month;
	}

	public String getIssue_month() 
	{
		return month;
	}

	public void setIssue_month(String issue_month) 
	{
		this.month = month;
	}
	public void display() 
	{
		super.display();
		System.out.println("MONTH OF ISSUE :"+month);
		System.out.println("TOTAL PRICE: "+getPrice()*getQty()+"/-");

	}
}


 class CD extends Reads 
 {

	private String duration;

	public CD(String title, double price,int qty, String duration) 
	{
		super(title, price,qty);
		this.duration = duration;
	}
	
	public String getDuration() 
	{
		return duration;
	}


	public void setDuration(String duration) 
	{
		this.duration = duration;
	}

	public void display() 
	{
		super.display();
		System.out.println("DURATION : "+duration);
		System.out.println("TOTAL PRICE: "+getPrice()*getQty()+"/-");
	}
}
