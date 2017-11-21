// Arrange the numbers in descending order depending on the no. of factors available for each number.
//I/P: {6,8,9}
//O/P: {8,6,9} or {6,8,9}
//Reason: factors of 8 (1,2,4,8), factors of 6 (1,2,3,6), factors of 9 (1,3,9).
package Set_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class highest_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		int[] factors=new int[10];
		int[] change=new int[10];
		int i,count=0,j=0,k=0,temp=0;
		Scanner scanner=new Scanner(System.in);
		list.add(scanner.nextInt());
		list.add(scanner.nextInt());
		list.add(scanner.nextInt());
		System.out.println(list);
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
			count=0;
			int number=(int)iterator.next();
			change[k]=number;
			k++;
			for(i=1;i<number;i++){
				if(number%i==0){
					count++;
				}
			}
				factors[j]=count;
		}
		for(i=0;i<k;i++){
			for(j=i+1;j<k;j++){
				if(factors[i]<=factors[j]){
					temp=factors[i];
					factors[i]=factors[j];
					factors[j]=temp;
					
					//for main list
					temp=change[i];
					change[i]=change[j];
					change[j]=temp;
				}
			}
		}
		for(i=0;i<k+1;i++){
			System.out.println("Factors :");
			System.out.println(factors[i]);
			System.out.println(change[i]);
		}
	}
	
}
