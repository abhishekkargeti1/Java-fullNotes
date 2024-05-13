class Constructor {
   String name;
   int age;
   String course;
   Constructor(String name,int age ,String course){
    this.name= name;
    this.age=age;
    this.course=course;
   }
   Constructor(Constructor c1){
    name = c1.name;
    age = c1.age;
    course = c1.course;
   }
   void display(){
    System.out.println(name+" "+age+" "+course);
   }

    public static void main(String []args){
        Constructor c1 = new Constructor("Abhishek",22,"BCA");
        Constructor c2 = new Constructor(c1);
        c1.display();
        c2.display();
    }
    
}
