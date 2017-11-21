package Set_1;

import java.util.Arrays;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;

public class longest_continous_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,4};	
//		ArrayList<Integer> list=new ArrayList<>();
//		for(int i=0;i<arr.length;i++){
//			list.add(arr[i]);
//		}
//		Collections.sort(list);
		Arrays.sort(arr);
		int count=0,highest=0;
		int start=0;
//		int end=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]+1==arr[i+1]){
				count++;
//				System.out.println(arr[i]);
//				System.out.println(count);
				if(highest<count){
//					end=i+1;
//					System.out.println(count);
					highest=count;
					start=i-count+1;
				}
				}
			else{
				count=0;
			}	
		}
		System.out.println(highest+1);
//		System.out.println(end+" " +start);
//		System.out.println(start);
//		System.out.println(end);
	for(int i =start;i<=start+highest;i++){
		System.out.println(arr[i]);
	}
	}

}
