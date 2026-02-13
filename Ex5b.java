import java.util.*;

public class Ex5b  {
    static void merge(int a[], int l, int r) {
        if(l < r) {
            int m = (l + r) / 2;
            merge(a, l, m);
            merge(a, m+1, r);
            merge(a, l, m, r);
        }
    }
    static void merge(int a[], int l, int m, int r) {
        int temp[] = new int[r-l+1];
        int i=l, j=m+1, k=0;
        while(i<=m && j<=r) {
            if(a[i] < a[j]) temp[k++] = a[i++];
            else temp[k++] = a[j++];                                                                                                                                                                                                                                                                                                                                                                                                                                                        
        }
        while(i<=m) temp[k++] = a[i++];
        while(j<=r) temp[k++] = a[j++];
        for(i=l,k=0;i<=r;i++,k++)
            a[i]=temp[k];
    }
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter size: ");
        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        merge(a,0,n-1);

        System.out.println("Sorted Array:");
        for(int x:a)
            System.out.print(x+" ");
    }
}