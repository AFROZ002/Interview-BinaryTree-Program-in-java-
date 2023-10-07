package Tree_Interview_Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Iterative_Pre_Order {
    public  static List<Integer> pre(TreeNode root){
        List<Integer>l2=new ArrayList<>();
        Stack<TreeNode>st1=new Stack<>();
        TreeNode node=root;
        while (node!=null || !st1.isEmpty())
        {
            if (node!=null) {
//                l2.add(node.val);
                st1.push(node);
                node=node.left;
            }
            else {
                l2.add(st1.peek().val);
                node=st1.pop().right;


            }

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
        List<Integer>result=pre(root);
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