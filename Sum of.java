import java.io.*;
	import java.util.*;
	public class Main
	{
	public static void main(String args[])throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int sum=0;
	for(int i=1;i<=15;i++)
	{
	  sum=sum+i;	
	}
	System.out.println(sum);
	 for(int j=15;j<=45;j++)
	{
		if(j%2!=0)
		{
			System.out.println(j);
			sum=sum+j;
		}
	}
       System.out.println("sum"+sum);
	}
	}
	
