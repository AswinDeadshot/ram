import java.util.Scanner;
public class NandK
{
  public static void main (String[]args)
  {
    Scanner s = new Scanner (System.in);
       System.out.println ("Enter N and K:");
       int n = s.nextInt ();
       int k = s.nextInt ();
       int sum=0;
       for (int i = 1; i <= n; i++)
       System.out.println (i);
       for (int i = 1; i <= k; i++)
       sum += i;
       System.out.println (sum);
       }
   }
