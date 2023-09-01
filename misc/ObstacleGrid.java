package misc;

class Solution {

  public boolean isSymmetric(TreeNode root) {
      if (root == null || (root.left == null && root.right == null)) {
          return true;
      }
    return check(root.left, root.right);
  }

  public boolean check(TreeNode l, TreeNode r) {
      if (l == null && r == null) {
          return true;
      }
      if (l == null || r == null) {
          return false;
      }
      if (l.val != r.val) {
          return false;
      }
    return check(l.right, r.left) && check(l.left, r.right);
  }

  public static void main(String[] args) {
    TreeNode leftFive = new TreeNode(5);
    TreeNode leftFour = new TreeNode(4);
    TreeNode leftThree = new TreeNode(3, leftFour, leftFive);
    TreeNode rightFive = new TreeNode(5);
    TreeNode rightThree = new TreeNode(3, null, rightFive);
    TreeNode root = new TreeNode(2, leftThree, rightThree);

    System.out.println(new Solution().isSymmetric(root));
  }
}
