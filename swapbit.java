package programs;
import java.util.Scanner;
public class swapbit {
	public static void main(String[] args){
	int a;
	int b;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value of a and b");
	a=s.nextInt();
	b=s.nextInt();
	a=a^b;
	b=a^b;
	a=a^b;
	System.out.println("The value of a after swapping "+a);
	System.out.println("The value of b after Swapping "+b);
	s.close();
	}
	

}
