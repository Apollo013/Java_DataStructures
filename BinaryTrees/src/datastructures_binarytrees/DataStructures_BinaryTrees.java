/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures_binarytrees;

/**
 *
 * @author Paul Millar <D00152098>
 */
public class DataStructures_BinaryTrees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        BinaryTree theTree = new BinaryTree();
        
        theTree.addNode(50,"Boss");
        theTree.addNode(25,"Vice Pres.");
        theTree.addNode(15,"Office Manager");
        theTree.addNode(30,"Secretary");
        theTree.addNode(75,"Sales Manager");
        theTree.addNode(85,"Sales Person 1");  
        
        theTree.inOrderTraverseTree(theTree.root);
        
        System.out.println("");
        
        theTree.preOrderTraverseTree(theTree.root);        

        System.out.println("");
        
        theTree.postOrderTraverseTree(theTree.root);  
        
        System.out.println("");
        
        System.out.println("Search for 30");
        System.out.println(theTree.findNode(30));
    }
    
}
