class initBlock{
    initBlock(){
        System.out.println("hello i am constructor ");
    }
    {
        System.out.println("hello Init block");
    }
    initBlock(int x){
        System.out.println(x);
    }
    public static void main(String []args){
            initBlock i1 = new  initBlock();
            initBlock i2 = new  initBlock();

    }
}