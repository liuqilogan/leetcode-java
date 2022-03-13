package Template;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left,TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // 深度优先搜索
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return res;
        }
        dsf(root, 0);
        return res;
    }

    private void dsf(TreeNode root, int level) {
        if(root == null) {return;}
        if (res.size() == level) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);
        dsf(root.left, level + 1);
        dsf(root.right,level+1);
    }
}
