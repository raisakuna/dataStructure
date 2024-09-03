class  Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data =data;
    }
        }
 class BinarySearchTree {
    Node root;

    public void insert(int data){
        root = insertRec(root, data);
    }
    public Node insertRec(Node root, int data){
        if (root==null)
            root=new Node(data);
        else if (data<root.data)
            root.left =insertRec(root.left, data);
        else if(data > root.data)
            root.right =insertRec(root.right,data);
        return root;
    }

    // Inorder traverse left-root-right
     public void inorder(){
        inorderRec(root);
     }

     private void inorderRec(Node root) {
         if (root != null) {
             inorderRec(root.left);
             System.out.println(root.data + " ");
             inorderRec(root.right);
         }
     }
        // PreOrder root-left-right
         public void preOrder(){
            preOrderRec(root);

     }

     private void preOrderRec(Node root) {
        if (root != null){
            System.out.println(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);

        }

        // PostOrder Left-Right-Root
     }

     public static void main(String[] args) {

    }
}
