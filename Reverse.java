package programssss;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args){
		int n;
		int reverse=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		n=s.nextInt();
		while(n!=0){
			reverse=reverse*10;
			reverse=reverse+n%10;
			n=n/10;
		}
		System.out.println(reverse);
		s.close();
	}

}
