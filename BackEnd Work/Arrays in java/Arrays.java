import java.util.*;
class Arrays{
    public static void main(String []args){
        // int arr[]={1,2,3,4,5,6};
        // for(int i=0;i<=5;i++){
        //     System.out.println(arr[i]);
        // }

        // int arr [][]=new int[3][3];
        // System.out.println("Enter values of array");
        // for(int i=0;i<arr.length;i++){
            //     for(int j=0;j<arr.length;j++){
                //         System.out.print(arr[i][j]+" ");
                //     }
                //     System.out.println();
                // }
                // System.out.println((3*3)*4);


    int arr[][]=new int[3][3];
    System.out.println("Enter values of array");
    Scanner sc = new Scanner(System.in);
            for(int i=0;i<arr.length;i++){
                for(int j =0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }   
        
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]*arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void sort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}