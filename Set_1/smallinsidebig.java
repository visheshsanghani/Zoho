//Given bigger NxN matrix and a smaller MxM matrix print TRUE if the 
//smaller matrix can be found in the bigger matrix else print FALSE

package Set_1;
import java.util.Scanner;
public class smallinsidebig {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] small = new int[2][2];
		int[][] large=new int[3][3];
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				small[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Insert second matrix elements");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				large[i][j]=scanner.nextInt();
			}
		}
		boolean ans=(fun(small,large));
		if(ans){
			System.out.println("Its does contain");
		}
		else{
			System.out.println("Sorry , it doesn't");
		}
		scanner.close();
	}
public static boolean fun(int[][] small,int[][] large){
	int count =0;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			count=0;
	if(large[i][j]==small[0][0]&&i!=2&&j!=2){
		int st=i;
		for(int k=0;k<2;k++){
			for(int l=0;l<2;l++){
				if(large[st+k][j+l]==small[k][l]){
					count++;
				}
			}
//			st++;
			}
		if(count==4){
			return true;
		}
		}
		}
}
	return false;
}
}
