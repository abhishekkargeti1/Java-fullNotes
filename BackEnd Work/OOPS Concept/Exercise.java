class Exercise{
    // Create a class called Student that has the following attributes: name, age, and grade. Write methods to get and set each attribute. Write a method called printStudentInfo() that prints the student's information to the console.
    String name;
    int age;
    String grade;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    void PrintStudentInfo(){
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Grade is "+grade);
    }
    public static void main(String []args){
        Exercise e1 = new Exercise();
        e1.setName("Abhishek");
        e1.setAge(18);
        e1.setGrade("A");
        e1.PrintStudentInfo();
    }
}