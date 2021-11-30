package caterpillarjavaquestions.java;
import java.io.*;
import java.lang.*;
import java.util.*;
public class perfectsquares {
public int checkDiscounts(int noofcustomers, int[] billamount) {
for(int i=0; i<billamount.length;i++) {
float num = (float) Math.sqrt(billamount[i]);
float check_num = (num*10);
if((check_num%10)==0) {
System.out.println("The eligible bill amounts are: "+billamount[i]);
}
}
return 0;
}
		
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int noofcustomers=0;
System.out.println("Enter the number of customers to check for discounts: ");
noofcustomers=sc.nextInt();
int billamount[]= new int[noofcustomers];
perfectsquares psnd = new perfectsquares();
System.out.println("Enter the bill amount: ");
for(int i=0; i<noofcustomers; i++) {
billamount[i]=sc.nextInt();
}
int result= psnd.checkDiscounts(noofcustomers,billamount);
System.out.println(result);
}
}


 

 
