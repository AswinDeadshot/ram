import java.util.Scanner;
class Num
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int n=s.nextInt();
	    if(n==0)
	    {
	        System.out.println("Zero");
	    }
	    else if(n>0)
	    {
	        System.out.println("Positive");
	    }
	    else{
	        System.out.println("Negative");
	    }
	}
}
