package Set_1;

import java.util.Scanner;

public class Stringmissmatch {
public static void main(String[] args) {
	String str1;
	String str2;
	Scanner scanner=new Scanner(System.in);
	str1=scanner.nextLine();
	str2=scanner.nextLine();
	char[] cstr1=str1.toCharArray();
	char[] cstr2=str2.toCharArray();
	if(cstr1.length==cstr2.length){
		for(int i=0;i<cstr1.length;i++){
			if(cstr1[i]!=cstr2[i]){
				System.out.println(cstr1[i]+" , "+cstr2[i]);
			}
		}
	}
}
}
