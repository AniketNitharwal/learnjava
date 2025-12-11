import java.util.Scanner;

class CountObject {
    static int count = 0;

    CountObjects() {       
        count++;           
    }
}

public class CountObjects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many objects you want to create: ");
        int n = sc.nextInt();

        CountObjects[] obj = new CountObjects[n];

        for (int i = 0; i < n; i++) {
            obj[i] = new CountObjects();
        }

        System.out.println("Total number of objects created = " + CountObjects);
    }
}
