package Tree;

public class InOrder {
    static void main(String[] args) {
        InOrder in=new InOrder();
    }
    private void  inOrder(BinaryTree.Node nn){
        if (nn==null){
            return;
        }
        inOrder(nn.left);
        System.out.println(nn.value+" ");
    inOrder(nn.right);
    }
}
