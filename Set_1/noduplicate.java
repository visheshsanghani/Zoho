package Set_1;

import java.util.Arrays;

public class noduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,1,2,4};
		int size=array.length;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(array[i]==array[j]){
					int k=j;
					while(k<size-1){
						array[k]=array[k+1];
						k++;
					}
					size--;
				}
			}
		}
		int[] ans=new int[size];
		for(int i=0;i<size;i++){
			ans[i]=array[i];
		}
	System.out.println(Arrays.toString(ans));
	}

}
