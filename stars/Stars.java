package stars;

public class Stars {


  public static void main(String[] args) {
    /*


  pattern  2
    *
    **
    ***
    ****

    pattern  3
    1
    12
    123
    1234

     pattern  4
    1
    22
    333
    4444

    pattern  5
    ****
    ***
    **
    *

    pattern  6
    12345
    1234
    123
    12
    1

     pattern 7
         *
       * * *
     * * * * *
   * * * * * * *

    pattern 8
      * * * * * * *
        * * * * *
          * * *
            *

    pattern 9
         *
       * * *
     * * * * *
   * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *

pattern 10
*
**
***
****
***
**
*

pattern 11

1
01
101
0101
10101

pattern 12

1        1
12      21
123    321
1234  4321
1234554321

pattern 13
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

pattern 14

A
A B
A B C
A B C D
A B C D E

pattern 15

ABCDE
ABCD
ABC
AB
A

pattern 16

A
BB
CCC
DDDD
EEEEE

pattern 17

    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA


pattern 18

E

D E

C D E

B C D E

A B C D E

pattern 19

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

pattern 20

*      *
**    **
***  ***
********
***  ***
**    **
*      *

pattern 21

****
*  *
*  *
****

pattern 22

5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5




     */

//    printPattern2(4);
//    printPattern3(4);
//    printPattern4(4);
//    new Stars().pattern5(4);
//    new Stars().pattern6(4);
//    printPattern7(4);
//    printPattern8(4);
//    printPattern9(4);
//    printPattern10(4);
//    printPattern11(5);
//    printPattern12(5);
//    printPattern13(5);
//    printPattern14(5);
//    printPattern15(1);
//    printPattern16(5);
//    printPattern17(5);
//    printPattern18(5);
//    printPattern19(2);
//    printPattern20(4);
//    printPattern21(4);
    printPattern22(5);
  }

  private static void printPattern22(int n) {

    for (int i = 0; i < 2 * n - 1; i++) {
      for (int j = 0; j < 2 * n - 1; j++) {
        int top = i;
        int left = j;
        int right = 2 * n - 2 - j;
        int bottom = 2 * n - 2 - i;
        System.out.print(" " + (n - Math.min(Math.min(top, bottom), Math.min(left, right))));
      }
      System.out.println();
    }
  }

  private static void printPattern21(int n) {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  private static void printPattern20(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = i + 1; j <= (2 * n) - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 2; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print("*");
      }
      for (int j = 1; j < (2 * i) - 1; j++) {
        System.out.print(" ");
      }
      for (int j = i; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void printPattern19(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = i; j <= n; j++) {
        System.out.print("*");
      }
      for (int j = 1; j < (2 * i) - 1; j++) {
        System.out.print(" ");
      }
      for (int j = i; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      for (int j = i + 1; j <= (2 * n) - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void printPattern18(int n) {
    for (int i = 1; i <= n; i++) {
      char ch = (char) ('A' + (n - i));
      for (int j = 1; j <= i; j++) {
        System.out.print((ch++) + " ");
      }
      System.out.println();
    }
  }

  private static void printPattern17(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      char ch = (char) ('A' - 1);
      for (int j = 0; j < (2 * i) - 1; j++) {
        if (j < i) {
          ch = (char) (ch + 1);
        } else {
          ch = (char) (ch - 1);
        }
        System.out.print(ch);
      }
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  private static void printPattern16(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        char ch = (char) ('A' + i);
        System.out.print(ch);
      }
      System.out.println();
    }
  }

  static public void printPattern15(int n) {
    for (int i = 1; i <= n; i++) {
      for (char j = 'A'; j <= 'A' + (n - i); j++) {
        System.out.print(j);
      }
      System.out.println();
    }
  }

  private static void printPattern14(int n) {
    for (int i = 1; i <= n; i++) {
      char c = 65;
      for (int j = 1; j <= i; j++) {
        System.out.print(c++ + " ");
      }
      System.out.println();
    }
  }

  private static void printPattern13(int n) {
    int num = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num++ + " ");
      }
      System.out.println();
    }
  }

  private static void printPattern12(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + "");
      }
      int count = 0;
      for (int j = i + 1; j <= (2 * n) - i; j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j + "");
        count++;
      }
     /* for (int j = (2 * n) - i; j <= (2 * n) - 1; j--) {
        System.out.print(((2 * n) - i) - (2 * n - i + 1));
      }*/
      System.out.println();
    }
  }

  private static void printPattern2(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void printPattern3(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + "");
      }
      System.out.println();
    }
  }

  private static void printPattern4(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("" + i);
      }
      System.out.println();
    }
  }

  public void pattern5(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public void pattern6(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i + 1; j++) {
        System.out.print("" + j);
      }
      System.out.println();
    }
  }

  private static void printPattern7(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  private static void printPattern8(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= (2 * n) - (2 * i); j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  private static void printPattern9(int n) {
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= n - i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= (2 * n) - (2 * i); j++) {
        System.out.print("*");
      }
      for (int j = 1; j <= i - 1; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  private static void printPattern10(int n) {
    for (int i = 1; i <= 2 * n - 1; i++) {
      int stars = i;
      if (i > n) {
        stars = 2 * n - i;
      }
      for (int j = 1; j <= stars; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  private static void printPattern11(int n) {
    for (int i = 1; i <= n; i++) {
      int val = i % 2 == 0 ? 1 : 0;
      for (int j = 1; j <= i; j++) {
        val = val == 1 ? 0 : 1;
        System.out.print(val);
      }
      System.out.println();
    }
  }

}