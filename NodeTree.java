//Mirza Baig
//CS2720

public class Node {
   
    Node left, right;
    int data;
  
    Node(int item) {
        left = right = null;
        data = item;
    }
}

// partner file 1

public class Tree{
     Node root;
  
     public static void main(String[] args){
         Tree t = new Tree();
   
         t.root = new Node(6);
         t.root.right = new Node(7);
         t.root.left = new Node(2);
         t.root.left.right = new Node(4);
         t.root.left.left = new Node(1);
         t.root.left.right.left = new Node(3);
         
         int dif = t.maxDepth(t.root.left) - t.maxDepth(t.root.right);
         System.out.println("The height difference between the left subtree and the right subtree is : " + dif);
     }
     
    int maxDepth(Node node){
        if (node == null)
            return 0;
        else{
            int rightDepth = maxDepth(node.right);
            int leftDepth = maxDepth(node.left);
            /* use the larger one */
            if (leftDepth > rightDepth)
                return (leftDepth+1);
             else
                return (rightDepth+1);
        }
    }
}
