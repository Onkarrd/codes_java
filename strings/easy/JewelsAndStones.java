package strings.easy;

//https://leetcode.com/problems/jewels-and-stones/
public class JewelsAndStones {

  public static void main(String[] args) {
    System.out.println(new JewelsAndStones().numJewelsInStones("aA", "aAAbbb"));
  }

  public int numJewelsInStones(String jewels, String stones) {
    int count = 0;
    for (char c : stones.toCharArray()) {
      if (jewels.contains(c + "")) {
        count++;
      }
    }
    return count;
  }
}
