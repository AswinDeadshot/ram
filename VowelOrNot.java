import java.util.Scanner;
class VowelOrNot
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the letter");
	    char n=s.next().charAt(0);
	    if(n=='a'||n=='A'||n=='e'||n=='E'||n=='i'||n=='I'||n=='o'||n=='O'||n=='e'||n=='U')
	    {
	        System.out.println("its a vowel");
	    }
	    else{
	        System.out.println("not a vowel");
	    }
	}
}
