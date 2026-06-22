import java .util.*;
public class Expection_handling{
public static void main(String[] args){
     Scanner obj =new Scanner (System.in);
     System.out.println("enter a number1");
     int n1=obj.nextInt();
      System.out.println("enter a number2");
      int n2=obj.nextInt();
      System.out.println("the division value of the number is:"+(n1/n2));
try{

System.out.println("the division value of the number is:"+(n1/n2));
}
catch(ArithmeticException e){
    System.out.println("no number can be divide with zero");
    System.out.println("enter a number1");
      n1=obj.nextInt();
      System.out.println("enter a number2");
       n2=obj.nextInt();
      System.out.println("the division value of the number is:"+(n1/n2));

}
finally{
    System.out.println("program executed successfully");
}
    }
}