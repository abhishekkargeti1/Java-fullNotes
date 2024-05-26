class inheritance {
    int x;
    int y;
    void show(){
        System.out.println(x);
        System.out.println(y);
    }
}
class derived extends inheritance{
    void get(int x , int y){
        this.x=x;
        this.y=y;
        // show();
    }
    public static void main(String[] args) {
        derived d1 = new derived();
        d1.get(100,200);
        d1.show();
    }
}