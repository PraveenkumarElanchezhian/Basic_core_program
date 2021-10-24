package arrayprogram;
import java.util.Scanner;
public class Array {
public static void main(String[] args)
  {
	 Array rv1 = new Array();
    rv1.twoD_array();
   }  
  
  void twoD_array() {
	  int x_length,y_length;
	  Scanner rv = new Scanner(System.in);
	  System.out.println("Enter the value of x_lengt and y_lengt");
	  x_length = rv.nextInt();
	  y_length = rv.nextInt();
	  int[][] array = new int [x_length][y_length];
	  
	  for (int i=0;i<x_length;i++) {
		  for (int j=0;j<y_length;j++) {
			  array[i][j]= i+j;
			  System.out.println("array["+i+"]["+j+"]"+" = "+array[i][j]);
		  }
	  }
	  
  }
}