class anonymousObject {
    String penBrand;
    String penColor;
    String penInkcolor;
    double penPrice;
    void setData(String brand ,String color,String inkColor , double price){
        penBrand = brand;
        penColor = color;
        penInkcolor = inkColor;
        penPrice = price;
        displayData();
    }
    void displayData(){
        System.out.println("Brand "+ penBrand);
        System.out.println("Color "+ penColor);
        System.out.println("Ink Color "+ penInkcolor);
        System.out.println("Price "+ penPrice);
    }
    public static void main(String[] args) {
        new anonymousObject().setData("uni-ball","Red","Black",2000.00);
    }    
}
