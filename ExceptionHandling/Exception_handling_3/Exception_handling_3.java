class Demo3{
  public static void main(String[] args) {
    int a = 10, b;
    try{
      b = Integer.parseInt(args[0]); // command line argument..
      int ans = a/b;
      System.out.println("The Answer is: " + ans);
    }
    catch(Exception e){
      System.out.println("Exception is Generated");
    }
    finally{
      System.out.println("Always Gets Executed");
    }
    System.out.println("After Try Block");
  }
}
