/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures_binarytrees;

/**
 *
 * @author d00152098
 */
public class Node {
    
    int key;
    String name;
    
    Node left;
    Node right;
    
    public Node(int key, String name){
        this.key = key;
        this.name = name;
    }

    public String toString(){
        return name + " has a key " + key;
    }
}
