package caterpillarjavaquestions.java;
import java.util.Arrays;
public class maximumsumoftwonumbers {
public static int sumoftwohighestelements(int[] elements) {
int firstmax = Integer.MIN_VALUE;
int secondMax = Integer.MAX_VALUE;
for (int value : elements)
{
if (value > firstmax)
{
secondMax = firstmax;
firstmax = value;
}
else if (value > secondMax && value < firstmax) {
secondMax = value;
}
}
System.out.println("The  First Highest Element is: " + firstmax);
System.out.println("The Second Highest Element is: " + secondMax);
int sum = firstmax + secondMax;
return sum;
}
public static void main(String[] args) {
int[] Elements = { 9,-5,-6,-7,-8,10 };
int result = sumoftwohighestelements(Elements);
System.out.println("The Sum Of Two Highest Element is: " + result);
}
}
 