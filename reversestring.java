package codekata;

import java.util.Scanner;
public class reversestring {
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=s.nextLine();
	String strNew;
	String reverse=new StringBuffer(str).reverse().toString();
	strNew=reverse.replaceAll("[aeiouAEIOU]","");
	System.out.println(strNew);
	s.close();
	}
	}
