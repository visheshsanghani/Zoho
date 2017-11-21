package Set_1;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Merge_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new TreeSet<Integer>();
		Set<Integer>set2=new TreeSet<Integer>();
		Scanner scanner=new Scanner(System.in);
		int array1[]={45,43,23,11};
		int array2[]={11,2,3,5};
//		set1.addAll(array1);
		System.out.println("Number of elements to enter : ");
		
		for(int i=0;i<scanner.nextInt();i++){
			set1.add(scanner.nextInt());
		}
		set1.add(34);
		set1.add(23);
		set2.add(11);
		set2.add(34);
		set1.addAll(set2);
		System.out.println(set1);
		
		

	}

}
