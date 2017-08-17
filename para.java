import java.io.*;
import java.util.*;
public class Main
{
   public static void main(String args[])throws IOException
     {
      Scanner sc=new Scanner(System.in);
         String s="";
         s=sc.nextLine();
         String s1[]=s.split(" ");
     int count=0;
    for(int i=0;i<s1.length;i++)
     {
     count++;
      }
     System.out.println(count);
   }
}
