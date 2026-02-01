class Node{
    Node left,right;
    int data;
    Node(int data)
    {
        this.data=data;
    }
}
class Basic{
    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        inorder(root);
    }
     static void inorder(Node root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}