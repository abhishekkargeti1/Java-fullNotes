class iterativeControlstatement {
    public static void main(String []args){
        // 4 types of loop in  java
        //1. for loop       iteration known in advance.
                // syntax for(intialization; conditon; increament/decrement)
                // {
                //     # code run when conditonis true.
                // }
                //Example

                // for(int i=0;i<=5;i++){
                //     System.out.println("hello world");
                // }


                //a) Infinite for loop 
                // A loop will executer Infinite number of times
                
                // syntax  for(;;){

                // }


                // nested for loop
                // work on row and cloumn
                // A for loop inside another loop nested for loop
                
                // syntax  
                // for(int i =1;i<=3;i++){
                //     for(int j=1;j<=3;j++){

                //     }
                // }

                //example
                for(int i =1;i<=3;i++){
                       for(int j=1;j<=3;j++){
                            System.out.println(i+" "+j);
                     }
                 }



        //2. while loop     
        // we use while when we don't know numbeer iteration

                    //syntax

                    // intialization
                    //  while(condition){
                        // # code to be executed when condition is true.
                        // increment/decrement
                    // }
                 //example
                 
                 int i=1;
                 while(i<=5){
                    System.out.println(i);
                    i++;
                 }

                //  a Infinite while loop
                // syntax
                
                // while(true){
                //     System.out.println("hello");
                // }

        //3. do while loop
        //4. for each loop
        
        
    }
}
