/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures_chainedtables;



public class Link {
    String bookname;
    Link next;
    Link previous;


Link (String nameofbook){
    bookname = nameofbook;
}
    
public void display() {
    System.out.println(bookname);
}


}