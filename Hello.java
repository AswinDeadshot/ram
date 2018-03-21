import java.util.Scanner;
public class Hello
{
	public static void main(String[] args) {
	    Scanner C=new Scanner(System.in);
	    System.out.println("Enter the no. of times:");
		int n=C.nextInt();
		C.close();
		for(int i=1;i<=n;i++)
		{
		    System.out.println("Hello");
		}
		
	}
}
