class Demo6{
  public static void main(String[] args) {
    try{
      int a,b;
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      if((a == 0 || b == 0))
      throw new ArithmeticException();
      if((a < 0 || b < 0))
      throw new Exception();
      //System.out.println("Testing is completed");
    }
    catch(ArithmeticException ae){
      System.out.println("Either of the value is zero");
    }
    catch(ArrayIndexOutOfBoundsException aiobe){
      System.out.println("Must be proved 2 value command");
    }
    catch(NumberFormatException nfe){
      System.out.println("String is Not allowed");
      
    //  System.exit(1);  we can use this function as we don't need to proceed as this
// NumberFormatException  occurs.
  // return if we write return statement as it goes to finally block first after the exception and
  // it will ignore all the catch blocks and after the finally block.

    }
    catch(Exception e){ // this catch Exception is the base class of the Exception Handling...
      System.out.println("Either of the value is less than zero");
    }
    finally{ // Finally bock must be written after the catch block
      System.out.println("This statement is from Try block");
    }

  }
}
