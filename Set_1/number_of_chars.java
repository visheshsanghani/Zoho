package Set_1;

public class number_of_chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=101,temp=0,count=0;
		while(n!=0){
			if(n>9){
				temp=n;
			while(temp!=0){
				temp=temp/10;
				count+=1;
			}
			}
			else{
				count+=1;
			}
			n-=1;
		}
		System.out.println(count);

	}

}
