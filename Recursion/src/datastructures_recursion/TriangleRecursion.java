/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datastructures_recursion;

public class TriangleRecursion {
    
    public TriangleRecursion(){}
    
    public int recurse(int n){
       
        if (n == 0){
            return 0;            
        } else {
            int stars = n + recurse(n-1);

            for(int i = 1 ; i <= n ; i++){
                System.out.print("*");
            }
            System.out.println("");
            return stars;
        }
    }
}
