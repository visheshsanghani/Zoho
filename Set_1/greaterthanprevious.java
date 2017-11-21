package Set_1;

public class greaterthanprevious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]={ 2, -3, -4, 5, 9, 7, 8};
		for(int i=1;i<number.length;i++){
			if(number[i]>number[i-1]){
				System.out.println(number[i]);
			}
		}

	}

}
