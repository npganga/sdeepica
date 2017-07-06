package programssss;
import java.util.Scanner;
public class countline {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Line : ");
		String str=s.nextLine();
		String[] str1=str.split(" ");
		System.out.println("The number of words in the given Line : "+str1.length);
		s.close();
}
}