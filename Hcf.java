package codekata;
import java.util.Scanner;
public class Hcf {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n1;
		int n2;
		int hcf;
		int a;
		int b;
		int temp;
		System.out.println("Enter the two values");
		n1=s.nextInt();
		n2=s.nextInt();
		a=n1;
		b=n2;
		while(b!=0){
			temp=b;
			b=a%b;
			a=temp;
		}
		hcf=a;
		System.out.println("The HCF of the two numbers is "+hcf);
		s.close();
	}
}
