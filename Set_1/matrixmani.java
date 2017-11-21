package Set_1;

public class matrixmani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=4;
		for(int i = 0; i < 2 * N - 1; i++) {
			//7
			for(int j = 0; j < 2 * N - 1; j++) {
				//7
				System.out.print(1+Math.max(Math.abs(N-i-1), Math.abs(N-j-1)) );
			}
			System.out.println();
		}
	}

}
