package random;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public String toString() {
        return " " + this.val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String toStringInorder(TreeNode root) {
        String s = "";
        if (root == null) {
            return "";
        }

        s += toStringInorder(root.left);
        s += root.toString();
        s += toStringInorder(root.right);
        return s;
    }

    public String toStringPreorder(TreeNode root) {
        String s = "";
        if (root == null) {
            return "";
        }

        s += root.toString();
        s += toStringPreorder(root.left);
        s += toStringPreorder(root.right);
        return s;
    }

    public String toStringPostOrder(TreeNode root) {
        String result = "";
        if (root == null) {
            return "";
        }

        result += toStringPostOrder(root.left);
        result += toStringPostOrder(root.right);
        result += root.toString();
        return result;
    }

    public static TreeNode populate() {
        return null;
    }

}
