import java.util.*;
import java.io.*;
public class Oddeven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter the number");
a=sc.nextInt();
if(a%2==0)
{
System.out.println("Even");
}
else
{
System.out.println("odd");
}
}
}
