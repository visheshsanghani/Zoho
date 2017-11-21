package Set_1;

import java.util.ArrayList;

public class present_in_fibonacci {
public static void main(String[] args) {
	int[] com={2, 10, 4, 8};
	int n1=0,n2=1,n3=0;
	ArrayList<Integer> list=new ArrayList<>();
	list.add(n1);
	list.add(n2);
	for(int i=2;i<5;i++){
		n3=n1+n2;
		list.add(n3);
		n1=n2;
		n2=n3;
	};
//	System.out.println(list);
	for(int i=0;i<com.length;i++){
		if(list.contains(com[i])){
			System.out.println(com[i]);
		}
	}

}
}
