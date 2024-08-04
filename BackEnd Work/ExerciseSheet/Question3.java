package ExerciseSheet;
// Create a class called Car that has the following attributes: make, model, year, and color. Write methods to get and set each attribute. Write a method called drive() that prints a message to the console saying that the car is driving.
class Car{
    String make;
    String model ;
    int year;
    String color;
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    void drive(){
        System.out.println("The car is driving");
    }
}
public class Question3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setMake("Toyota");
        c1.setColor("Red");
        c1.setModel("");
        
    }
    
}
