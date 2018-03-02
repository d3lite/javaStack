/* Stack Assigmment
 * CSCI 211
 * @author David Seng
 * Last modified on 11/14/2015
 */
package stackassignment;

/**
 * This is the stack assignment, The main method will call all the methods in
 * the stack class to perform its duty The main method will also initialize
 * Strings with an explicit array The software should work no matter how much
 * string is in the array
 */
public class StackAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // create a mystack
        Stack mystack = new Stack();
        // create an array of the five riches people in the world
        String[] richpeople = {"Bill Gates", "Carlos Slim Hel", "Warren Buffett", "Amancio Oretega", "Larry Ellison"};

        // create a for loop to print array
        System.out.println("This is a list of the richest people in the world based on Forbes magazines");
        for (int i = 0; i < richpeople.length; i++) {
            System.out.println(richpeople[i]);
        }
        // check to see if stack is empty
        System.out.println("*****************************************************************\n");
        System.out.println("If list is empty return true, else return false");
        System.out.println(mystack.emptyStack());
        System.out.println("\n*****************************************************************\n");

        // use for loop to push element in array into stack
        for (int i = 0; i < richpeople.length; i++) {
            // push element into stack
            mystack.push(richpeople[i]);
        }
        System.out.println("Check to see if list is empty after updatae. If list is empty return true, else return false");
        System.out.println(mystack.emptyStack());
        System.out.println("\n****************************New Stack*************************************\n");
        // print new stack
        mystack.print();
        System.out.println("\n*****************************************************************\n");
        // find the size
        System.out.println("How many element are in this stack?");
        System.out.println(mystack.findSize());
        System.out.println("\n*****************************************************************\n");

        // peek
        System.out.println("The top person on this stack is:");
        System.out.println(mystack.peek());
        System.out.println("\n*****************************************************************\n");

    
        // create new array and use pop method
        String[] newarray;
        newarray = new String[5];
        System.out.println("New array with the same data:");
        for (int i = 0; i < newarray.length; i++) {
            newarray[i] = mystack.pop();
           // print pop
            
            System.out.println(newarray[i]);
            
        } // end for 
            System.out.println("\n*****************************************************************\n");
            
    }// end method

} // end class
