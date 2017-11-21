package Set_1;

public class CheckConstrain {
	public static void main(String[] args) {
		int[] numbers={10,45,47,4};
		int len=numbers.length;
		int i,points;
		for(i=0;i<len;i++){
			points=0;
			int a=(int)Math.sqrt(numbers[i]);
			if(a*a==numbers[i]){
				points+=5;
			}
			if((numbers[i]%4==0)&&(numbers[i]%6==0)){
				points+=4;
			}
			if(numbers[i]%2==0){
				points+=3;
			}
			System.out.println("< " + numbers[i] + " " + points + " >");
		}
		
	}

}
