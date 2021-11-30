package caterpillarjavaquestions.java;
import java.io.*;
import java.lang.*;
import java.util.*;
public class numberappeard {
public int occurenceOfNumber(int data, int digit) {
 int answer=0;
 int number=0;
 while(data>0) {
 number=data%10;
 if(number==digit)
 {
 answer = answer+1;
 }
	data=data/10;
}
return answer;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	numberappeard occofnum = new numberappeard();
	System.out.println("enter a number:");
	int data = sc.nextInt();
	System.out.println("Enter a value to check the Occurence: ");
	int digit = sc.nextInt();
	int result = occofnum.occurenceOfNumber(data,digit);
	System.out.println(result);
	}
}
		





 
 