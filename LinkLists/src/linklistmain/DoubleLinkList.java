/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistmain;

/**
 *
 * @author d00152098
 */
public class DoubleLinkList {
    DoubleLink FirstLink;
    DoubleLink LastLink;
    
    public DoubleLinkList(){
        FirstLink = null;
        LastLink = null;
    }
    
    public boolean isEmpty(){
        return (FirstLink == null);
    }
    
    public void insertLink(String name, int number){
        DoubleLink newLink = new DoubleLink(name,number);

        if(isEmpty()){
            LastLink = newLink;
        } else {
            FirstLink.previous = newLink;
        }
        
        newLink.next = FirstLink;
        FirstLink = newLink;
    }
    
    public void insertLastLink(String name, int number){
        DoubleLink newLink = new DoubleLink(name, number);
            
        if (isEmpty()){
            FirstLink = newLink;
        } else {
            LastLink.next = newLink;
            newLink.previous = LastLink;
        }
        
        LastLink = newLink;
    }
    
    public void insertInOrder(String name, int number){
        DoubleLink newLink = new DoubleLink(name, number);
     
        DoubleLink previous = null;
        DoubleLink current = FirstLink;
        
        while (current != null && number > current.Number){
            previous = current;
            current = current.next;
        }
        
        if(previous == null){
            FirstLink = newLink;
        } else {
            previous.next = newLink;
        }
        
        newLink.next = current;
    }
    
    public DoubleLink removeLink(String name){
    
        if(name.isEmpty() || this.FirstLink == null){
            return null;
        }
        
        DoubleLink PrevoiusLink = FirstLink;
        DoubleLink CurrentLink = FirstLink;
        DoubleLink NextLink = FirstLink.next;
        
        while(!CurrentLink.Name.equals(name)){
            if(CurrentLink.next == null){
                return null;
            } else {
                CurrentLink = CurrentLink.next;
                PrevoiusLink = CurrentLink.previous;
                NextLink = CurrentLink.next;
            }
        }
        
        if(name.equals(FirstLink.Name)){
            FirstLink = FirstLink.next;
        } else if(name.equals(LastLink.Name)){
            LastLink = LastLink.previous;
        } else {
            PrevoiusLink.next = CurrentLink.next;
            NextLink.previous = CurrentLink.previous;
        }
        
        return CurrentLink;
    }
    
    public void DisplayLinks(){        
        System.out.println("");
        System.out.println("FORWARDS !!! ");        
        DoubleLink temp = FirstLink;        
        while(temp != null){
            temp.display();
            temp = temp.next;
        }
    }
    
    public void DisplayLinksBackwards(){
        
        System.out.println("");
        System.out.println("BACKWARDS !!! ");
        
        DoubleLink temp = LastLink;
        while(temp != null){
            temp.display();
            temp=temp.previous;
        }
    }
    
}
