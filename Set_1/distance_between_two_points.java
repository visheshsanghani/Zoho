package Set_1;

public class distance_between_two_points {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=2,x2=4,y1=4,y2=10;
		int X=x2-x1;
		X*=X;
		int Y=y2-y1;
		Y*=Y;
		int ans= (int) Math.round(Math.sqrt((X+Y)));
		System.out.println(ans);
	}

}
