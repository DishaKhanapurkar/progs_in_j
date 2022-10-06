class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
};;
public class arrtobst {
    static Node root;
    Node sortedarrtobst(int arr[],int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node node=new Node(arr[mid]);
        node.left=sortedarrtobst(arr, start, mid-1);
        node.right=sortedarrtobst(arr, mid+1, end);
        return node;
    }
    void preorder(Node node){
        if(node==null)
        return;
        System.out.println(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
    public static void main(String[] args) {
        arrtobst tree = new arrtobst();
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = tree.sortedarrtobst(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        tree.preorder(root);
    }
    }
    

