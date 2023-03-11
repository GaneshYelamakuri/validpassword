package com.jsp.Stringpack;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPassword {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Password:");
		String pwd=scn.next();
		
		String reg="(?=.*[!@#$%^&])(?=.*[0-9])(?=.*[A-Z]).{5,10}";
		
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(pwd);
		
	  System.out.println(m.matches());
	}

}
