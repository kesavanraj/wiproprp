import java.io.*;
import java.util.*;
public class Alpha
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
char a;
System.out.println("Enter the character");
a=(char)br.read();
if(((a>='a')&&(a<='z'))||((a>='A')&&(a<='Z')))
{
System.out.println(a+" is an alphabet");
}
else
{
System.out.println(a+" is not an alphabet");
}
}
}
