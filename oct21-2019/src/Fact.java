
public class Fact {
	


	static int fact(int n) {
		
		if(n==0)
			return 1;
		else
		    return (n*fact(n-1));

	}
	
	public static void main(String[] args) {
		
		int d =fact(4);
		System.out.println("Factorial of a number is ="+d);
	}
}
