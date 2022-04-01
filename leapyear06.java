//6. Write a Java Program to find whether given number is Leap year
import java.util.Scanner;
class leapyear06
{     
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the year:");
	int Year = sc.nextInt();
	if((Year%4==0)&&(Year%100!=0)||(Year%400==0))
		System.out.println("Is a leap year :");
	else
		System.out.println("Not a Leap Year :");
}
}