import java.io.*;
import java.util.*;
public class Leapyr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("Enter the year");
a=sc.nextInt();
if((a%400==0)||(a%4==0 && a%100!=0))
{
System.out.println(a+" is an leap year");
}
else
{
System.out.println(a+" is not an leap year");
}
}
}
