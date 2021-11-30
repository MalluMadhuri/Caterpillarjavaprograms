package caterpillarjavaquestions.java;
import java.io.*;
import java.lang.*;
import java.util.*;
public class uniquerepeatingdigit {
public static int securityKey( int number) {
int answer = 0;
int count[] = new int[10];
while (number > 0)
{
int rem = number%10;
count[rem]++;
number = number/10;
}
for (int i = 0;i<10;i++)
{
if(count[i]>1)
{ 
answer++;
}
}
return answer;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in); 
System.out.println("enter the number you want:");
int number = sc.nextInt();
int result=securityKey(number);
System.out.print(result);	
}
}
 
    