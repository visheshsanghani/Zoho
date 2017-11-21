package Set_1;

public class preceded_by_$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="$Hello$World$ $a";
		int count=0;
		char[] input=name.toCharArray();
		for(int i=0;i<name.length();i++){
			if(input[i]=='$'){
				if(i+1<input.length&&input[i+1]!=' '){
					count++;
				}
			}
			else{
				count++;
			}
		}
		System.out.println(count);
	}

}
