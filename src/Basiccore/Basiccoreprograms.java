package Basiccore;

import java.util.Scanner;

public class Basiccoreprograms {
	public static void main(String[] args) {
	   Basiccoreprograms rv1 = new Basiccoreprograms();
	    rv1.flipcoin();
	   Basiccoreprograms rv2 = new Basiccoreprograms();
	    rv2.leapyear();
	    Basiccoreprograms rv3 = new Basiccoreprograms();
	    rv3.power_of_2();
	}

	void flipcoin() {
		Scanner user_input_first = new Scanner(System.in);
		System.out.println("Enter the number of times to flip a coin");
		int total_length = user_input_first.nextInt();
		int headcount = 0;
		int tailcount = 0;
		for(int i=0;i<total_length;i++) {
			int flipcoin = (int) Math.floor(Math.random()*10)%2;
			if (flipcoin == 1) {
				System.out.println("Head");
				headcount++;
			}
			else {
				System.out.println("Tail");
				tailcount++;
		}
	  }
	
		int head_percentage = (headcount*100)/100;
		int tail_percentage = (tailcount*100)/100;;
		System.out.println("No.of times to Flip coin is "+total_length+" "+"times");
		System.out.println("head_percentage "+head_percentage+"%");
		System.out.println("tail_percentage "+tail_percentage+"%");
	}
	
	void leapyear() {
		int year;
		Scanner user_input_second = new Scanner(System.in);
		System.out.println("Enter the year");
		 year = user_input_second.nextInt();
		
		  if ((year%4 == 0 && year%100 != 0) || (year%400 == 0 )) {
		     System.out.println("Specified year is a leap year");
		  }
	      else
	      {
	         System.out.println("Specified year is not a leap year");
	      }
	}
	
	void power_of_2() {
		int power;
		int value = 1;
		Scanner user_input_third = new Scanner(System.in);
		System.out.println("Enter the power value");
		power = user_input_third.nextInt();
		
		System.out.println("2^"+0+" = "+1);
		
		for (int i=1; i<=power;i++) {
			 value = (2*value);
			 System.out.println("2^"+i+" = "+value);
		}
		
	}
		
}
