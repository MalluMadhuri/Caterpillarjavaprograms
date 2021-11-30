package caterpillarjavaquestions.java;
import java.io.*;
import java.lang.*;
import java.util.*;
public class binarytodecimal {
 public static int convertBinaryToDecimal(long num) {
   int answer = 0;
   int count = 0;
   long remainder;
   while (num != 0) {
   remainder = num % 10;
   num =num/ 10;
   answer += remainder*Math.pow(2,count);
   ++count;
   }	    
  return answer;
	}
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number you want");
	int number=sc.nextInt();
	int result=convertBinaryToDecimal(number);
	System.out.println(result);
}
}   