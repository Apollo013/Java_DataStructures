/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures_queues;

/**
 *
 * @author d00152098
 */
public class DataStructures_Queues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue q = new Queue(6);
        
        q.queue("Hello");
        q.queue("There");
        q.queue("Ya");
        q.queue("Boyya !!");
        q.queue("Ya");
        q.queue("Hello AGAIN");        

        System.out.println("\n DE-QUEUING\n");
        System.out.println(q.dequeue() + " - DEQUEUED");
        System.out.println(q.dequeue() + " - DEQUEUED");        

        System.out.println("\n QUEUING\n");
        q.queue("QUEUE AFTER DEQUEUE 1");
        q.queue("QUEUE AFTER DEQUEUE 2");          

        System.out.println("\n DE-QUEUING\n");
        System.out.println(q.dequeue() + " - DEQUEUED");
        System.out.println(q.dequeue() + " - DEQUEUED");        
           
        System.out.println("\n QUEUING\n");
        q.queue("QUEUE AFTER DEQUEUE 3");
        q.queue("QUEUE AFTER DEQUEUE 4");          
                       
        q.display();   
        
    }
}
