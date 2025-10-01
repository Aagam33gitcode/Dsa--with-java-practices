package Tree;

public class FindMax {
    private BinaryTree root;
    public int max(){
        return max(this.root.getRoot());
    }
    private int max(BinaryTree.Node node){
        if (node==null){
            return Integer.MIN_VALUE;
        }
        int left=max(node.left);
        int right=max(node.right);
        return Math.max(node.value,Math.max(left,right));
    }
    public static void main(String[] args) {
        FindMax fm=new FindMax();
        System.out.println(fm.max());
    }
}
