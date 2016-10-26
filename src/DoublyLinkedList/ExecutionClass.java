package DoublyLinkedList;

/**
 * Created by Kumar on 10/25/2016.
 */
public class ExecutionClass {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DoublyLinkedList myLL = new DoublyLinkedList();
        myLL.AddNode(5);
        myLL.AddNode(105);
        myLL.AddNode(15);
        System.out.println("Length is "+myLL.Length());
        boolean abc=myLL.RemoveNode(105);
        boolean def=myLL.RemoveNode(105);
        System.out.println("Length is "+myLL.Length());
        myLL.ShowList();
        System.out.println(abc +" "+ def);
    }
}
