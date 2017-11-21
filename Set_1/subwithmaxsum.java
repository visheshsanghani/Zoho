package Set_1;

public class subwithmaxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num={-2, -3, 4, -1, -2, 1, 5, -3};
		int len=num.length;
		int max_num=Integer.MIN_VALUE,max_till_now=0;
		int start=0,end=0,s=0;
		for(int i=0;i<len;i++){
			max_till_now+=num[i];
			if(max_num<max_till_now){
				max_num=max_till_now;
				start=s;
				end=i;
			}
			if(max_till_now<0){
				max_till_now=0;
				s=i+1;
			}
		}
		System.out.println(max_num);
		System.out.println(start);
		System.out.println(end);
		
		
	}
	

}
