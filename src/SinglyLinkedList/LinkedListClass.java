package SinglyLinkedList;

/**
 * Created by Kumar on 10/25/2016.
 */
public class LinkedListClass {
    public Node Head;
    public Node Tail;
    private int Length;

    //method to add a new node at the head
    public void AddNode(Node newNode){
        if (this.Head ==null && this.Tail==null){
            this.Head = newNode;
            this.Tail = newNode;
            this.Length=1;
        }
        else{
            newNode.NextNode=this.Head;
            this.Head=newNode;
            this.Length++;
        }
    }

    //method to delete a node
    boolean RemoveNode(int x) {
        Node newNode = new Node(x);
        if (newNode.Data == this.Head.Data) { //Data match at head
            Head = Head.NextNode;
            this.Length--;
            return true;
        }
        else { //Data does not match at head
            Node temp = this.Head.NextNode;
            Node lagPoint = this.Head;
            while (temp != null) {
                if (temp.Data == newNode.Data) {
                    lagPoint.NextNode = lagPoint.NextNode.NextNode;
                    this.Length--;
                    return true;
                }
                else{
                    temp=temp.NextNode;
                    lagPoint=lagPoint.NextNode;
                }
            }
        }
        return false;
    }//End of Remove node method

    //Return length of this linked list (number of node present in the list)
    int Length(){
        return this.Length;
    }

    //Prrint all the nodes of the list
    public void ShowNodes() {
        Node temp = this.Head;
        while (temp != null) {
            System.out.println("Data held here is: " + temp.Data + " The address of this node is: " + temp);
            temp=temp.NextNode;
        }
    }
}
