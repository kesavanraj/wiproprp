import java.io.*;
import java.util.*;
public class Naturalno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,count=0,i;
System.out.println("Enter the number");
a=sc.nextInt();
for(i=0;i<=a;i++)
{
count=count+i;
}
System.out.println("Sum of first "+a+" natural number : "+count);
}
}
