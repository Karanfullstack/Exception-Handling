class Demo{
  int array[] = new int[5];
  public void set(){
    for(int i = 0; i < 5; i++)
    array[i] = i+2;
  }
  public void print(){
    for(int i = 0; i <= 4; i++)
      System.out.println(array[i]);
  }
  public static void main(String[] args) {
    Demo obj = new Demo();

    try{
      int b = 10;
      int a = b/0;
    }
    catch(Exception e){
      System.out.println("The given value Cannot be divided by zero");
    }
obj.set();
obj.print();
  }
}
