/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PART_C;

/**
 *
 * @author Paul Millar <D00152098>
 */
public class DataStructures_HashTables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //testFirstHashFunction();
        
        //testSecondHashFunction();
        
        testKeyFind();
        
    }
    
    private static void testFirstHashFunction(){
        
        Hashtable ht = new Hashtable(30);
        
        String[] unhashedarray = {"1","5","17","21","26"};
        
        ht.hashFunction1(unhashedarray);
        
        ht.Display();
        
    }
    
    private static void testSecondHashFunction(){
        
        Hashtable ht = new Hashtable(30);
        
        String[] unhashedarray = {  "100","101","102","103","104",
                                    "214","215","216","217","218",
                                    "830","834","835","836","837",
                                    "921","922","923","924","925",
                                    "361","362","363","364","365",
                                    "543","544","545","546","547",};
        
        ht.hashFunction2(unhashedarray);
        
        ht.Display();
        
    }    
    
    private static void testKeyFind(){
        
        Hashtable ht = new Hashtable(30);
        
        String[] unhashedarray = {  "100","101","102","103","104",
                                    "214","215","216","217","218",
                                    "830","834","835","836","837",
                                    "921","922","923","924","925",
                                    "361","362","363","364","365",
                                    "543","544","545","546","547",};
        
        ht.hashFunction2(unhashedarray);
        
        ht.Display();
        
        ht.find("922");
    }
}
