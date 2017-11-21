package Set_1;

public class flow_of_numbers {
public static void main(String[] args) {
	int number=1;
	for(int i=0;i<6;i++){
		System.out.println(number);
		number=calculatethenext(number);
	}
}
public static int calculatethenext(int number){
		int digit=0;
		int newnumber=0;
		int count=0;
		int multi=1;
		while(number>0){
		count=0;
			do{
			digit=number%10;
			number=number/10;
			count++;
		}while(digit==number%10);
			newnumber=newnumber+(count*10+digit)*multi;
			multi*=100;
		}
	return newnumber;
}
}
