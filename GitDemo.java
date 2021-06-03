/*****
 * Edit this line to have your name.
 ******/
public class GitDemo {
    
    private double previousNumber;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function adds the given number to the private "previousNumber"
     * stored in the GitDemo class. 
     * 
     * @param num - A number that should be added to GitDemo:previousNumber
     * @return the updated value of 'previousNumber'
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
        return 0;
    }
    
    /*****
     * This function should calculate the factorial of 'num' and return the resulting value.
     * i.e. if num = 4;
     *  the function will return the value of (1 * 2 * 3 * 4)
     *
     * @param num - number to calculate the factorial of
     * @return factorialNumber - the factorial value of 'num'
     *****/
    public void templateFunction(int num) {
        double factorialNumber = 0;
        
        while(num!=0) {
            double temp = num%10;
            factorialNumber = factorialNumber * 10 + temp;
            num/=10;
        }
        
        return factorialNumber;   
    }
}
