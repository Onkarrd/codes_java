package recursion;

class SumOfDigits {

  public static void main(String[] args) {
    SumOfDigits solution = new SumOfDigits();

    // Example number
    long num = 5299843759879879709L;

    // Call the addDigits method and print the result
    long result = new SumOfDigits().addDigits(num);
    System.out.println("Sum of digits: " + result);  // Expected output: 7
  }

  // Method to compute the digital root of a number
  public long addDigits(long num) {
    // Base case: if the number is a single digit, return it
    if (num < 10) {
      return num;
    }
    System.out.println(num);
    // Recursive case: sum the digits and continue
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return addDigits(sum);
  }
}
