package Set_1;

public class getnumber_calculate_next_number {
public static void main(String[] args) {
	int number=1;
	for(int i=0;i<7;i++){
		System.out.println(number);
		number=getit(number);
	}
}
public static int getit(int number){
	int digit=0;
	int count=0;
	int newnum=0;
	int mul=1;
	while(number>0){
		count=0;
		do{
		digit=number%10;
		number/=10;
		count++;
	}while(digit==number%10);
	newnum=newnum+(count*10+digit)*mul;
	mul*=100;
	}
	return newnum;
}
}
