package programs;
import java.util.Scanner;
public class greatest3 {
	public static void main(String[] args){
		int a;
		int b;
		int c;
		Scanner s=new Scanner(System.in);
		System.out.print("a :");
		a=s.nextInt();
		System.out.print("b :");
		b=s.nextInt();
		System.out.print("c :");
		c=s.nextInt();
		if(a>b&&a>c){
			System.out.println("a is the greatest number");
		}
		else if(b>c&&b>a){
			System.out.println(" b is the greatest number");
		}
		else if(c>a&&c>b){
			System.out.println(" c is the greatest number");
		}
		s.close();
	}

}
