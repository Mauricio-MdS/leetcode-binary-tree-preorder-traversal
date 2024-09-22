import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        traversePreorder(root, values);
        return values;
    }

    private void traversePreorder(TreeNode node, List<Integer> values) {
        if (node == null) return;

        values.add(node.val);
        traversePreorder(node.left, values);
        traversePreorder(node.right, values);
    }
}