
public class experiment1{
    public static void main(String []args){
        int [] a={4,5,7,8,9};
        System.out.println("Array elements are:");
        for(int i=0;i<=a.length;i++){
            System.out.print(a[i]+" ");

        }
    }}


// insertion
// class experiment1 {
//     public static void main(String[] args) {

//         int[] a = new int[6];
//         a[0] = 10;
//         a[1] = 20;
//         a[2] = 30;
//         a[3] = 40;
//         a[4] = 50;

//         int size = 5;
//         int pos = 2;
//         int value = 25;

//         for (int i = size; i > pos; i--) {
//             a[i] = a[i - 1];
//         }

//         a[pos] = value;
//         size++;

//         for (int i = 0; i < size; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }


// deletion
// class experiment1 {
//     public static void main(String[] args) {

//         int[] a = {1,2,3,4,5};
//         int pos = 2;

//         for (int i = pos; i < a.length - 1; i++) {
//             a[i] = a[i + 1];
//         }

//         for (int i = 0; i < a.length - 1; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }


// searching
// class experiment1 {
//     public static void main(String[] args) {

//         int[] a = {45,78,96,5,4};
//         int num= 96;

//         for (int i = 0; i < a.length; i++) {
//             if (a[i] == num) {
//                 System.out.println("Found at index " + i);
//                 break;
//             }
//         }
//     }
// }



// class experiment1 {
//     public static void main(String[] args) {

//         int[] a = {4,5,8,9};
//         a[2] = 45;

//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }
        