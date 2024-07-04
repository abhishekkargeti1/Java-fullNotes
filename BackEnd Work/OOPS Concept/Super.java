class base {
    int x =100;
    void show(){
        System.out.println("Base class");
    }

}

class Super extends base {
    int x = 200;
    void show(){
        System.out.println("Child class");
        super.show();
        System.out.println(x);
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        Super s1 = new Super();
        s1.show();
    }
}
