package BasicQ20;

public class RootEqualSumOfChild2236 {
    public static void main(String[] args) {
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(6);
        TreeNode root = new TreeNode(10, left, right);
        
        RootEqualSumOfChild checker = new RootEqualSumOfChild();
        System.out.println(checker.checkTree(root));
    }
}

class TreeNode {
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

class RootEqualSumOfChild {
    public boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }
}
