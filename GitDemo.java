/*****
 * Thuytien Chu
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
        System.out.print("Add num " + num + "to previousNumber " + previousNumber + "\n");
        previousNumber+=num;
        System.out.print("Previous number is now: " + previousNumber);
        return 0;
    }
    
    /*****
     * This function should reverse 'num' and return the resulting value.
     * i.e. if num = 1234
     *  the function will return 4321
     * @param num - number to reverse the digits on (description of passed in arguments go here)
     * @return newNumber - the reverse of 'num' (description of return value goes here)
     *****/
    public void templateFunction(int num) {
        double newNumber = 1;
        
        for(int i=1; i<=num; ++i) {
            newNumber = newNumber*i;
        }
        
        return newNumber;        
    }
}
