package com.tqpp.basic;

import java.util.Scanner;

public class Convert_INR_to_doller_euro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the amount");
int amount=sc.nextInt();
System.out.println("enter p-pound , d-dollar,e-euro");
char cur=sc.next().charAt(0);
switch(cur){
case 'd':case 'D':System.out.println("no of dollars = " + amount/71 );
break;
case 'p':case 'P':System.out.println("no of dollars = " + amount/70 );
break;
case 'e':case 'E':System.out.println("no of dollars = " + amount/90 );
break;
default: System.out.println("invalid choice");
}
	}

}
