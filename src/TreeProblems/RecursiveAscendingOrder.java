package TreeProblems;

/**
 * Created by Kumar on 11/11/2016.
 */
public class RecursiveAscendingOrder {

    //Define Nodes of the tree
    public static class Node{
        Node Left;
        Node Right;
        int data;

        Node(){
            this.Left=null;
            this.Right=null;
            this.data=0;
        }

        Node(int x){
            this.Right=null;
            this.Left=null;
            this.data=x;
        }

    }

    //Define tree class without any methods to add node, etc. For solving problems, create manually all the nodes and the tree structure

    public static class tree{
        Node Root;
    }

    //For this problem, design the tree as below:
    /*
            55 --- root
           /  \
          32  63
         / \   / \
        11 44 59 90

     */
    public static void main(String args[]){
        tree myTree = new tree();
        myTree.Root = new Node(55);
        myTree.Root.Left = new Node(32);
        myTree.Root.Left.Left = new Node(11);
        myTree.Root.Left.Right = new Node(44);

        myTree.Root.Right = new Node(63);
        myTree.Root.Right.Right = new Node(90);
        myTree.Root.Right.Left = new Node(59);
        InorderAscending(myTree.Root);
    }

    //Recursive method to do inorder traversal to print numbers in ascending order

    public static void InorderAscending(Node root) {
        if(root!=null){
            InorderAscending(root.Left);
            System.out.println(root.data);
            InorderAscending(root.Right);
        }

    }
}
