package programssss;

import java.util.Scanner;
public class charlin {
	public static void main(String[] args){
		String str;
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		System.out.println("Number Of Characters in a given line "+str.length());
		s.close();
	}

}
