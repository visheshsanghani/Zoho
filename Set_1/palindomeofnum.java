//Take a 2 or 3 digit input number, reverse it and add it to the original number until the obtained number is a palindrome or 5 iterations are completed.
//
//Input : n = 32
//Output : 55
//23 + 32 = 55 which is a palindrome.
//
//Input : 39
//Output : 363

package Set_1;

import java.util.Scanner;

public class palindomeofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int output=0,count=0,rem,temp;
		double c=0.0;
		int n=scanner.nextInt();
		temp=n;
		while(count<5){
			c=0;
			while(n!=0){
			rem=n%10;
			output*=Math.pow(10.0,c)+rem;
			n=n/10;
			c++;
			}
			boolean value=checkpal(output);
			if(value){
				System.out.println(true);
				break;
			}
		}
		

	}
	public static boolean checkpal(int output){
		int temp=output;
		int rem=0;
		int get=0;
		while(output>0){
			rem=output%10;
			output=output/10;
			get*=10+rem;
		}
		if(get==temp){
			return true;
		}
		return false;
	}

}
