package programs;
import java.util.Scanner;
public class swap {
	public static void main(String[] args){
		int a;
		int b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a=s.nextInt();
		b=s.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("The value of a after swapping: "+a);
		System.out.println("The value of b after swapping: "+b);
s.close();
}

}
