imnport java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int n1,n2,n3;
n1=sc.nextInt();
n2=sc.nextInt();
n3=sc.nextInt();
n3=(n1>n2)?n1:n2;
while(true)
{
if(n3%n1==0 && n3%n2==0)
{
System.out.println("The lcm %d of %d is %d",n1,n2,n3);
}
++n3;
}
}
