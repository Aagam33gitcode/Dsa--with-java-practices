package Tree.Pratics;

public class BT_DiameterTree {
//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }
      public int diameterTree(TreeNode root){
          if (root==null){
              return 0;
          }
          int lheigth=diameterTree(root.left);
          int rheigth=diameterTree(root.right);
          int selfheigth=ht(root.left)+ ht(root.right)+2;
          return Math.max(lheigth,Math.max(rheigth,selfheigth));
      }

    private int ht(TreeNode node) {
          if (node==null){
              return -1;
          }
          int left=ht(node.left);
          int right=ht(node.right);
          return Math.max(left,right)+1;
    }

class DiaPair{
          int dt=0;
          int ht=-1;

}
public DiaPair diameter1(TreeNode root){
          if(root==null){
              return new DiaPair();
          }
          DiaPair ldp=diameter1(root.left);
          DiaPair rdp=diameter1(root.right);
          DiaPair sdp=new DiaPair();
          int sd=ldp.ht+rdp.ht+2;
          sdp.dt =Math.max(sd,Math.max(ldp.dt,rdp.dt));
          sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
          return sdp;
}

}
