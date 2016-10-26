package DoublyLinkedList;

/**
 * Created by Kumar on 10/25/2016.
 */
public class DoubleEndedNode {
    DoubleEndedNode NextNode;
    DoubleEndedNode PreviousNode;
    int Data;
    //Empty contstructor
    DoubleEndedNode(){

    }
    //Constructor to generate Node with data
    DoubleEndedNode(int x){
        this.Data=x;
    }
}
