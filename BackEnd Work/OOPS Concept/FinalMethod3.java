final class base{
    final void fun(){
        System.out.println("Hello world");
    }

}
class FinalMethod3 extends base {
    
    public static void main(String[] args) {
        FinalMethod3 fm= new FinalMethod3();
        fm.fun();
    }
}
