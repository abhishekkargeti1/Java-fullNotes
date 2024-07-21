abstract class Base{
    abstract void show();
     void fun(){
        System.out.println("Hello i am Base class");
     }
}
class Abstractclass extends Base {
    void show(){
        System.out.println("Heloo i am child class");
    }
    public static void main(String[] args) {
        Base b = new Abstractclass();
        b.fun();
        b.show(); 

        // Abstractclass ab = new Abstractclass();
        // ab.fun(); 
        // ab.show(); 
    }
}
