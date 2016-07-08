/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linklistmain;

/**
 *
 * @author Paul Millar <D00152098>
 * @param <T>
 */
public class GenericLinkList<T> {
    
    private class node{
        private T item;
        private node next;
        
        private node(T item){
            this.item=item;
        }
    }
    
    private node first ;
    private node last;
    int size;
    
    public GenericLinkList(){
        first = null;
        last = null;
        size = 0;
    }
    
    public T deleteFirst(){
        if(size == 0){return null;}
        T item = first.item;
        if(size == 1){
            first = last = null;
        } else {
            first = first.next;
        }
        
        return item;
    }
}
