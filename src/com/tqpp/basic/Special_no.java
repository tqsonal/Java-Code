package com.tqpp.basic;

import java.util.Scanner;

// Write a program to check whether the entered number is special or not 
//eg    49
//4*9=36
//4+9=13
//36+13=49

public class Special_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the no");
int no=sc.nextInt();
int no_copy=no;
if(no>9&&no<100){
int last=no%10;
no=no/10;
int add_result=last+no;
int mul_result=last*no;
int f_result=add_result+mul_result;
if(f_result==no_copy){
	System.out.println("special no = "+no_copy);
}
else{
	System.out.println("not special no");
}
}

	}

}
