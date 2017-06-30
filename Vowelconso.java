import java.io.*;
import java.util.*;
public class Vowelconso
{
public static void main(String args []) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char a;
System.out.println("Enter the character");
a=(char)br.read();
if((a=='A')||(a=='E')||(a=='I')||(a=='O')||(a=='U')||(a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
{
System.out.println(a+" is an vowel");
}
else if(((a>='A')&&(a<='Z'))||((a>='a')&&(a<='z')))
{
System.out.println(a+" is an consonant");
}
}
}
