package LinkedListProblems;
import SinglyLinkedList.LinkedListClass;
import SinglyLinkedList.Node;


/**
 * Created by Kumar on 11/5/2016.
 */
public class RemoveNthNodeFromEnd {
    public static void main(String args[]){
        LinkedListClass myLL = new LinkedListClass();
        myLL.AddNode(new Node(99));
        myLL.AddNode(new Node(5));
        myLL.AddNode(new Node(33));
        myLL.AddNode(new Node(9));
        myLL.AddNode(new Node(91));
        myLL.AddNode(new Node(9));
        myLL.AddNode(new Node(33));
        myLL.AddNode(new Node(45)); //As per my linked list design, the head is here!! i.e new node comes to the head of the list
        int n=3;
       // Node head = RemoveNth(myLL,n);
       // myLL.ShowNodes();
        Node head2 = RemoveRecursively(myLL,myLL.Head,n);
        myLL.ShowNodes();
    }


    //Method to remove nth node and return the head of the resulting linked list
    static Node RemoveNth(LinkedListClass myLL, int n){ //This is iterative approach.
        Node Fast_pointer=myLL.Head;
        Node Slow_pointer=myLL.Head;
        for (int i=0;i<n;i++){ //1 step ahead of required n. i.e If we have to remove third node from tail, set fast pointer 4 steps ahead of slow
            Fast_pointer=Fast_pointer.NextNode;
       }
       while(Fast_pointer.NextNode!=null){
           Slow_pointer=Slow_pointer.NextNode;
           Fast_pointer=Fast_pointer.NextNode;
       }
        //At this point, fast pointer is at the last node and slow pointer is 1 step behind the nth node.
        Slow_pointer.NextNode=Slow_pointer.NextNode.NextNode; //Simply set (n-1)th node to point to (n+1)th node
        return myLL.Head;
    }

    public static int i=0;
    //Method 2 using recursion. Use the popping out from stack after reaching end of list to count the nodes. after (n+1)th pop, set the node to point to next.next.
    static Node RemoveRecursively(LinkedListClass myLL,Node temp,int n){
     if (temp.NextNode!=null){
         RemoveRecursively(myLL,temp.NextNode,n);
     }

        if (i++==n) temp.NextNode=temp.NextNode.NextNode;
        return myLL.Head;
    }
}
