/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistmain;

/**
 *
 * @author d00152098
 */
public class DoubleLink {
    
    public String Name;
    public int Number;
    
    public DoubleLink next;
    public DoubleLink previous;
    
    public DoubleLink(String name, int num){
        this.Name = name;
        this.Number= num;
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
    @Override
    public String toString(){
        return "\nName: " + this.Name + "\nNumber: " + this.Number;
    }
}
