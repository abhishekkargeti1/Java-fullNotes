class FinalVariable2 {
    final int x;
    FinalVariable2(int x){
        this.x=x;
        System.out.println(x);
    }
    public static void main(String[] args) {
        FinalVariable2 fv = new FinalVariable2(20);
    }
}
