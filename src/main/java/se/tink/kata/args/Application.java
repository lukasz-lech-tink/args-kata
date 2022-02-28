package se.tink.kata.args;

/*

Taken from: https://github.com/unclebob/javaargs

Schema:
 - char    - Boolean arg.
 - char*   - String arg.
 - char#   - Integer arg.
 - char##  - double arg.
 - char[*] - one element of a string array.

  Example schema: (f,s*,n#,a##,p[*])
  Corresponding command line: "-f -s Bob -n 1 -a 3.2 -p e1 -p e2 -p e3

*/

public class Application {

  public static void main(String[] args) {
    try {
      Args arg = new Args("l,p#,d*", args);
      boolean logging = arg.getBoolean('l');
      int port = arg.getInt('p');
      String directory = arg.getString('d');
      executeApplication(logging, port, directory);
    } catch (ArgsException e) {
      System.out.printf("Argument error: %s\n", e.getMessage());
    }
  }

  private static void executeApplication(boolean logging, int port, String directory) {
    System.out.printf("logging is %s, port:%d, directory:%s\n", logging, port, directory);
  }

}
