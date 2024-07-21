class Base{
    public static void show(){
        System.out.println("Hello I am Base Class");
    }

}
class StaticBinding extends Base{
    public static void show(){
        System.out.println("Hello I am Child Class");
    } 
    public static void main(String[] args) {
        Base B1 = new StaticBinding();
        // B1.show();
        // StaticBinding s1 = new StaticBinding();
        StaticBinding s1 = (StaticBinding) B1;
        s1.show();
        
        // s1.show();
    }   
}
