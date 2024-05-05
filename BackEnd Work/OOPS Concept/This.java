class test{
    void display(){
        System.out.println(this);
    }
    public static void main(String []args){
        test t1 = new test();
        System.out.println(t1);
        t1.display();
    }
}