class ExerciseSheet3{
    public static void main(String []args){
        // for(int i = 1; i<=5;i++){
        //     for(int j=1;j<=9;j++){
        //         if(j>=i&&j<=10-i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }



        // for(int i = 1; i<=5;i++){
        //     for(int j = 1; j<=9;j++){
        //         if(j<=6-i&&j>=4+i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }
        


        // for(int i=1; i<=5;i++){
        //     for(int j =1; j<=9;j++){
        //         if(j<=i||j>=10-i){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }



        // int k =0;
        // for(int i=1;i<=9;i++){
        //     if(i<=5){
        //         k++;
        //     }else{
        //         k--;
        //     }
        //     for(int j=1;j<=5;j++){
        //         if(j<=k){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }



        // int k =0;
        // for(int i=1;i<=9;i++){
        //     if(i<=5){
        //         k++;
        //     }else{
        //         k--;
        //     }
        //     for(int j=1;j<=5;j++){
        //         if(j>=6-k){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println("");
        // }

            int k=0;
        for(int i =1;i<=9;i++){
            if(i<=5){
                k++;
            }else{
                k--;
            }
            for(int j=1;j<=9;j++){
                if(j>=6-k && j<=4+k){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }




    }
}  
