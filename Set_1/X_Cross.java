package Set_1;

import java.util.Scanner;

public class X_Cross {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		String name;
		Scanner scanner = new Scanner(System.in);
		name=scanner.nextLine();
		char []it=name.toCharArray();
		int len=name.length();
		char[][] output=new char[len][len];
		int i,j,k=len-1;
		if(len%2!=0){
			for(i=0;i<len;i++){
				for(j=0;j<len;j++){
					if(i==j||j==k){
						output[i][j]=it[i];
					}
					else{
						output[i][j]=' ';
					}
				
				}
				k--;
			}
			for(i=0;i<len;i++){
				for(j=0;j<len;j++){
				System.out.print(output[i][j]);	
				}
				System.out.print("\n");
				}
		}
		
		scanner.close();
	}

}
