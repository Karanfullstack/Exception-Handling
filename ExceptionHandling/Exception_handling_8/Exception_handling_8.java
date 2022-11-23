class Demo8{
  public static void main(String[] args) {
    try{
      Method();
    }
    catch(Exception e){
      System.out.println("Cause is :" + e.getCause());
    }
  }
  public static void Method() throws Exception{
    int array[] = {1,2,3,4,5};
    try{
      array[10] = 60;
    }
    catch(ArrayIndexOutOfBoundsException aiob){
      Exception e = new Exception();
      e.initCause(aiob);
      throw(e);
    }
  }
}
