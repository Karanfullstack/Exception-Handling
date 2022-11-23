class Demo2{
  public static void main(String[] args) {
    int a = 10, b;
    try{
      b = Integer.parseInt(args [0]);
      int ans = a/b;
      System.out.println("The ans is " + ans);
    }
    catch(Exception e){
      System.out.println("Exception is Generated " + e);
    }
    System.out.println("After Exception");
  }
}
