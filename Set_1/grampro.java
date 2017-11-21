package Set_1;

public class grampro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="program";
		char[] full=name.toCharArray();
		int n=full.length;
		int spaces=n;
		if(n%2!=0){
			for(int i=0;i<n;i++){
			for(int j=0;j<spaces;j++){
				System.out.print(" ");
			}
		for(int j=n/2;j<=n/2+i;j++){
			if(j<n)
			System.out.print(full[j]);
		}
		if(i>n/2){
		for(int j=0;j<i-n/2;j++){
			System.out.print(full[j]);
		}
		
		}
		System.out.println();
		spaces--;
		}
		}
		//added new text here

	}

}
