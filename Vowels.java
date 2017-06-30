import java.io.*;
import java.util.*;
import java.lang.*;
public class Vowels
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in))
char a;
System.out.println("Enter a character");
a=(char)br.read();
if((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')||(a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
{
System.out.println("Vowels");
}
else if(((a>='A')&&(a<='Z'))||((a>='a')&&(a<='z')))
{
System.out.println("Consonant");
}
}
}
