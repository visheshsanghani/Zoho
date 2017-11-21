//Given an array, find the minimum of all the greater numbers for each element in the
//array.
//
//   
//Sample: 
//Array : {2, 3, 7, ­1, 8, 5, 11} 
//   
//Output: 
//{2­>3, 3­>5, 7­>8, ­1­>2, 8­>11, 5­>7, 11­>} 

package Set_1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class smallgreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of values , it has to enter");
		int n=scanner.nextInt();
		int[] num=new int[n];
		List<String> ans=new LinkedList<String>();
		int i=0;
		while(i<n){
			num[i]=scanner.nextInt();
			i++;
		}
		for(i=0;i<n;i++){
			int st=num[i];
			for(int j=0;j<n;j++){
				if(num[i]<num[j]&&st>num[j]){
					st=num[j];
				}
			}
			String ip=String.valueOf(num[i]);
			if(st==num[i]){
				ip=ip.concat(">"+"");	
			}
			else{
			ip=ip.concat(">"+st);
			}
			ans.add(ip);	
		}
		System.out.println(ans);
		
		scanner.close();
	}

}
