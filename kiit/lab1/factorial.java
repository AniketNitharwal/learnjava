import java.util.Scanner;

public class factorial {
 public static void main(String[] args) {
     Scanner scannerobject = new Scanner(System.in);
     System.out.print("Enter a number : ");
     int num=scannerobject.nextInt();
     long fact =1;
     for (int i=1;i<=num;i++){
        fact=fact*i;

     }
      System.out.println("factorial of "+ num + " is :" + fact );
 }
}