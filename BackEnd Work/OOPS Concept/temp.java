class temp {
        temp(){
            System.out.println("Default Constructor");
        }   
        temp(int x){
            this();//this must be in first line.
            System.out.println(x);
        } 
        temp(int x,int y){
            this(100);//this must be in first line.
            System.out.println(x+y);
        } 
        temp(int x,int y,int z){
            this(100,200);//this must be in first line.
            System.out.println(x+y+z);
        } 
        public static void main(String []args){
            new temp(100,200,300);
        }
}
