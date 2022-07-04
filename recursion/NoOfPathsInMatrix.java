package recursion;

class NoOfPathsInMatrix {

  // Returns The number of way
  // from top-left to mat[m-1][n-1]
  public int countPaths(int m, int n) {
    // Return 1 if it is the first
    // row or first column
      if (m == 1 || n == 1) {
          return 1;
      }

    // Recursively find the no of
    // way to reach the last cell.
    return countPaths(m - 1, n) +
        countPaths(m, n - 1);
  }

  // Driver Code
  public static void main(String args[]) {
    NoOfPathsInMatrix g = new NoOfPathsInMatrix();

    int n = 2, m = 2;
    System.out.println(g.countPaths(n, m));
  }
}