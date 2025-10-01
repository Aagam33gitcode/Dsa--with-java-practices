package Tree;

public class HeightTree {
    private  int height(BinaryTree.Node nn){
if (nn==null){
    return -1;//Calculate height with 0;
}
        int left=height(nn.left);
        int right=height(nn.right);
        return Math.max(left,right)+1;
    }
    static void main(String[] args) {
        System.out.println("hello");

    }
}
