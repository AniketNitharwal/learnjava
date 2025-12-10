import java.util.Scanner;
class largest {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int a = sc.nextInt();

        System.out.println("Enter the second number : ");
        int b =sc.nextInt();

        System.out.println("Enter the third number : ");
        int c= sc.nextInt();

        int biggest;

        if (a>=b && a>=c)
        {
            biggest=a;
        }
        else if (b>=a && b>=c){
            biggest=b;
        }
        else {
            biggest = c;

        }
        System.out.println("largest number is : " + biggest);
    
    }
}