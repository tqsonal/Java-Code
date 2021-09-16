package com.tqpp.basic;

public class Currency_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rs=8976;

int n2000= rs/2000;
rs=rs%2000;

int n500=rs/500;
rs=rs%500;

int n200=rs/200;
rs=rs%200;

int n100=rs/100;
rs=rs%100;

int n50=rs/50;
rs=rs%50;

int n20=rs/20;
rs=rs%20;

//System.out.println("2000 rs "+n2000);
System.out.println("2000 ="+n2000+"  500 ="+n500+"  200 ="+n200+"  100 ="+n100+"  50 ="+n50+"  20 ="+n20);
	}

}
