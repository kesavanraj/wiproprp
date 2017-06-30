import java.io.*;
import java.util.*;
public class Sumofno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,count=0;
System.out.println("Enter the number");
a=sc.nextInt();
while(a!=0)
{
a=a/10;
++count;
}
System.out.println("Number of digits is: "+count);
}
}
