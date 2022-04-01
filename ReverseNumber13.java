//Write a java program to Reverse a given number.
import java.util.*;
public class ReverseNumber13{
       public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int num,reverse=0,temp,digit;
		num = sc.nextInt();
		temp=num;
		while(temp!=0){
			digit=temp%10;
			reverse=reverse*10+digit;
			temp=temp/10;
		}
		System.out.println("Reverse number is :"+reverse);
    }
}