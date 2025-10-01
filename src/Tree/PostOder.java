package Tree;

public class PostOder {
    static void main(String[] args) {
        PostOder po=new PostOder();
    }
    private void postOder(BinaryTree.Node node){
        if (node==null){
            return;
        }
        postOder(node.left);
        postOder(node.right);
        System.out.println(node.value);
    }
}
