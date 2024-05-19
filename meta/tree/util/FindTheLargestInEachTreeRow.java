package meta.tree.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindTheLargestInEachTreeRow {

    static List<Integer> list;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);

        FindTheLargestInEachTreeRow f = new FindTheLargestInEachTreeRow();
        System.out.println("dfs");
        List<Integer> list = largestValues(root);
        for(Integer i : list){
            System.out.print(i +" ");
        }

        System.out.println("\nbfs");
        List<Integer> list1 = largestValuesBFS(root);
        for(Integer i : list1){
            System.out.print(i +" ");
        }
    }

    private static List<Integer> largestValuesBFS(TreeNode root) {
        List<Integer> response = new ArrayList<>();
        if(root == null) return response;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode node = q.poll();
                max = Math.max(max, node.val);

                if(node.left!=null) {
                    q.add(node.left);
                }

                if(node.right!=null) {
                    q.add(node.right);
                }
            }
            response.add(max);
        }
        return response;
    }

    private static List<Integer> largestValues(TreeNode root) {
        list = new ArrayList<>();
        dfs(root, 0);
        return list;
    }

    private static void dfs(TreeNode root, int row) {
        if(root == null) return;

        if(list.size() == row){
            list.add(row,root.val);
        }else if(list.get(row) < root.val){
            list.set(row, root.val);
        }

        if(root.left!=null) {
            dfs(root.left, row + 1);
        }

        if(root.right!=null) {
            dfs(root.right, row + 1);
        }
    }
}
