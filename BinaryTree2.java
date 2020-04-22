class Node
{
    int data;
    Node left, right;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

 class BinaryTree {
    int ans;
    Node root;
    public int diameterOfBinaryTree(Node root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }
    public int depth(Node node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L+R+1);
        return Math.max(L, R) + 1;
    }
    public static void main(String args[])
   {
        /* creating a binary tree and entering the nodes */
       BinaryTree tree = new BinaryTree();
       tree.root = new Node(1);
       tree.root.left = new Node(2);
       tree.root.right = new Node(3);
       tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        //[4,-7,-3,null,null,-9,-3,9,-7,-4,null,6,null,-6,-6,null,null,0,6,5,null,9,null,null,-1,-4,null,null,null,-2]

      //  System.out.println("The diameter of given binary tree is : "+ tree.diameterOfBinaryTree(r));
    }
}
