package programssss;
import java.util.Scanner;
public class umnumber {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n;
		int sum=0;
		System.out.println("Enter the number");
		n=s.nextInt();
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(sum);
		s.close();
	}
}
