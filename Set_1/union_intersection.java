//Find the union intersection of two list and also find except (remove even elements from list1 and odd elements from list2)
//Input
//
//List 1: 1,3,4,5,6,8,9
//List 2: 1, 5,8,9,2
//
//Union: 1, 3,4,5,6,8,9,2
//Intersection: 1,5,8,9
//Except: 1, 3, 5,9,8,2


package Set_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class union_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set1=new TreeSet();
		Set set2 = new TreeSet();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Values in the first set");
		int n1=scanner.nextInt();
		for(int i=0;i<n1;i++){
			set1.add(scanner.nextInt());
		}
		System.out.println("Values in the Second set");
		int n2=scanner.nextInt();
		for(int i=0;i<n2;i++){
			set2.add(scanner.nextInt());
		}
		//Union
		Set union=new TreeSet(set1);
		union.addAll(set2);
		System.out.println(union);
		//Intersection
		ArrayList intersection = new ArrayList<>();
		Iterator iterator1=set1.iterator();
		Iterator iterator2=set2.iterator();
		while(iterator1.hasNext()){
			while(iterator2.hasNext()){
				if(iterator1==iterator2.next()){
					intersection.add(iterator1.toString());
				}
				iterator2=set2.iterator();
			}
		}
		System.out.println(intersection);
		
		
	}

}
