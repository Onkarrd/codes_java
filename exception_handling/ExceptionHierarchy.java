package exception_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent {

  void show() throws IOException {

  }
}

class Child extends Parent {

  void show() throws FileNotFoundException {

  }
}

public class ExceptionHierarchy {

  public static void main(String[] args) throws FileNotFoundException {
    Child c = new Child();
    c.show();
  }
}
