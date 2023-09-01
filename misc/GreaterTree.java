package misc;

class GreaterTree {

  static int sum = 0;

  public static void main(String[] args) {
    Integer[] input = {4, 1, 6, 0, 2, 5, 7, null, null, null, 3, null, null, null, 8};
    TreeNode tree = constructBST(input);

    System.out.println(tree.toStringInorder(tree));

    formGreaterTree(tree);

    System.out.println(tree.toStringInorder(tree));

  }

  static void formGreaterTree(TreeNode node) {
      if (node == null) {
          return;
      }

    formGreaterTree(node.right);

    sum += (int) node.val;
    node.val = sum;
    formGreaterTree(node.left);
  }

  static TreeNode constructBST(Integer[] input) {
    TreeNode node = new TreeNode(input[0]); // 4

    node.left = new TreeNode(input[1]); // 1
    node.right = new TreeNode(input[2]);// 6

    node.left.left = new TreeNode(input[3]); // 0
    node.left.right = new TreeNode(input[4]);// 2

    node.right.left = new TreeNode(input[5]); // 5
    node.right.right = new TreeNode(input[6]);// 7

    node.left.right.right = new TreeNode(input[10]);// 3

    node.right.right.right = new TreeNode(input[14]);// 8

    return node;
  }
}