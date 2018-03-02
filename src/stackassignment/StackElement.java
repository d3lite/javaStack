/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackassignment;

/**
 *
 * @author David
 */
public class StackElement {

    private String items;
    private StackElement next;
//*****************************************************************//
 // constructor
    public StackElement() {

    }
// constructor
    public StackElement(String items, StackElement next) {
        this.items = items;
        this.next = next;

    }
    //************************************************************//
    public StackElement(String items){
    this.items = items;
    
    }
    public StackElement (StackElement next){
    
    this.next = next;
    
    }
    //************************************************************//
   // accessors
    public String getItems(){
    
    return items;
    }
    
    public StackElement getNext(){
    return next;
    }
   //************************************************************//
    //mutators
    public void setItems(String items){
    
    this.items = items;
    }
    
    public void setNext(StackElement next){
    
    this.next = next;
    }
    
}
