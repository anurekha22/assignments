package assignment1;

public class FibonacciSeries {
	public static void main(String[] args)
	{
		 
	 int n = 8, firstNum = 0, secondNum = 1;
	 System.out.println("Fibonacci Series till " + n + " terms:");
	 
	    for (int i = 1; i <= n; ++i) 
		    {
	    	 System.out.println( firstNum  ) ;

		      int nextNum = firstNum + secondNum; 
		      firstNum = secondNum;
		      secondNum = nextNum;
		      
		     
		
		    }
	}
}


