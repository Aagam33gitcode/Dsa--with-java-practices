package Tree;

public class PreOderTraversal {
    static void main(String[] args) {

        PreOderTraversal po=new PreOderTraversal();
    }
    private void preOrder(BinaryTree.Node nn){
        if (nn==null){
            return;
        }
        System.out.println(nn.value);
        preOrder(nn.left);
        preOrder(nn.right);
    }
}
