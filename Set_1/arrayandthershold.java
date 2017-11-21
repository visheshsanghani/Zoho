package Set_1;

import java.util.Scanner;

public class arrayandthershold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output=0;
		System.out.println("Enter the number of values");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=scanner.nextInt();
		}
		System.out.println("Enter thershold");
		int thershold=scanner.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Here: "+ output);
			output+=array[i]/thershold;
			if(array[i]%thershold!=0){
				output++;
			}
		}
		
		System.out.println("Output : "+ output);

	}

}
