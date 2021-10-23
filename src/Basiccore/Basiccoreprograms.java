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
	    Basiccoreprograms rv4 = new Basiccoreprograms();
	    rv4.harmonic(5); 
	    Basiccoreprograms rv5 = new Basiccoreprograms();
	    rv5.factor(); 
	    Basiccoreprograms rv6 = new Basiccoreprograms();
	    rv6.Quotient_Remainder();
	    Basiccoreprograms rv7 = new Basiccoreprograms();
	    rv7.swap(3,5);
	    Basiccoreprograms rv8 = new Basiccoreprograms();
	    rv8.even_odd();
	    Basiccoreprograms rv9 = new Basiccoreprograms();
	    rv9.Vowel_Consonant('a');
	    Basiccoreprograms rv10 = new Basiccoreprograms();
	    rv10.largest_number();
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
	
	 void harmonic(int n) {
		double value,a=0;
		Scanner user_input_fourth = new Scanner(System.in);
		System.out.println("Enter the harmonic value");
		value = user_input_fourth.nextDouble();
		for (double i=1; i<=value;i++) {
		a = a + 1/i;
		}
		System.out.println(a);
	}
	 
	 void factor() {
		 int number;
	      Scanner user_input_fifth = new Scanner(System.in);
	      System.out.println("Enter a number");
	      number = user_input_fifth.nextInt();
	   for(int i = 2; i< number; i++) {
              while(number%i == 0) {
	            System.out.println(i);
	            number = number/i;
	        }
	      }
	      if(number >2) {
	         System.out.println(number);
	      }
	 }
	 
	 void Quotient_Remainder() {
		 int dividend;
		 int divisor;
		 Scanner user_input_Sixth_one = new Scanner(System.in);
	      System.out.println("Enter a dividend number");
	      dividend = user_input_Sixth_one.nextInt();
	      Scanner user_input_Sixth_two = new Scanner(System.in);
	      System.out.println("Enter a divisor number");
	      divisor = user_input_Sixth_two.nextInt();
	      int quotient = dividend / divisor;
	      int remainder = dividend % divisor;
	      
	      System.out.println("Quotient value is "+quotient);
	      System.out.println("Remainder value is "+remainder);
	 }
	 void swap(int a,int b) {
		 int c;
		System.out.println("Before swapping value of a = "+a+"and b = "+b);
		 c=a;a=b;b=c;
		System.out.println("After swapping value of a = "+a+"and b = "+b);
	 }
    void even_odd() {
         int number;
   		 Scanner user_input_Eight = new Scanner(System.in);
   	      System.out.println("Enter a number");
   	      number = user_input_Eight.nextInt();
    		if (number%2 == 0) {
    			System.out.println("Even number");
    		}
    		if (number%2 != 0) {
    				System.out.println("Odd number");
    		}
    	
    }
    void Vowel_Consonant(char ch) {
    	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
    		System.out.println(ch+" is a Vowel");
    	}
    		else {
    			System.out.println(ch+" is a Consonant");
    		}
   }
    void largest_number() {
    	int a,b,c;
    	Scanner user_input_Tenth_one = new Scanner(System.in);
 	      System.out.println("Enter a number A");
 	      a = user_input_Tenth_one.nextInt();
 	      Scanner user_input_Tenth_two = new Scanner(System.in);
   	      System.out.println("Enter a number B");
   	      b = user_input_Tenth_one.nextInt();
   	      Scanner user_input_Tenth_three = new Scanner(System.in);
   	      System.out.println("Enter a number C");
   	      c = user_input_Tenth_one.nextInt();
   	       
   	      if (a>b && a>c) {
   	    	  System.out.println("The largest number is "+a);
   	      }
   	      else if (b>a && b>c) {
	    	  System.out.println("The largest number is "+b);
	      }
   	      if (c>a && c>b) {
	    	  System.out.println("The largest number is "+c);
	      }
   	      else {
   	    	System.out.println("The numbers are same");
   	      }
    }

}