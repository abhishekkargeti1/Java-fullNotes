class base{
    final void fun(){
        System.out.println("Hello world");
    }

}
class FinalMethod2 extends base {
  
    public static void main(String[] args) {
        FinalMethod2 fm= new FinalMethod2();
        fm.fun();
    }
}
