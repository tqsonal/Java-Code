package com.tqpp.basic;

import java.util.Scanner;

public class Switch_display_dayname_depending_on_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the no between 1-7");
int day=sc.nextInt();

//switch(day){
//case 1: System.out.println("monday");
//         break;
//case 2: System.out.println("tuesday");
//          break;
//case 3: System.out.println("wednesday");
//         break;
//case 4: System.out.println("thursday");
//           break;
//case 5: System.out.println("friday");
//         break;
//case 6: System.out.println("saturday");
//         break;
//case 7: System.out.println("sunday");
//          break;
//default: System.out.println("wrong choice");
//}


switch(day){
case 1: case 7: System.out.println("enjoy your weekend");
break;
case 2:case 3: case 4: case 5: case 6: System.out.println("working days");
break;
default:System.out.println("invalid choice");
}

	}

}
