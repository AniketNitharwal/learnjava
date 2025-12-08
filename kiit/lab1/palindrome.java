import java.util.Scanner;
public class palindrome 
{
    public static void main(String[] args) {
        int no;
        int r,sum=0,temp;
        Scanner scannerobject = new Scanner(System.in);
         System.out.print("Enter a number: ");
        no = scannerobject.nextInt();
        temp = no;
        while (no > 0) {
            r = no % 10;
            sum = (sum * 10) + r;
            no = no / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is a palindrome number.");
        } else {
            System.out.println(temp + " is not a palindrome number.");
        }
        scannerobject.close();
    }
}