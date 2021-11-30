package caterpillarjavaquestions.java;
import java.io.*;
import java.lang.*;
import java.util.*;

public class integertobinary {
public static int getBinary(int number) {
int answer=0;
int count=0;
while(number!=0)
{
int rem=number%2;
double d=Math.pow(10,count);
answer+=rem*d;
number=number/2;
count++;
}
return answer;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number you want:");
	int number=sc.nextInt();
	
	int result = getBinary(number);
	
	System.out.println(result);
}
}  