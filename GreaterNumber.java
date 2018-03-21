import java.util.Scanner;
public class GreaterNumber
{
	public static void main(String[] args) {
	    Scanner C=new Scanner(System.in);
	    System.out.println("Enter the Numbers:");
		int a=C.nextInt();
	    int b=C.nextInt();
	    int c=C.nextInt();
	    if(a>b&&a>c){
	        System.out.println(a+" greater than other numbers");
	    }
	    else if(b>c)
	    {
	        System.out.println(b+" greater than other numbers");
	    }
	    else{
	        System.out.println(c+" greater than other numbers");
	    }
	    
	}
}
