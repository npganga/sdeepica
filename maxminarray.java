package codekata;
import java.util.Scanner;
public class maxminarray {
	public static void main(String[] args){
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		int min=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("The largest element is "+max);
		System.out.println("The smallest element is "+min);
	s.close();
			
		}
	}


