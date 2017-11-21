//Given an array of numbers and a window of size k. Print the maximum of numbers inside the window for each step as the window moves from the beginning of the array.
//
//  INPUT  :
//  
//  Enter the array size  :  8
//  Enter the elements  :  1,3,5,2,1,8,6,9
//  Enter the window size  :  3
//
//  OUTPUT  :
//
//  5 5 5 8 8 9
package Set_1;

public class sliding_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number={1,3,5,2,1,8,6,9};
		int window=3;
		int i=0,j=0,count=0,highest=0;
		while(i!=number.length-2){
			j=i;
			count=0;
			highest=0;
			while(count<window){
				if(highest<number[j]){
					highest=number[j];
				}
				j++;
				count++;
			}
			System.out.println(highest);
			i++;
			
		}
		
	}

}	
