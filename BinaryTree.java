//// Recursive optimized Java program to find the diameter of a
//// Binary Tree
//
//
//
///* Class containing left and right child of current
//node and key value*/
//
//import com.sun.tools.javac.util.Pair;
//
//import java.util.HashMap;
//
/*//class Node
//{
//    int data;
//    Node left, right;
//
//    public Node(int item)
//    {
//        data = item;
//        left = right = null;
//    }
//}*/
//
///* Class to print the Diameter */
//class BinaryTree
//{
//    Node root;
//
//    HashMap<Integer, Integer>  diameterofBinaryTree(Node root)
//    {
//        if (root == null) {
//            HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>(){{put(0,0);}};
//        }
//
//
//        HashMap<Integer, Integer> left = diameterofBinaryTree(root.left);
//        HashMap<Integer, Integer> right = diameterofBinaryTree(root.right);
//
//        int internal_path = Math.max(left.values(), right.values());
//        //if()
//
//        HashMap<Integer, Integer> output= new HashMap<Integer, Integer>();
//        output.put(Math.max(left., right.values());
//        return output;
//
//
///*
//        int lheight = height(root.left);
//        int rheight = height(root.right);
//
//        int ldiameter = diameter(root.left);
//        int rdiameter = diameter(root.right);
//
//        return Math.max(lheight + rheight + 1,
//                Math.max(ldiameter, rdiameter));*/
//
//    }
//
//    /* A wrapper over diameter(Node root) */
//    int diameter()
//    {
//        return diameter(root);
//    }
//
//    /*The function Compute the "height" of a tree. Height is the
//    number f nodes along the longest path from the root node
//    down to the farthest leaf node.*/
//    static int height(Node node)
//    {
//        /* base case tree is empty */
//        if (node == null)
//            return 0;
//
//		/* If tree is not empty then height = 1 + max of left
//		height and right heights */
//        return (1 + Math.max(height(node.left), height(node.right)));
//    }
//
//    public static void main(String args[])
//    {
//        /* creating a binary tree and entering the nodes */
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        //[4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]
//
//        System.out.println("The diameter of given binary tree is : "+ tree.diameter());
//    }
//}
