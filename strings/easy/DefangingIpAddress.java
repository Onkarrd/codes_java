package strings.easy;
//https://leetcode.com/problems/defanging-an-ip-address/

public class DefangingIpAddress {

  public static void main(String[] args) {
    System.out.println(new DefangingIpAddress().defangIPaddr("10.10.10.10"));
  }

  public String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
