package Set_1;

import java.util.Scanner;

public class del1 {
	public static void cal(int n){
		char s[]=new char[10];
		int i=0;
		while(n>0){
			int num=n%26;
			System.out.println("num :"+num);
			if(num==0){
				s[i]='z';
				
			}
			else{
				s[i]=(char)(num+'a');
				
			}
			n=num;
//			System.out.println(n);
//			System.out.println(s[i]);
			i++;
		}
		int j=0;
		while(j<i){
		System.out.print(s[j]);
		j++;
		}
		System.out.println();
	}
public static void main(String[] args) {
	cal(26);
	cal(1000);
//	Scanner scanner=new Scanner(System.in);
//	s=scanner.nextLine().toCharArray();
	
	
}
}
