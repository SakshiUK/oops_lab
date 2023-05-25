// You are required to compute the power of a number by implementing a calculator. Create a class My Calculator which consists of a single method long power (int, int). This method takes two integers n and p, as parameters and finds (n)p. If either or is negative, then the method must throw an exception which says " n or p should not be negative”. Also, if both and are zero, then the method must throw an exception which says "n or p should not be negative”.
class MyCalculator{
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        try {
            long result1 = myCalculator.power(2, 3);
            System.out.println("Result 1: " + result1);

            long result2 = myCalculator.power(-1, 5); 
            System.out.println("Result 2: " + result2); 

            long result3 = myCalculator.power(0, 0); 
            System.out.println("Result 3: " + result3); 
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
