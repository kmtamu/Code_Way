package SinglyLinkedList;

/**
 * Created by Kumar on 10/25/2016.
 */
public class ExecutionClass {
    public static void main(String arg[]){
        LinkedListClass myLL = new LinkedListClass();
        myLL.AddNode(new Node(89));
        myLL.AddNode(new Node(189));
        myLL.AddNode(new Node(289));
        myLL.AddNode(new Node(839));
        myLL.AddNode(new Node(894));
        myLL.AddNode(new Node(895));
        if(myLL.RemoveNode(895)){
            System.out.println("node removed. New length is: "+myLL.Length());
        }
        myLL.ShowNodes();
    }
}
