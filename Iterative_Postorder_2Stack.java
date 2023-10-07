package Tree_Interview_Questions;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_Postorder_2Stack {
    public  static List<Integer>Post2(TreeNode root){
        Stack<TreeNode>st1=new Stack<>();
        Stack<TreeNode>St2=new Stack<>();
        List<Integer>l2=new ArrayList<>();
      st1.push(root);
      while (!st1.isEmpty()){
          root=st1.pop();
          St2.push(root);
          if (root.left!=null){
               st1.push(root.left);

          }
          if (root.right!=null){
              st1.push(root.right);
          }
      }
        while (!St2.isEmpty()) {
            TreeNode temp = St2.pop();
            l2.add(temp.val);
        }
        return l2;

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
      List<Integer>result=Post2(root);
        System.out.println(result);
    }
}
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}