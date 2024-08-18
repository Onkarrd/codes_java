package strings.easy;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class ReverseVowelsOfString {

  public String reverseVowels(String s) {
    String vowels = "aeiou";
    char[] input = s.toCharArray();
    int start = 0;
    int end = s.length() - 1;
    while (start < end) {
      if (vowels.contains((input[start] + "").toLowerCase()) && vowels.contains((input[end] + "").toLowerCase())) {
        char c = input[start];
        input[start] = input[end];
        input[end] = c;
        start++;
        end--;
        continue;
      }
      if (!vowels.contains((input[start] + "").toLowerCase())) {
        start++;
      }
      if (!vowels.contains((input[end] + "").toLowerCase())) {
        end--;
      }
    }
    return String.valueOf(input);
  }

  public static void main(String[] args) {
    String s = "hello";
    System.out.println(new ReverseVowelsOfString().reverseVowels(s));
  }
}