package codekata;
import java.util.Scanner;
public class Strcmpwitotcmp {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string 1");
		String str=s.nextLine();
		System.out.println("Enter the string 2");
		String str1=s.nextLine();
		if( str.equalsIgnoreCase( str1 ) ) {
			System.out.println("The string are equal");
		}
		else
			System.out.println("The strings are not equal");
		s.close();
	}

}
