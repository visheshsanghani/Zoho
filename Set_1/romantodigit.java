package Set_1;

import java.util.Scanner;

public class romantodigit {
	public static int roman(char c){
		int value=0;
		switch(c){
		case 'I':
			value=1;
			break;
		case 'V':
			value=5;
			break;
		case 'X' :
			value=10;
			break;
		case 'L' :
			value=50;
			break;
		case 'C' :
			value=100;
			break;
		case 'M' :
			value=500;
			break;	
		default:
			value=-1;
		}
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] romannum=new char[10];
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		romannum=s.toCharArray();
		//for(int i=0;i<s.length();i++){
		int i=0;
		int ans=0;
		while(i<s.length()){
		int s1=roman(romannum[i]);
		if(i+1<s.length()){
			if(roman(romannum[i])>romannum[i+1]){
			ans=ans+roman(romannum[i]);
		}else{
			ans=ans+roman(romannum[i])-roman(romannum[i+1]);
			i++;
		}}
		else{
			ans+=s1;
		}
		//System.out.println(i);
		i++;
		}
//		if(i==roman(romannum[s.length()-1])){
//			//System.out.println("True");
//			ans+=roman(romannum[s.length()-1]);
//		}
		System.out.println(ans);
			scanner.close();
		}
		
	}
