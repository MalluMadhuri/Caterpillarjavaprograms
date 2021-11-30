package caterpillarjavaquestions.java;
import java.io.*;
public class vowelsandconsonants {
public static void main(String[] args) {
String str = "avanthika";
int vowelscount = 0, consonantscount = 0;
str = str.toLowerCase();
for(int i = 0;i< str.length();i++) {
char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
{ 
vowelscount++; 
} 
else if((ch >= 'a'&& ch <= 'z')) {
consonantscount++; 
}
}
System.out.println("No of Vowels: " + vowelscount);
System.out.println("No of Consonants: " + consonantscount);
}
}       