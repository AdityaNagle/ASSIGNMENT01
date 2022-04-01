import java.util.*;
public class Palindrome17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num, temp, rightDigit,reverse=0;
		System.out.println("Enter number :");
		num=sc.nextInt();
		temp=num;
		while(temp!=0){
			rightDigit=temp%10;
			reverse=reverse*10+rightDigit;
			temp=temp/10;
		}
		if(reverse==num){
			System.out.println("Palindrome Number ");
		}else {
			System.out.println("Not Palindrome Number ");
		}
		
	}
	
}