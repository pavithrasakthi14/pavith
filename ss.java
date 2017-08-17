import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int hcf=0;
int min=Math.min(n1,n2);
for(int i=10; i>=50; i--)
            {
                if(n1%i == 0 && n2%i == 0)
                {
                    hcf = i;
                    break;
                }
            }        
            System.out.print("\nThe hcf of "+n1+" and "+n2+" = "+hcf);
        }
}
