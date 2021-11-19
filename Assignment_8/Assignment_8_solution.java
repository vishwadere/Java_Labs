import java.util.*;
class Matrix
{
	int r, c, t;	
	Scanner sc = new Scanner(System.in);
	int[][] mat = new int[r][c];
	//taking input from the user for the matrix
	void AcceptMatrix() 
	{
		System.out.print("Enter number of rows in the matrix ");
		r = sc.nextInt();
		System.out.print("Enter number of columns in the matrix ");
		c = sc.nextInt();		
		mat = new int[r][c];
		System.out.println("Enter the matrix: ");
		for(int i=0; i<r; i++) 
		{
			for (int j=0; j<c; j++) 
			{
				mat[i][j] = sc.nextInt();
			}
		}		
	}
	//displaying the entered matrix
	void Display()
	{
		System.out.println("the entered matrix is:");
		for(int i=0; i<r; i++) 
		{
			for (int j=0; j<c; j++) 
			{
				System.out.print(mat[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}	
	//for the choice of matrix operation
	void choices() 
	{
		System.out.println("Enter a valid input to perform matrix operation from the given list: ");
		System.out.println("1. Check if you matrix is square");
		System.out.println("2. Check if you matrix is upper triangular");
		System.out.println("3. Compute transpse of the matrix.");
		System.out.println("4. Addittion of another matrix");
		System.out.println("5. Multiply two matrices");
		System.out.println("6. Exit");
	}
	//to check for square matrix
	void checkSquare()
	{
		if(r==c) 
		{
			System.out.println("The given matrix is a square matrix.");
		}
		else {
			System.out.println("The given matrix is not a square matrix.");
		}
	}
	//to compute transpose of the given matrix
	void transpose()
	{
		t=r;
		r=c;
		c=t;
		System.out.println("The transpose of your matrix will be: ");
		for (int j=0; j<r; j++) 
		{
			for(int i=0; i<c; i++) 
			{
				System.out.print(mat[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}
	//to check whether the entered matrix is upper triangular or not
	void upperTriangular() 
	{
		int i,j;
		int flag=0;
		for(i=0; i<r; i++)
		{
			for (j=0; j<c; j++) 
			{
				if(i>j && mat[i][j]!=0 && r==c) 
				{
					flag = 1;
					break;
				}
			}
		}
		if(flag==0)
		{
			System.out.println("It is an upper triangular matrix.");
		}
		else 
		{
			System.out.println("It is not an upper triangular matrix.");
		}
	}
	
}
public class MatrixOperation
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Matrix obj = new Matrix();
		Matrix obj1 = new Matrix();
		Matrix obj2 = new Matrix();
		obj.AcceptMatrix();
		obj.Display();
		int a=0, flag=0;
		char ans;
		do
		{
			obj.choices();
			System.out.println("Choose an operation: ");
			a = scan.nextInt();
		switch(a) 
		{
		case 1:
		    {
			obj.checkSquare();
			break;
		}
		case 2:
		    {
			obj.upperTriangular();
			break;
		}
		case 3:
		    {
			obj.transpose();
			break;
		}
		case 4:
			{
				System.out.println("Enter a matrix to add: ");
				obj1.AcceptMatrix();
				if(obj2.r==obj.r && obj2.c==obj.c) {
				System.out.println("Addition of the matrices is: ");
				for(int i=0; i<obj.r; i++) 
				{
					for (int j=0; j<obj.c; j++) 
					{
						System.out.print(obj.mat[i][j]+obj1.mat[i][j]+ " ");
					}
					System.out.print("\n");
				}	
				}
				else 
				{
					System.out.println("number of rows adn columns should be same for adiition of matrices");
				}
				break;
			}
		case 5:
			{
				System.out.println("Enter a matrix to multiply: ");
				obj2.AcceptMatrix();
				obj2.Display();
				
				if(obj2.c == obj.r) 
				{
					int sum=0;
					int[][] mul = new int[obj2.r][obj.c];
					for (int k = 0; k<obj2.r; k++) 
					{
						for(int l = 0; l < obj.c; l++)
						{					
								for(int m = 0; m<obj2.c; m++) 
								{
									sum = 	sum + (obj2.mat[k][m]*obj.mat[m][l]);
							}
							mul[k][l]=sum; sum=0;
						} 
					} 
					System.out.println("the multiplied matrix is: ");
					for(int i=0; i<obj2.r; i++) 
					{
						for (int j=0; j<obj.c; j++) 
						{
							System.out.print(mul[i][j]+ " ");
						}
						System.out.print("\n");
					}
				}
			
				else {
					System.out.println("We cannot multiply the given matrices.");
				}
				break;
			}
		case 6: 
			System.out.println("End");
			flag = 1;
			break;
		default:
			System.out.print("Invalid choice");
		}
		}
		while(flag == 0);
	}
}
