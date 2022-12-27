package features;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PredefinedInterfaces {

  public static void main(String[] args) {
    BiFunction<String, String, String> f = (fn, ln) -> fn + ln;
    BiFunction<String, String, String> f2 = (fn, ln) -> ln + fn;
    Function<String, String> f3 = (fn) -> "Mr. " + fn;
    String fn = "Onkar";
    String ln = "Deshpande";

    System.out.println(f2.andThen(f3).apply(fn, ln));
  }
}
