package codekata;
import java.util.Scanner;
public class firstrepeated {
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("array size");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			}
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					System.out.println("first repeated element in the array "+a[i]);
					break;
				}
			}
			break;
		}
s.close();
}
}