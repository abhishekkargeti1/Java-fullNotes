class staticKeyword {
    static String compName ="Hcl";
    int empId;
    String empName;
    String empDesignation;

    staticKeyword(int empId,String empName,String empDesignatioString){
        this.empId=empId;
        this.empName=empName;
        this.empDesignation=empDesignatioString;
    }
    static void changeCompanyName(){
        compName="TCS";
    }
    void display(){
        System.out.println("Company name "+compName);
        System.out.println("Employe name "+empName);
        System.out.println("Employe Id "+empId);
        System.out.println("Employe Designation "+empDesignation);
    }
    public static void main(String []args){
        staticKeyword s1 = new staticKeyword(1, "Abhishek", "Java dev");
        s1.display();
        staticKeyword s2 = new staticKeyword(2, "Abhi", "Python dev");
        s2.display();
        changeCompanyName();
        staticKeyword s3 = new staticKeyword(3, "Simran", "javascript dev");
        s3.display();
    }
}
