package Set_1;

import java.util.Arrays;
import java.util.Scanner;

public class ocuuranceinintarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("number of values needed");
		int n=scanner.nextInt();
		int []number=new int[n];
		for(int i=0;i<n;i++){
			number[i]=scanner.nextInt();
		}
		int count=1;
//		for(int i=0;i<n;i++){
//			System.out.println(number[i]);
//		}
		Arrays.sort(number);
//		for(int i=0;i<n;i++){
//			System.out.println(number[i]);
//		}
		for(int i=0;i<=n;i++){
//			System.out.println("number[i] : " + number[i]);
//			System.out.println("number[i+1] :"+ number[i+1]);
			if(i+1<n){
			if(number[i]==number[i+1]){
				
//				System.out.println("number[i] : " + number[i]);
//				System.out.println("number[i+1] :"+ number[i+1]);
				count++;
			}
			else{
				System.out.println(number[i] + " : " + count);
				count=1;
			}
		}
			}
		scanner.close();
		}
}
