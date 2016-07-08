/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures_recursion;

/**
 *
 * @author Paul Millar <D00152098>
 */
public class DataStructures_Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(triangleRecursion(5));
        
        
        TriangleRecursion tr = new TriangleRecursion();
        System.out.println("");
        System.out.println(tr.recurse(10));
    }
    
    public static int triangleRecursion(int n){
       
        if (n == 0){
            return 0;
        } else {
            int stars = n + triangleRecursion(n-1);
            for(int i = 1 ; i <= n; i++){
                System.out.print("*");
            }
            System.out.println("");
            return stars;
        }
    }
    
}
