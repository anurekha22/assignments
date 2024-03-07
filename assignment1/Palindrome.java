package assignment1;

public class Palindrome {
      public static void main(String[] args) {
		int n = 1234321 , a =0;
		for (int i = n; i >0;) {
			int r=i%10;
			a=a*10+r;
			i=i/10;	
		}
		
		if (a == n) {
			System.out.println(n +"is a palindrome");
			
		}
		else {
			System.out.println(n +"is not a palindrome");
		}
			
		
		
	}
}
