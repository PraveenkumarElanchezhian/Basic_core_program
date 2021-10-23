package Basiccore;

import java.util.Scanner;

public class Basiccoreprograms {
	public static void main(String[] args) {
		Basiccoreprograms rv1 = new Basiccoreprograms();
	    rv1.flipcoin();
	}

	void flipcoin() {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Enter the number of times to flip a coin");
		int total_length = user_input.nextInt();
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
}
