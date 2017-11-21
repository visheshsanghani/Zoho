package Set_1;

public class equation_solve {
//	(Z/(X!+Z))
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=2,Y=3,Z=4;
		int ans=(int) Math.pow(X,(Y/equation_solve.fact(Z)));
		ans+=(Z/(equation_solve.fact(X))+Z);
		System.out.println(ans);

	}
	public static int fact(int n){
		int ans=1;
		for(;n!=0;n--){
			ans*=n;
		}
		System.out.println(ans);
		return ans;
	}

}
