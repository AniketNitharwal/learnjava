import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter 3x3 matrix elements:");

    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int leftSum = 0; 
        int rightSum = 0;  

        for (int i = 0; i < 3; i++) {
            leftSum += matrix[i][i];  
            rightSum += matrix[i][2 - i];     
        }

        System.out.println("Left = " + leftSum);
        System.out.println("Right = " + rightSum);
    }
}
