import java.util.Scanner;
public class Count
{
	public static void main(String[] args) {
	    Scanner S=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n=S.nextInt();
	    int	Count=0;
		while(n>0)
		{
		n/=10;
		Count=Count+1;
		}
		System.out.println("Number of digits:"+Count);
	}
}
