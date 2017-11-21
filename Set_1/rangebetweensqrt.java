package Set_1;

import java.util.Scanner;

public class rangebetweensqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,result=0;
		int end;
		Scanner scanner=new Scanner(System.in);
		start=scanner.nextInt();
		end=scanner.nextInt();
		if(start<200&&end<200){
//			System.out.println("here");
			for(int i=1;i<=end;i++){
				result=i*i;
				if(result>start&&result<=end){
					System.out.println(result);
				}
			}
			
		}
		
		scanner.close();
		}

}
