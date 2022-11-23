import java.io.*;
class Demo9{
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println("Answer is: " + (a/b));
 try{
   FileInputStream f = null;
   f = new FileInputStream("/demo.txt");
   int m;
   while((m = f.read()) != -1){
     System.out.println((char)  m);
   }
   f.close();
 }
 catch(FileNotFoundException fnf){
   System.out.println("Pleaes Check if there is a file avilable");
 }
 catch(IOException ioe){
   System.out.println("Find is not found!");
    }
  }
}
