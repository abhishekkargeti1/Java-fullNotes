interface method{
     void show();
     void display();
}

class interface1 implements method {
    public void show(){
        System.out.println("Hello i ma show method");
    }
    public void display(){
        System.out.println("Hello i am display method");
    }
    public static void main(String[] args) {
        method m1 = new interface1();
        m1.display();
        m1.show();
    }
}
