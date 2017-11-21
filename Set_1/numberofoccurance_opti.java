package Set_1;

import java.util.HashMap;
import java.util.Iterator;

public class numberofoccurance_opti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,2,3,1,2};
		HashMap insert=new HashMap<Integer,Integer>();
		for(int i=0;i<input.length;i++){
		Integer n=(Integer)insert.get(input[i]);
		if(n==null){
			n=1;
			insert.put(input[i], n);
//			System.out.println("Here:!");
		}
		else{
			n++;
			insert.put(input[i], n);
		}
		}
		Iterator<Integer> itr=insert.keySet().iterator();
		Iterator<Integer> value=insert.values().iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"-");
			System.out.print(value.next());
			System.out.println();
		}
	

}}
