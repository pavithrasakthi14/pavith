import java.io.*;
	import java.util.*;
	public class Main
	{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int sum=0;
	System.out.println("Enter the number:");
	int n=Integer.parseInt(br.readLine());
	
	for(int i=1;i<=n;i++)
	{
	  sum=sum+i;	
	}
	System.out.println(sum);
	}
	}
	 
