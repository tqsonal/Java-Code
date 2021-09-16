package com.tqpp.basic;

import java.util.Scanner;

public class Upper_to_lower_lower_to_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the character");
char ch=sc.next().charAt(0);
//if(ch>='A'&&ch<='Z'){
//	System.out.println((char)(ch+32));
//}
//else
//	System.out.println((char)(ch-32));



System.out.println((ch>='A'&&ch<='Z')?(char)(ch+32):(char)(ch-32));
// check whether the no is positive negative or zero
int no=0;
System.out.println(no>0?"+ve":no<0?"-ve":"zero");

// check which no is greater 
int a=125;
int b=18;
int c=220;
System.out.println((a>b)?(a>c)?a:(b>c)?b:c:b);

	}

}
