package Set_1;

//import java.util.ArrayList;
import java.util.Scanner;

public class add_array_of_numbers {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the number of digits:");
	int n=scanner.nextInt();
//	ArrayList num1=new ArrayList();
//	num1.
	int[] num1=new int[n];
	for(int i=0;i<n;i++){
		num1[i]=scanner.nextInt();
	}
	int[] num2=new int[n];
	for(int i=0;i<n;i++){
		num2[i]=scanner.nextInt();
	}
	int[] highest;
	int[] smallest;
	if(num1.length>num2.length){
		highest=num1;
		smallest=num2;
	}
	else{
		highest=num2;
		smallest=num1;
	}
	int[] num3=new int[n];
	for(int i=smallest.length-1;i>0;i--){
			num3[i]=highest[i]+smallest[i];
			if(num3[i]>10){
				num3[i]=num3[i]%10;
				highest[i+1]+=1;
			}
	}
	
}
}
