/************************************************************
 * Brian Banfield
 * 9/4/2022
 * Fibonacci Sequence. 
 ***********************************************************/

package fibonacci;

/**
 * Demonstrates nth term of the Fibonacci sequence.
 * @author Brian Banfield
 *
 */

class FibonacciSequence {
		/**
		 * This is main class.
		 * @param args input arguments not used.
		 */
	    public static void main(String[] args) {
	        int n = 10;
	        int y = Fibonacci(n);
	        System.out.println("The " + n + "th term of the Fibonacci sequence is " + y + ".");
	    }
	    /**
	     * This method returns the nth term of the Fibonacci sequence.
	     * @param n The nth term of the Fibonacci sequence.
	     * @return Fibonacci number for n. 
	     */	    
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