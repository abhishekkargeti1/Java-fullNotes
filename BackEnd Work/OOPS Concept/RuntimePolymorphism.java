class Base{
    int x =100;
    void show(){
        System.out.println("Hello i am Show of Base class");
    }

}

// in upcasting we can't get the child class personal method.

class RuntimePolymorphism extends Base {
    int x =200;
    void show(){
        System.out.println("Hello i am show of child class");
        super.show();
    }
    void display(){
        System.out.println("Hello i am Display method");
    }
    public static void main(String[] args) {
        Base b = new RuntimePolymorphism();  // Upcasting 
        b.show(); // at compile time check the base class method and at run time run the method of the child class because the object is made of child class.
        System.out.println(b.x);
        RuntimePolymorphism r1= (RuntimePolymorphism)b;
        r1.display();

    }
}
