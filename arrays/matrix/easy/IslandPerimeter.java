package arrays.matrix.easy;

/**
 * https://leetcode.com/problems/island-perimeter/
 * <p>
 * 463. Island Perimeter Easy 5.9K 297 Companies You are given row x col grid representing a map where grid[i][j] = 1
 * represents land and grid[i][j] = 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and
 * there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is
 * a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of
 * the island.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]] Output: 16 Explanation: The perimeter is the 16 yellow
 * stripes in the image above. Example 2:
 * <p>
 * Input: grid = [[1]] Output: 4 Example 3:
 * <p>
 * Input: grid = [[1,0]] Output: 4
 * <p>
 * <p>
 * Constraints:
 * <p>
 * row == grid.length col == grid[i].length 1 <= row, col <= 100 grid[i][j] is 0 or 1. There is exactly one island in
 * grid.
 */
public class IslandPerimeter {

  public static int islandPerimeter(int[][] grid) {
    int count = 0;
    int maxRow = grid.length;
    int maxCol = grid[0].length;
    if (maxRow == 1 && maxCol == 1) {
      return 4;
    }
    for (int r = 0; r < maxRow; r++) {
      for (int c = 0; c < maxCol; c++) {
        if (grid[r][c] == 1) {
          if (r == 0) {
            count++;
          }
          if (r == maxRow - 1) {
            count++;
          }
          if (c == 0) {
            count++;
          }
          if (c == maxCol - 1) {
            count++;
          }
          if (r != 0 && grid[r - 1][c] == 0) {
            count++;
          }
          if (c != 0 && grid[r][c - 1] == 0) {
            count++;
          }
          if (r != maxRow - 1 && grid[r + 1][c] == 0) {
            count++;
          }
          if (c != maxCol - 1 && grid[r][c + 1] == 0) {
            count++;
          }
        }
      }
    }
    return count;
  }

  public static int islandPerimeter2(int[][] grid) {
    var totalPerimeter = 0;
    var overlapPerimeter = 0;

    for (var i = 0; i < grid.length; i++) {

      for (var j = 0; j < grid[i].length; j++) {
        if (grid[i][j] == 0) {
          continue;
        }
        if (grid[i][j] == 1) {
          totalPerimeter += 1;
        }
        if (j < grid[i].length - 1 && grid[i][j] == 1 && grid[i][j + 1] == 1) {
          overlapPerimeter++;
        }
        if (i < grid.length - 1 && grid[i][j] == 1 && grid[i + 1][j] == 1) {
          overlapPerimeter++;
        }
      }
    }
    totalPerimeter = 4 * totalPerimeter;
    overlapPerimeter = overlapPerimeter * 2;
    return totalPerimeter - overlapPerimeter;
  }


  public static void main(String[] args) {
    //int[][] input = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
    int[][] input = {{1, 0}};
    System.out.println(islandPerimeter2(input));
  }
}
