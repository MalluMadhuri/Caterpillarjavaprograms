package caterpillarjavaquestions.java;
import java.util.*;
import java.io.*;
public class largestandsmallestprimenumbers {
public static void main(String args[])   
{  
int count,sum=0;  
for(int number=1; number<=50; number++)  
{  
count = 0;  
for(int i = 2; i <= number/2; i++)  
{        
if(number%i== 0)  
{  
count++;  
break;  
}  
}
if(count==0)
{   
if(number>45 && number<50) {
sum=number;
sum=number-97;
}
} 
}
System.out.println("The Sum of Prime Numbers from -97 to 50 is: " + sum);  
} 
}   