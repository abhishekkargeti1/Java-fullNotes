class base{
    int x =100;
    void show(){
        System.out.println("Hello i am base class");
    }
}

class methodoverridding extends base {
    int x =200;// datamember overridding
    void show()// methodoverridding
    {
        System.out.println("hello i am child class");
    }
    public static void main(String []args){
        methodoverridding m1 = new methodoverridding();
        m1.show();
    }
}