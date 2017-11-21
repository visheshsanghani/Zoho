package Set_1;

public class Rotate_by_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int mat[][] =
	        {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12},
	            {13, 14, 15, 16}
	        };
		rotateby90(mat,n);
		displaymatrix(mat, n);
	}
	public static void displaymatrix(int mat[][],int n){
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(mat[i][j]);
				System.out.print("\t");
			}
		System.out.println();	
		}
	}
	public static void rotateby90(int mat[][],int n){
		for(int i=0;i<n/2;i++){
			for(int j=i;j<n-i-1;j++){
				int temp=mat[i][j];
				mat[i][j]=mat[j][n-1-i];
				mat[j][n-1-i]=mat[n-1-i][n-1-j];
				mat[n-1-i][n-1-j]=mat[n-1-j][i];
				mat[n-1-j][i]=temp;
				
			}
		}
	}
}
