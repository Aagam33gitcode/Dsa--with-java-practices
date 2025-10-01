package Tree;

public class SearchEle {
    private BinaryTree.Node root;
    public  boolean findEle(int item){
        return findEle(this.root,item);
    }
    private boolean findEle(BinaryTree.Node nn, int item){
        if (nn==null){
            return false ;
        }
        if (nn.value==item){
            return true;
        }
        boolean left=findEle(nn.left,item);
        boolean right=findEle(nn.right,item);
    return left||right;
    }
   public static void main(String[] args) {
        SearchEle se=new SearchEle();
se.findEle(80);
    }
}
