import java.util.Scanner;

public class ex4b  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1; i++) {
            int min = i;
            for(int j = i+1; j < n; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            int t = a[i];
            a[i] = a[min];
            a[min] = t;
        }

        System.out.println("Sorted list by selection sort:");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}