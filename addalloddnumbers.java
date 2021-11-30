package caterpillarjavaquestions.java;
import java.io.*;
import java.lang.*;
import java.util.*;
public class addalloddnumbers {
private static int calculateDiscount(int billAmount) {
int sum=0;
while(billAmount>0)
{
 int r=billAmount%10;
 int s=r%2;
 if(s!=0) {
 sum+=r;
 }
 billAmount=billAmount/10;
}
return sum;
}
 
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number you want:");
	int billAmount = sc.nextInt();
	int result=calculateDiscount(billAmount);
			System.out.print(result);	
}                    
}   