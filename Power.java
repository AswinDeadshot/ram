import java.util.Scanner;
public class Power
{
	public static void main(String[] args) {
	    int n,p,r=1;
	    Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		System.out.println("Enter the power:");
		p=s.nextInt();
		if(n>=0&&p==0)
		r=1;
	    else if(n==0&&p>0)
		r=0;
		else
		{
		    for(int i=1;i<=p;i++)
		    r=r*n;
		}
		System.out.println(n+"^"+p+"="+r);
	}
}
