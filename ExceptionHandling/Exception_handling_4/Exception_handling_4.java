class Demo4{
  public static void main(String[] args) {
    int a,b;
    try{
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      if((a <= 0 || b <= 0))
      throw new ArithmeticException();
      int ans = a/b;
      System.out.println("Answer is: " + ans);
    }
    catch(ArithmeticException e){
      System.out.println("Sorry we need both values non-zero positive");
    }
  }
}
