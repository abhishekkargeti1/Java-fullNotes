class base{
    base(){
        System.out.println("Hello i am base class");
    }
    base(int x){
        this();
    System.out.println(x);
    }
    {
        System.out.println("I am init block");
    }
}


class child extends base {
        child(){
            super(100);
            System.out.println("Hello i am child class");
        }    
        {
            System.out.println("I am init block of child class");
        }
    public static void main(String[] args) {
        child s2 = new child();
    }
}
