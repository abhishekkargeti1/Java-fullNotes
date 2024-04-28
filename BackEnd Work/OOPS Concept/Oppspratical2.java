// By Method  initialize 
class Oppspratical2 {
    int empId ;
    String empName;
    String empDesignation;
    void insertData(int id ,String name , String designstion)// Formal Argument  
    {
        empId = id;
        empName = name;
        empDesignation = designstion;
    } 
    void displayData(){
        System.out.println("Employee Id is  "+empId);
        System.out.println("Employee Name is  "+empName);
        System.out.println("Employee Designation is  "+empDesignation);
    }
    public static void main(String []args){
            Oppspratical2 o1 = new Oppspratical2();
            o1.insertData(101,"Abhishek","Admin"); // Actual perameter
            o1.displayData();
            Oppspratical2 o2 = new Oppspratical2();
            o2.insertData(102,"Abhishekkargeti","Admin1");
            o2.displayData();
            Oppspratical2 o3 = new Oppspratical2();
            o3.insertData(103,"Abs","Admin2");
            o3.displayData();
    }
}
