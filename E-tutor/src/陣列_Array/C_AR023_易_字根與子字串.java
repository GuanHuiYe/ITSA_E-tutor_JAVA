package �}�C_Array;
import java.util.*;
public class C_AR023_��_�r�ڻP�l�r�� {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String target=sc.nextLine();
		Boolean test=false;
		for(int n=0;n<=input.length()-input.length();n++) {
			if(input.equals(target.substring(n,n+input.length()))) {
				test=true;
				break;
			}
		}
		System.out.println(test?"YES":"NO");
	}

}
