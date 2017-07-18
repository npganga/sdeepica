package codekata;
import java.util.Scanner;
public class multitable {
	public static void main(String[] args){
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		number=s.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(number+"*"+i+"="+number*i);
		}
		s.close();
	}

}
