import java.util.Scanner;
public class NaturalNumbers
{
	public static void main(String[] args) {
	    Scanner Sc=new Scanner(System.in);
	    System.out.println("Enter the Number of times:");
	    int n=Sc.nextInt();
        int a=0;
		Sc.close();
		for(int i=1;i<=n;i++)
		{
		   a=a+i;
		   
		}
		System.out.println(a);
	}
}
