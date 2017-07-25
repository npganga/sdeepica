package codekata;
import java.util.Scanner;
public class StringNumeric {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		s.close();
		  try  
		  {  
		    double n = Double.parseDouble(str);  
		    System.out.println("True");
		  }  
		  catch(NumberFormatException n)  
		  {  
		    System.out.println("False");  
		  }  

		}
	}


