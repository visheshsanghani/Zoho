package Set_1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class numberofoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List number=new List();
		List number=new LinkedList<>();
		number.add(4);
		number.add(3);
		number.add(4);
		number.add(4);
		number.add(3);
		number.add(4);
		Collections.sort(number);
		System.out.println(number);
		int total=0;
		for(int i=0;i<number.size();i++){
		int c=(int)number.get(i);
		while(c==(int)number.get(i)){
			
			total++;
			i++;
			if(i>=number.size()){
				break;}
			
		}
		System.out.println(c+" "+total);
	}
	
	}
}
