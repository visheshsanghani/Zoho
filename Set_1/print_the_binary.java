package Set_1;

import java.util.Scanner;

public class print_the_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		//int num=n*n;
		int rem=0,mul=1;
//		int[][] mat={};
//		System.out.println(mat.toString());
		
		for(int i=0;i<n;i++){
			rem=0;mul=1;
			int j=i;
			while(j>0){
				rem=rem*mul+j%2;
				j=j/2;
				mul*=10;
			}
			System.out.println(i+" "+(rem));
		}
		
		scanner.close();	
	}

}
