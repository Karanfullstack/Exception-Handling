// Checked Exception Handling & Unchecked Exception Handling

import java.util.Scanner;
/* class InvalidRollNumberException extends RunTimeException{
  public String toString(){
  return "Value must be between 1 to 40";
}
*/

}
class InvalidRollNumberException extends Exception{
  public String toString(){
    return "Value must be between 1 to 40";
  }
}
class Student{
  int number;
  String Name;
  public Student(int number, String Name) throws InvalidRollNumberException {
    if((number < 0 || number > 40))
    throw new InvalidRollNumberException();
    this.number = number;
    this.Name = Name;
  }
}
class Demo11{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number and Name");
    int n = sc.nextInt();
    String nm = sc.next();
    try{
    Student s = new Student(n, nm);

  }
  catch(InvalidRollNumberException invrne){
    System.out.println(invrne);
    }
    System.out.println("OBject is Created");
  }
}
