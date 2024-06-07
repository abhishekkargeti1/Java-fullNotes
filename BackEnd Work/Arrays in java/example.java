class example {

    static void printArray(int arr[]){
        for(int value :arr){
            System.out.println(value +" ");
        }
    }
    public static void main(String []args){
        // Annonyamous array
        printArray(new int []{12,23,4,5,6,7});
    }    
}
