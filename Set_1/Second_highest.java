package Set_1;
//import java.util.Arrays;

//import java.util.Collections;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;

public class Second_highest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1};
		if(array.length==1){
			System.out.println("NO Second largest");
		}
		else{
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]<array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println(array[array.length-2]);
		}
//		System.out.println(Arrays.toString(array));
//		if(array[array.length-2]==null){
//			
//		}
		
//		int se
//		c_high=0;
//		List number=new LinkedList<Integer>();
//		number.add(3);
//		number.add(2);
//		number.add(5);
//		number.add(6);
//		Collections.sort(number);
//		try{
//		System.out.println(number.get(number.size()-2));
//		}
//		catch(Exception e)
//		{
//			System.out.println("Not avialable");
//		}
//		Collections.sort(number,Collections.reverseOrder());
//		System.out.println(number.toString());
//		
//		int high=0;
//		Iterator it=number.iterator();
//		while(it.hasNext()){
//			int n=(int)it.next();
//			if(n>high){
//				high=n;
//			}
		}
		
		

	}

