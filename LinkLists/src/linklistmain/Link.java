/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistmain;

/**
 *
 * @author Paul Millar <D00152098>
 */
public class Link {
    public String   Title;
    public int      CopiesSold;
    public Link     Next;
    
    public Link(String title, int copiesSold){
        Title = title;
        CopiesSold = copiesSold;
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
        return "\nTitle: " + Title + "\nCopies Sold: " + CopiesSold;
    }
}
