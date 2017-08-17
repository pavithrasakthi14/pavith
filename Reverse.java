import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,reverse=0;
n=Integer.parseInt(br.readLine());
while(n!=0)
{
reverse=reverse%10;
reverse=reverse+n%10;
n=n/10;
}
System.out.println(reverse);
}
}

