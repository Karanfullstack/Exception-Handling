import java.io.*;
class Demo5{
   void m1(int a) throws IOException{
     if(a < 0)
     throw new IOException();
     System.out.println("Value of A is: " + a);
   }
   void m2(int a) throws IOException{
     m1(a);
   }
  public static void main(String[] args) {
    Demo5 obj = new Demo5();
    int value = Integer.parseInt(args[0]);
    try{
      obj.m1(value);
    }
    catch(Exception e){
      System.out.println("Negative Value is Not Allowed Exception Generated");
    }
    System.out.println("After Exception Handling");
  }
}
