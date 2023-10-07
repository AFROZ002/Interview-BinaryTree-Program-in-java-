package Tree_Interview_Questions;
import  java.util.*;

import java.util.List;

public class Post_Order_2ndMethod {
    public  static List<Integer>PO2(TreeNode root){
        Stack<TreeNode>st1=new Stack<>();
        List<Integer>l1=new ArrayList<>();
        if(root==null){
            return l1;
        }

        st1.add(root);
        while(!st1.isEmpty()){
            TreeNode p=st1.pop();
            l1.add(p.val);
            if(p.left!=null){
                st1.add(p.left);
            }
            if(p.right!=null){
                st1.add(p.right);
            }

        }


        Collections.reverse(l1);
        return l1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.right.left = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        List<Integer>result=PO2(root);
        System.out.println(result);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}