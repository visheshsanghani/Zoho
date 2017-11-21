package Set_1;

public class numbertochar {

	public static void getvalue(int n){
		char []num=new char[10];
		int i=0;
		int rem=n%26;
		if(rem==0){
			num[i++]='Z';
			n=n/26;
		}
		else{
			num[i++]=(char)((rem-1)+'A');
			n=n/26;
		}
		num[i]='\0';
		int len=i;
//		for(int j=0;j<i;j++){
//			char temp=num[j];
//			num[j]=num[i];
//			num[i]=temp;
//		}
		for(i=0;i<len;i++)
		System.out.println(num[i]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getvalue(26);
		getvalue(1000);

	}

}
