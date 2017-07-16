package codekata;
import java.util.Scanner;
public class repeatedelements {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}

		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && (i!=j)){
					System.out.println("repeated number is "+a[i]);
				}
			}
		}
		s.close();
	}

}
