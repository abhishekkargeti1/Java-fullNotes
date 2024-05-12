class Constructor2 {
    int stuId;
    String stuName;
    String stuCourse;
    Constructor2(int stuId,String stuName,String stuCourse){
        this.stuId=stuId;
        this.stuName=stuName;
        this.stuCourse=stuCourse;
    }
    void display(){
        System.out.println( stuId +" "+stuName+" "+stuCourse);
    }
    public static void main(String []args){
        Constructor2 s1 = new Constructor2(101,"Abhishek","BCA");
        s1.display();
    }
}