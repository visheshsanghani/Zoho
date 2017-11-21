package Set_1;

public class multilpy_without_symbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mul(4));
	}
	public static int mul(int n){
		int res=3;
		if(n==0){
			return n;
		}
		res+=mul(n-1);
		return res;
		
	}

}
