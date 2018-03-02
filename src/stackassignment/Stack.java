/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackassignment;

/** This stack class has a stack pointer and the size of the stack. This stack has methods to:
 * Push a new element onto a stack
 * Pop an element off the stack and return the data in the element
 * Print a list of the data in the stack
 * Return the current size of stack
 */
public class Stack {
   public StackElement topoflist;
   public int size; 
  
   // constructor
   public Stack(){
   topoflist = null; // set the top of the list to null
   size = 0; // set the size to zero 
   
   } // end constructor
  
   //***************************************************************************************// 
   
   // this is a method to see if the stack is empty
   public boolean emptyStack(){
   
   return topoflist == null; // we would return the top of the list as null if the stack is empty
   
   } // end emptyStack()
   
   //***************************************************************************************//
   
   // this method return the current stack size 
   public int findSize(){
   
   return size; // return "size" to get the values of current size
   } // end findSize()
   
    //***************************************************************************************//
   
   /* this method pushes a new element onto a stack
   *this method should put data onto the stack, which means it must first put thedata in a stack element
   */
    public void push(String items) {

        StackElement originallist = topoflist; // save original list
        topoflist = new StackElement(); // create new element
        topoflist.setItems(items); // new data
        topoflist.setNext(originallist); // old data as the second element
        size++; // increment size 

    } // end push

     //***************************************************************************************//
    /* this method pop an element off the stack and return the data in the element
     * this method uses a temp variable to get the data from the list
     */
    public String pop() {
        if (emptyStack()) {
            throw new RuntimeException("this stack is empty");
        }
        String temp = topoflist.getItems(); // save the data
        topoflist = topoflist.getNext(); // delete the topofthelist
        size--; // decrement size
        return temp; // return item

    }// end pop()
    //***************************************************************************************//
    /* This method returns the items most recently added to the stack
    *  Throws an exception if theres no such items exist 
    */
    public String peek(){
    if (emptyStack()) throw new RuntimeException ("this stack is empty");
    return topoflist.getItems(); // get data from the top of the list
    
    } // end peek
      //***************************************************************************************//
    
    /* This method prints the list of data from the stack
     */
    public void print() {
        StackElement current = topoflist;
        // while loop to move from first to last 
        while (current != null) {
            System.out.println(current.getItems()); // print the data
            current = current.getNext(); // update
        }
    } // end print() 
    
}// end stack class