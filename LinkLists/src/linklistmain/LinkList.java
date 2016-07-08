/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistmain;

/**
 *
 * @author Paul Millar <D00152098>
 */
public class LinkList {
    
    private Link FirstLink;
    
    public LinkList(){
        FirstLink = null;
    }
    
    public void InsertLink(String title, int copiesSold){
        Link newLink = new Link(title,copiesSold);
        newLink.Next = FirstLink;
        FirstLink = newLink;
    }
    
    public Link RemoveLink(String title){
                
        if(title.isEmpty()){
            return null;
        }
        
        Link PreviousLink = FirstLink;
        Link CurrentLink = FirstLink;
        
        while(!CurrentLink.Title.equals(title)){
            if(CurrentLink.Next == null){
                return null;
            } else {
                PreviousLink = CurrentLink;
                CurrentLink = CurrentLink.Next;
            }
        }
                
        if(CurrentLink == FirstLink){
        //if(CurrentLink.Title.equals(FirstLink.Title)){
            FirstLink = FirstLink.Next;
        } else {
            PreviousLink.Next = CurrentLink.Next;
        }
        
        return CurrentLink;      
        
    }
    
    public Link find(String title){
        
        Link tempLink = FirstLink;
        
        while(tempLink != null){
            if(tempLink.Title.equals(title)){
                return tempLink;
            }
            tempLink = tempLink.Next;
        }
        return null;
    }
    
    public void DisplayLinks(){        
        System.out.println("");
        
        Link temp = FirstLink;        
        while(temp != null){
            temp.display();
            temp = temp.Next;
        }
    }
}
