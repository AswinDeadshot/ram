import java.util.Scanner;
public class LeapYear
{
	public static void main(String[] args) {
	    Scanner C=new Scanner(System.in);
	    System.out.println("Enter the year:");
		int year=C.nextInt();
		C.close();
		boolean leap=false;
	   
	    if(year%4==0)
	    {
	        if(year%100==0)
	        {
	          if(year%400==0)
	            {
	            leap=true;
	            }
	          else
	           {
	            leap=false;
	           }
	        }
	       else
	       {
	            leap=true;
	       }
	    }
	  else
      {
	        leap=false;
	  }
	  if(leap==true)
	  {
	      System.out.println(year+" is a leap year");
	  }
	  else
	  {
	      System.out.println(year+" not a leap year");
	  }
	}
}
