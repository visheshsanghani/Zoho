package Set_1;

import java.util.LinkedList;
import java.util.List;

public class consecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] cons={1, 0, 1, 1, 0, 1,1, 0, 1, 1, 1, 1};
		List<Integer> list = new LinkedList<Integer>();
		int k=2;
		int count=0;
		for(int i=0;i<cons.length;i++){
			if(cons[i]==1){
				list.add(1);
				count++;
			if(count==k){
				list.add(0);
				count=0;
			}
			}
			else{
				count=0;
				list.add(cons[i]);
			}
			
		}
		System.out.println(list.toString());
	}

}
