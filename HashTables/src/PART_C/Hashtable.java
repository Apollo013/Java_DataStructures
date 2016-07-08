
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PART_C;

import java.util.Arrays;

/**
 *
 * @author Paul Millar <D00152098>
 */
public class Hashtable {
    
    
    private String[] hashedArray;
    private int size;
    
    public Hashtable(int size){
        
        this.size = size;
        
        this.hashedArray = new String[this.size];
        
        Arrays.fill(this.hashedArray,"-1");
        
    }
        
    public void hashFunction1(String[] unHashedArray){
        
        Arrays.fill(this.hashedArray,"-1");
        
        for(int i = 0; i < unHashedArray.length; i++){
            hashedArray[Integer.parseInt(unHashedArray[i])] = unHashedArray[i];
        }
    }
    
    public void hashFunction2(String[] unHashedArray){
        
        Arrays.fill(this.hashedArray,"-1");
        
        for(int i = 0; i < unHashedArray.length; i++){
            
            String newElement = unHashedArray[i];
            
            int arrayIndex = Integer.parseInt(newElement) % (this.size - 1);
            
            System.out.println("Modulus Index = " + arrayIndex + " for value " + newElement);
                        
            while(!hashedArray[arrayIndex].equals("-1")){
                ++arrayIndex;
                System.out.println("Collision - try " + arrayIndex);
                arrayIndex %= (this.size);
            }
            
            hashedArray[arrayIndex] = newElement;
        }
    }    
        
    public String find(String key){
    
        int arrayIndexHash = Integer.parseInt(key) % (this.size-1);
        
        while(!hashedArray[arrayIndexHash].equals("-1")){
            if(hashedArray[arrayIndexHash].equals(key)){
                System.out.println("Found " + key + " at index " + arrayIndexHash);
                return hashedArray[arrayIndexHash];
            }
            ++arrayIndexHash;
            arrayIndexHash %= this.size;
        }
        return null;
    }
    
    public void Display(){
        for(String s : this.hashedArray){
            System.out.println(s.toString());
        }
    }
    
}
