package caterpillarjavaquestions.java;
import java.util.*;
public class sumofprime {
 public int sumofprimenumber(int num)
 {
 int number=0,sum=0,count=2;
 Boolean isprime=false;
 while(num>0)
 {
 number=num%10;
if(number==2)
{
sum=sum+number;
}
for(int i=2;i<number;i++)
{
if(number%i!=0) 
{
count=count+1;
if(count==number)
{
isprime=true;
}
}
}
if(isprime)
{
sum=sum+number;
isprime=false;
}
num=num/10;
count=2;
}
return sum;
}
public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
System.out.println("enter values");
int num=sc.nextInt();
sumofprime sofp=new sumofprime();
int result=sofp.sumofprimenumber(num);
System.out.println(result);
}
}  
 
	