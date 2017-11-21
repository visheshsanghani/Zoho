//Given a string, reverse only vowels in it; leaving rest of the string as it is.
//
//Input : abcdef
//Output : ebcdaf
package Set_1;

import java.util.Scanner;
public class reverseonlyvow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String input=scanner.next();
		char[] words=input.toCharArray();
		int j=words.length-1,i=0;
		while(i<j){
			while(!((words[j]=='a')||(words[j]=='e')||(words[j]=='i')||(words[j]=='o')||(words[j]=='u'))){
				j--;
			}
			while(!((words[i]=='a')||(words[i]=='e')||(words[i]=='i')||(words[i]=='o')||(words[i]=='u'))){
				i++;
			}
//			System.out.println("Here");
			char temp=words[i];
			words[i]=words[j];
			words[j]=temp;
			i++;
			j--;
		}
		input=words.toString();
		System.out.println(input);
	}

}
