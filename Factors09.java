//Write a Java Program to print all the Factors of the Given number.
// num =10--> 1  2  5  10
import java.util.*;
public class Factors09 {
	public static void main(String args[]){
		int num;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Factors is ");
		for(int i=1;i<=num;i++){
			if(num%i==0){
			System.out.println(i+"");
			}
		}
	}
}