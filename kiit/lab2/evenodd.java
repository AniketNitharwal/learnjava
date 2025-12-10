import java.util.Scanner;
class evenodd{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int evencount =0;
        int oddcount =0;
        System.out.println("enter 10 numbers : ");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j] %2==0){
                evencount++;
            }else{
                oddcount++;
            }
        }
        System.out.println("Number of even numbers = "+evencount);
        System .out.println("Number of odd numbers = "+oddcount);
        
    }
}