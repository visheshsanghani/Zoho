package Set_1;
//You’re given a string as an input. You have to reverse the string by keeping the punctuation and spaces. You have to modify the source string itself with creating an another string.
//Input :A man, in the boat says : I see 1-2-3 in the sky
//Output :
//
//y kse, ht ni3 21ee slsy : a sta o-b-e ht nin amA
public class keepingpunc {
public static void main(String[] args) {
	String name="A man, in the boat says : I see 1-2-3 in the sky";
	char one[]=name.toCharArray();
//	System.out.println(one.length);
	int j=one.length-1,i=0;
	while(i<j){
		while(!(Character.isAlphabetic(one[i])||Character.isDigit(one[i]))){
			i++;
		}
		while(!(Character.isAlphabetic(one[j])||Character.isDigit(one[j]))){
			j--;
		}
		char temp=one[i];
		one[i]=one[j];
		one[j]=temp;
		i++;
		j--;
	}
	for(char c:one){
		System.out.print(c);
	}
//	for(int i=0;i<one.length;i++){
////		System.out.println(one[i]);
//		if(one[i]>64&&one[i]<91||one[i]>96&&one[i]<123||one[i]>47&&one[i]<58){
//			System.out.print(one[j]);
//			j--;
//			while(!(one[j]>64&&one[j]<91||one[j]>96&&one[j]<123||one[j]>47&&one[j]<58)){
//				j--;
//			}
//		
//		}
//	else{
//		System.out.print(one[i]);
//	}
//		
	
	}
}
