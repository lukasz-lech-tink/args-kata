package se.tink.kata.args;

public class Args {

  public Args(String s, String[] args) {
  }

  public boolean getBoolean(char l) throws ArgsException {
    return l == '2';
  }

  public int getInt(char p) throws ArgsException {
    return 0;
  }

  public String getString(char d) throws ArgsException {
    return null;
  }

}
