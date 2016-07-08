/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures_chainedtables;


public class LinkedList {
    
    Link firstLink; 
   
    LinkedList() {
       firstLink = null;       
   }
   
    public void insertLink(String nameofbook) {

        //nothing fancy, does no sorting at all!

        Link newLink = new Link(nameofbook);

        newLink.next = firstLink;

        if (firstLink != null) {
            firstLink.previous = newLink;
        }

        firstLink = newLink;
    }

    public void displayTheList() {
        Link currentLink = firstLink;

        while (currentLink != null) {
            currentLink.display();
            currentLink = currentLink.next;
        }
    }

}
