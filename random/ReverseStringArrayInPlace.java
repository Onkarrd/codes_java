package random;

public class ReverseStringArrayInPlace {

    public static void main(String[] args) {

        String input = "hello";
        reverseString(input.toCharArray());
        System.out.println(input);
    }

    public static void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;
        while (first < last) {
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
    }
}
