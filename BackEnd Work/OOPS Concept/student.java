class student {
    int stuId;
    String stuName;
    String course;
    Address address;
    student(int stuId,String stuName,String course,Address address){
        this.stuId=stuId;
        this.stuName=stuName;
        this.course=course;
        this.address=address;
    }
    void displayData(){
        System.out.println(stuId+" "+stuName+" "+course);
        System.out.println(address.city+" "+address.Pincode+" "+address.state);
    }
    public static void main(String[] args) {
        Address a1 = new Address("Delhi", "110092","New Delhi" );
        Address a2 = new Address("Preet vihar", "110093"," Delhi" );
    
        student s1 = new student(101, "Abhishek","BCA", a1);
        student s2 = new student(102, "Vinay","BBA", a2);
        s1.displayData();
        s2.displayData();

    }

}
