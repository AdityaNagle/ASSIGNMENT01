//1. Check the given number is EVEN or ODD.
import java.util.Scanner;
class Fact02
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int fact=1;
		int i=1;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of number is "+fact);
	}
}