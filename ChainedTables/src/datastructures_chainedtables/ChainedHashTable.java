/*
 * 
 * Chained HashTable Example
 */
package datastructures_chainedtables;

/**
 *
 * @DMN 
 */
public class ChainedHashTable {

    LinkedList[] theHashTable;
    public int arraySize;
            
    public static void main(String[] args) {
        ChainedHashTable HT = new ChainedHashTable(2);
        
        HT.insert("The Bible");
        HT.insert("Enigma");
        HT.insert("Java");
        HT.displayTheTable();
    }
    
   ChainedHashTable(int size){
        arraySize = size;
        theHashTable = new LinkedList[arraySize];
       
        for (int i =0; i<size; i++) {
            theHashTable[i] = new LinkedList();
        }    
   
   }
   
    public void insert (String key) {        
        int HashValue = HashFunction(key);
        theHashTable[HashValue].insertLink(key);        
    }
    
    public int HashFunction (String key) {    
        //simple crue old hash function!
        if (key.length() > 5 ) {
            return 0; 
        }
        else return 1;
        
    }
    
    public void displayTheTable() {
        
        for (int i =0; i<arraySize; i++) {
            System.out.println("Linked LIST: " +i);
            theHashTable[i].displayTheList();            
        }
        
    }
    
     
  } 
            
       


