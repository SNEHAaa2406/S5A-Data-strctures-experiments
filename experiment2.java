// class ex2 {
//     public static void main(String[] args) {

//         int[][] A = {{1, 2}, {3, 4}};
//         int[][] B = {{5, 6}, {7, 8}};
//         int[][] C = new int[2][2];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 C[i][j] = A[i][j] + B[i][j];
//             }
//         }

//         System.out.println("Addition Result:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print(C[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// class ex2 {
//     public static void main(String[] args) {

//         int[][] A = {{8, 6}, {4, 2}};
//         int[][] B = {{1, 2}, {3, 4}};
//         int[][] C = new int[2][2];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 C[i][j] = A[i][j] - B[i][j];
//             }
//         }

//         System.out.println("Subtraction Result:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print(C[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// class ex2 {
//     public static void main(String[] args) {

//         int[][] A = {{4, 1}, {8, 4}};
//         int[][] B = {{5, 9}, {7, 6}};
//         int[][] C = new int[2][2];

//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 C[i][j] = 0;
//                 for (int k = 0; k < 2; k++) {
//                     C[i][j] += A[i][k] * B[k][j];
//                 }
//             }
//         }

//         System.out.println("Multiplication is:");
//         for (int i = 0; i < 2; i++) {
//             for (int j = 0; j < 2; j++) {
//                 System.out.print(C[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

