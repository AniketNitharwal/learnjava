import java.util.*;
class greater{
    public static void main (String [] args){
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number=");
        a=sc.nextInt();
        System.out.println("enter the second number=");
        b=sc.nextInt();
        
        if(a>b){
            System.out.println(a+"greater than "+b);
        }
        else if(a==b){
        System.out.println(a+"is equal to "+b);
    }
        else{
            System.out.println(a+"is smaller than"+b);
        }
}
}