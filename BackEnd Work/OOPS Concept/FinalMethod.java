class base{
    final void fun(){
        System.out.println("Hello world");
    }

}



class FinalMethod extends base {
    void fun(){
        System.out.println("Hello I am child class");
    }
    public static void main(String[] args) {
        FinalMethod fm= new FinalMethod();
        fm.fun();
    }
}
