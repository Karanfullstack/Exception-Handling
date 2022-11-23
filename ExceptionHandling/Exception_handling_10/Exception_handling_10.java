class Demo10{
  public static void main(String[] args) throws Exception {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    if((a == 0 || b == 0))
    throw new Exception(); // must have throws
    // throw new ArithmeticException(); without throws can be written
  }
}
