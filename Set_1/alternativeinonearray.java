package Set_1;

public class alternativeinonearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={100 ,1 ,11 ,21 ,2 ,3};
		int len=num.length;
		int i=0;
		while(i<len){
			int j=i+1;
			while(j<len){
				if(num[i]>num[j]){
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				j++;
			}
			i++;
			j=i+1;
			while(j<len){
				if(num[i]<num[j]){
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				j++;
			
		}
		i++;	
		}
		for(i=0;i<len;i++)
		System.out.println(num[i]);
	}

}
