class base{
    static void fun(){
        System.out.println("I am base class");
    }
}
class MethodHidding extends base {
        void fun(){
            System.out.println("Hhello i am child class");
        }   
    public static void main(String[] args) {
        MethodHidding m1 = new MethodHidding();
        m1.fun();
    }
}
