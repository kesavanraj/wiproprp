import java.io.*;
import java.util.*;
public class Sumno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,i=0,sum=0;
System.out.println("Enter the number");
a=sc.nextInt();
while(i<=a)
{
sum=sum+i;
i++;
}
System.out.println("Sum of first "+a+" (N) numbers : "+sum);
}
}
