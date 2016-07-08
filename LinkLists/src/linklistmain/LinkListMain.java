/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistmain;

/**
 *
 * @author Paul Millar <D00152098>
 */
public class LinkListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //SingleLists();
        DoubleListsOrdered();
    }
    
    private static void SingleLists(){
        // TODO code application logic here
        LinkList links = new LinkList();
        
        links.InsertLink("Don Quixote", 500);
        links.InsertLink("A Tale of 2 cities", 200);
        links.InsertLink("lord of the rings", 150);
        links.InsertLink("hp & the ss", 107);
        
        links.DisplayLinks();
              
        links.RemoveLink("Don Quixote");
        //links.RemoveLink("lord of the rings");
        //links.RemoveLink("hp & the ss");
        
        links.DisplayLinks();
        
        System.out.println("");
        System.out.println("FIND LINK");

        Link findLink = links.find("A Tale of 2 cities");
        
        if(findLink != null){
            findLink.display();
        } else {
            System.out.println("Not in list");
        }        
    }
    
    private static void DoubleLists(){
        
        DoubleLinkList dList = new DoubleLinkList();
        
        dList.insertLink("Pauls House", 5);
        dList.insertLink("Johns House", 58);
        dList.insertLink("Peters House", 23);
        dList.insertLink("Kens House", 78);
        
        dList.DisplayLinks();
        dList.DisplayLinksBackwards();
        
        System.out.println("\nINSERTING LAST LINK");
        dList.insertLastLink("LAST LINK", 324);
        dList.insertLastLink("LAST LINK 2", 569);
        
        dList.DisplayLinks();
        dList.DisplayLinksBackwards();        
 
    }
    
    private static void DoubleListsOrdered(){
        
        DoubleLinkList dList = new DoubleLinkList();

        dList.insertInOrder("Pauls House", 5);
        dList.insertInOrder("Johns House", 58);
        dList.insertInOrder("Peters House", 23);
        dList.insertInOrder("Kens House", 78);
        
        System.out.println("deleting");
        dList.DisplayLinks();
        //dList.DisplayLinksBackwards(); 
        
        DoubleLink d1 =  dList.removeLink("Paulss House");
        if(d1 != null){
            System.out.println(d1.toString());
        }
        
        System.out.println("after delete");
        dList.DisplayLinks();
    }    
}
