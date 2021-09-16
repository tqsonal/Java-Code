package com.tqpp.basic;
import java.util.Scanner;
public class Check_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int no = sc.nextInt();
int c=0;

//if(no>9 &&no<=99){
//System.out.println("the no is two digit");
//}
//else{
//	System.out.println("the no is wrong");
//}



while(no!=0){
	no=no/10;
	c++;
	
}
System.out.println(c);
	}

}
