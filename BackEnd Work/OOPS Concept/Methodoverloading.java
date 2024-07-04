public class Methodoverloading {

    static void sum(int x, int y) {
        System.out.println("Sum of two Number " + (x + y));
    }
    static void sum(int x, int y,int z) {
        System.out.println("Sum of two Number " + (x + y+z));
    }
    static void sum(int x, int y,int z,int a) {
        System.out.println("Sum of two Number " + (x + y+z+a));
    }
    static void sum(int x, int y,int z,int a,int b) {
        System.out.println("Sum of two Number " + (x + y+z+a+b));
    }

    public static void main(String[] args) {
        sum(12, 13);
        sum(120, 134,45);
        sum(1290, 1323,56,780);
        sum(121, 1300,67,887,899);
        // sum(121, 1300,67,887,899,78);
    }
}
