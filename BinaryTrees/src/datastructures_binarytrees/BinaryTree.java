/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures_binarytrees;

/**
 *
 * @author d00152098
 */
public class BinaryTree {

    Node root;
        
    public void addNode(int key, String name){
        
        Node newNode = new Node(key,name);
        
        if(this.root == null){
            root = newNode;
        }
        
        else {
            
            Node currentNode = root;
            Node parent = null;
            
            while (true){
                parent = currentNode;
                
                if(key < currentNode.key){
                    currentNode = currentNode.left;
                    
                    if(currentNode == null){
                        parent.left = newNode;
                        return;
                    }
                } 
                
                else if(key >= currentNode.key){
                    currentNode = currentNode.right;
                    
                    if(currentNode == null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public void inOrderTraverseTree(Node currentNode){
        
        if(currentNode != null){
            inOrderTraverseTree(currentNode.left);
            
            System.out.println(currentNode);
            
            inOrderTraverseTree(currentNode.right);
        }
    }
    
    public void preOrderTraverseTree(Node currentNode){
        
        if(currentNode != null){
            
            System.out.println(currentNode);
            
            preOrderTraverseTree(currentNode.left);

            preOrderTraverseTree(currentNode.right);
        }
    }    
    
    public void postOrderTraverseTree(Node currentNode){
        
        if(currentNode != null){

            postOrderTraverseTree(currentNode.left);

            postOrderTraverseTree(currentNode.right);
                        
            System.out.println(currentNode);
                        
        }
    }      
    
    public Node findNode(int key){
        
        Node currentNode = root;
        
        while(currentNode.key != key){
            
            if(key < currentNode.key){
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
            if(currentNode == null){
                return null;
            }
        }
        
        return currentNode;
    }
}
