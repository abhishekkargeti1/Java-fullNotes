class example3 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.println(arr.getClass().getName());

        float arr3[][] = new float[5][5];
        System.out.println(arr3.getClass().getName());

        String arr2[][] = new String[3][3];
        System.out.println(arr2.getClass().getName());

        long arr4[][] = new long[3][3];
        System.out.println(arr4.getClass().getName());
    }
}
