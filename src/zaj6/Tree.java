package zaj6;

public class Tree {
    public static void main(String[] args) {
        createTree(2);
        System.out.println();
        createTree2(4);
    }

    private static void createTree(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Print space in decreasing order
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; i++) {
            // Print star in increasing order
            for (int k = 1; k <= (rows * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void createTree2(int h){
        for (int i = 2; i < h+2; i++) {
            treInTree(i,h+2);
        }
//       treInTree(h);
//        for (int i = 1; i < h; i++) {
//            for (int j = 0; j < 2*h-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
    private static void treInTree(int h,int c) {
        for (int i =1 ;i<=h;i++) {
            for (int j = c; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
