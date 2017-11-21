package Set_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class get_grandchildren {
	static HashMap map=new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner scanner=new Scanner(System.in);
		int j,i=scanner.nextInt();
		for(j=0;j<i;j++){
			System.out.println("Enter the name of father");
			String father=scanner.next();
			System.out.println("Enter the name of child");
			String child=scanner.next();
			
			map.put(child , father);
		}
		//System.out.println(map);
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
//			System.out.println("Here1");
		Map.Entry me=(Map.Entry)iterator.next();
		if(me.getValue().equals("1")){
			
//			System.out.println("Here");
			n=getgrand(me.getKey());
		}
		}
		System.out.println(n);
	}
	public static int getgrand(Object father){
		int count=0;
		Set set=map.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext()){
			Map.Entry me=(Map.Entry)iterator.next();
			if(me.getValue().equals((String)father)){
				count++;
//				System.out.println(count);
		}
		}
		return count;
	}
	
	
	
}
