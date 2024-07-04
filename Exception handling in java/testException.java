import java.io.IOException;

class testException{

    public static void main(String[] args)throws IOException {
        // try{
        //     int x=10/0;
        //     System.out.println(x);
        // }catch(ArithmeticException e){
        //     System.out.println("Can't divide by zero");
        // }
        // System.out.println("Program will continue");



        // checked exception

        // int i=System.in.read();
        // System.out.println(i);

        // try{
        //     int x = 10/0;
        //     System.out.println(x);
        //     String name = null;
        //     System.out.println(name.length());
        //     int arr[]=new int[10];
        //     arr[10]=100;
        // }catch(ArithmeticException e){
        //         System.out.println("can't divide by zero");
        //     }catch(NullPointerException e){
        //     System.out.println("String can't be null");
            
        // }catch(ArrayIndexOutOfBoundsException e){
            
        //     System.out.println("Array out of bound index");
        // }


        // nested try

        try{

            try{
                int x=10/0;
                System.out.println(x);
            }catch(ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
            try{
                int arr[]=new int[10];
                arr[10]=100;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound");
            }
            String name=null;
            System.out.println(name.length());
        }catch(Exception e){
            System.out.println("Exception handles");
        }
        System.out.println("program will excutes");



        // Throw Throws Finally


        
    }
}