package DoublyLinkedList;

/**
 * Created by Kumar on 10/25/2016.
 */
public class DoublyLinkedList {
    private DoubleEndedNode Head;
    private DoubleEndedNode Tail;
    private int Length;

    //Method to add a new node
    void AddNode(int x){
        DoubleEndedNode newNode = new DoubleEndedNode(x);
        if(this.Head==null && this.Tail==null){
            this.Head=newNode;
            this.Tail=newNode;
            this.Length=1;
        }
        else{ //Insert new node at the head
            newNode.NextNode=this.Head;
            this.Head.PreviousNode=newNode;
            this.Head=newNode;
            this.Length++;
        }
    }

    //Method to remove a node and return true or false depending upon success or failure
    boolean RemoveNode(int x){
        if(this.Head==null && this.Tail==null){
            return false;
        }
        else if(this.Head==this.Tail && this.Head.Data==x){
            this.Head=null;
            this.Tail=null;
            this.Length=0;
            return true;
        }
        else{
            DoubleEndedNode temp = new DoubleEndedNode();
            temp=this.Head;
            while(temp!=null){
                if(temp.Data==x){
                    temp.PreviousNode.NextNode=temp.NextNode;
                    temp.NextNode.PreviousNode=temp.PreviousNode;
                    this.Length--;
                    return true;
                }
                temp=temp.NextNode;
            }
            return false;
        }

    }

    //Method to print the entire linked list
    void ShowList(){
        DoubleEndedNode temp= new DoubleEndedNode();
        temp=this.Head;
        while(temp!=null){
            System.out.println("Data on this node is: "+temp.Data+" The address of this node is"+ temp);
            temp=temp.NextNode;
        }
    }

    //Return length of the linked list (number of nodes in the list)
    int Length(){
        return this.Length;
    }
}
