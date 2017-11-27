package Set_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JanaGana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map ind=new HashMap<String,String>();
		Map count=new HashMap<String,Integer>();
		String input1;
		int currentindex=0;
		Scanner scanner=new Scanner(System.in);
		input1=scanner.nextLine();
		//System.out.println(input1);
		String[] input=input1.split(" ");
//		System.out.println(input);
//		for (String string : input) {
//			System.out.println(string);
//		}
		for(String s:input){
			//if(ind.containsKey(input[i])){
				//System.out.println(s);
				Integer n=(Integer)count.get(s);
				System.out.println("n"+n);
				int len=s.length();
				if(n==null){
					n=1;
					count.put(s, n);
					ind.put(s,currentindex);
					currentindex+=len+1;
				}
				else{
					n++;
					count.put(s,n);
					String ip=String.valueOf(ind.get(s)).concat(",").concat(Integer.toString(currentindex));
//					ip=ip.concat(",").concat(Integer.toString(currentindex));
					currentindex+=len+1;
					ind.put(s, ip);
					
				}
				
				
				//String value=ind.get(input[i]).toString();
//				String inde=(String)currentindex;
//				value=value.concat(inde);
//				ind.put(input[i], ind.get(input[i]).concat(value));
					
		}
		count.keySet().stream().forEach(System.out::println);	
		count.values().stream().forEach(System.out::println);
		ind.keySet().stream().forEach(System.out::println);	
		ind.values().stream().forEach(System.out::println);
		//Random-text here
	}

}