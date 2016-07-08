package datastructures_queues;

/**
 *
 * @author d00152098
 */
public class Queue {
    
    String[] qList = null;
    int topPos = 0;
    int endPos = -1;
    int nodesOccupied = 0;
    
    public Queue(int size){
        qList = new String[size];       
    }
    
    public void queue(String val){
        if(nodesOccupied < qList.length){           
            endPos = (endPos == (qList.length-1) && topPos > 0) ? 0 : ++endPos;
            endPos = (endPos == topPos && topPos > 0) ? topPos-1 : endPos;
            qList[endPos] = "(" + topPos + " - " + endPos + ")" + val;
            nodesOccupied++;      
        }       
    }
    
    public String dequeue(){
        String returnVal = qList[topPos];
        if(nodesOccupied > 0){
            qList[topPos] = "NOTHING HERE";
            topPos = (topPos == qList.length && endPos > 0) ?  0 : ++topPos;
        }
        nodesOccupied--;
        return returnVal;
    }
    
    public String peek(){
        return qList[topPos];
    }

    public void display(){
        
        if(nodesOccupied == 0){return;}
        
        int lastPos = (endPos > topPos) ? endPos : qList.length-1;
        
        for(int i = topPos ; i <= lastPos ; i++){
            System.out.println(qList[i].toString());
        }
            
        if(endPos < topPos){
            for(int i = 0 ; i < topPos ; i++){
                System.out.println(qList[i].toString());
            }            
        }
    }    
}
