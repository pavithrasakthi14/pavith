import java.io.*;
import java.util.*;
public class Main
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int i;
for(i=0;i<26;i++)
{
System.out.println((char)('A'+i)+"-->"+('A'+i));
}
}
}
