package Tree.Pratics;

import java.util.*;

public class Leveorder_BFS {
    class Node<T>{
        Node left;

        T data;

        Node rigth;
        public Node(Node left, T data, Node rigth) {
            this.left = null;
            this.data = data;
            this.rigth = null;
        }

    }
    public List<Integer> BFS(Node<Integer> root){
        List<Integer> ans=new ArrayList<>();
        Queue<Node> qq=new LinkedList<>();
        qq.offer(root);
        while (qq.isEmpty()){
            Node<Integer> node=qq.poll();
            ans.add(node.data);
            if (node.left!=null){
                qq.offer(node.left);
            }
            if (node.rigth!=null){
                qq.offer(node.rigth);
            }
        }return ans;

    }
    public List<Integer> BFS2Stack(Node<Integer> root){
        List<Integer> ans=new ArrayList<>();
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);
        while(s1!=null||s2!=null){
        while (!s1.isEmpty()){
            Node<Integer> node=s1.pop();
            ans.add(node.data);
            if (node.left!=null){
                s2.push(node.left);
            }
            if (node.rigth!=null) {
                s2.push(node.rigth);
            }
        }
       while (s2!=null){
        Node<Integer>  node = s2.pop();
        ans.add(node.data);

           if (node.rigth != null)
               s1.push(node.rigth);
           if (node.left != null)
               s1.push(node.left);
       }
       }
return ans;
        }
    }

