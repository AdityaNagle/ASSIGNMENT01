//1. Check the given number is EVEN or ODD.
import java.util.Scanner;
class EvenOdd01
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		if (num%2==0)
		    System.out.println("The given number is even");
		else
			System.out.println("the given number is odd");	
	}
}