//linear searching 
import java.util.Scanner;
public class experiment3 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array number:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter number to search: ");
        int num = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                System.out.println("number is  at position: " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("number not found");
        }
    }
}
