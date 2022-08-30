package fibonacci;

class FibonacciSequence {

	    public static void main(String[] args) {
	        int n = 10;
	        int y = Fibonacci(n);
	        System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
	    }

	    public static int Fibonacci(int n) {
	        if(n == 0) {
	            return 0;
	        }
	        if(n == 1) {
	            return 1;
	        }
	        
	        return Fibonacci(n - 1) + Fibonacci(n - 2);
	    }
	}