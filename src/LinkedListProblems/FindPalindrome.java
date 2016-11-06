package LinkedListProblems;

import SinglyLinkedList.LinkedListClass;
import SinglyLinkedList.Node;
import sun.awt.image.ImageWatched;

/**
 * Created by Kumar on 10/25/2016.
 */
//This takes care of only odd number of nodes in the linked list. A conditional check after the while loop in line 30 will take care of even number of nodes in the list.
public class FindPalindrome {
    public static void main(String arg[]) {
        LinkedListClass myLL = new LinkedListClass();
        myLL.AddNode(new Node(5));
        myLL.AddNode(new Node(33));
        myLL.AddNode(new Node(9));
        myLL.AddNode(new Node(91));
        myLL.AddNode(new Node(9));
        myLL.AddNode(new Node(33));
        myLL.AddNode(new Node(5));
        boolean result1 = Method1(myLL);
        System.out.println(result1);

    }

    //Method 1: Using the reversal of second half of the linked list
    public static boolean Method1 (LinkedListClass myLL){
        Node Fast_pointer = myLL.Head;
        Node Slow_pointer = myLL.Head;
        while (Fast_pointer!=null && Fast_pointer.NextNode!=null){ //If Fast_pointer == null, the linked list has even number of nodes.
            Slow_pointer=Slow_pointer.NextNode;
            Fast_pointer=Fast_pointer.NextNode.NextNode;
        }
        //At this point Slow_pointer is at the middle of the linked list and Fast_pointer is at the end
        Node temp=myLL.Head;
        Node Back = ReverseList(myLL, Slow_pointer); //This method will give the Back pointer pointing at the beginning of the second part which is reversed second half of list
        Node temp2=Back;
        while(temp!=temp2){
            if(temp.Data!=temp2.Data) return false;
            temp=temp.NextNode;
            temp2=temp2.NextNode;
        }
        return true;
    }

    public static Node ReverseList(LinkedListClass tempList, Node middle){
        Node Back = middle;
        Node Center=Back.NextNode;
        Node Front=Back.NextNode.NextNode;
        Back.NextNode=null;
        while (Front!=null){
            Center.NextNode=Back;
            Back=Center;
            Center=Front;
            Front=Front.NextNode;
        }
        Center.NextNode=Back;
        Back=Center;
        return Back;
    }
}