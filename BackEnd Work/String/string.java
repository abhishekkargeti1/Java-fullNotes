package String;
class string {
    public static void main(String[] args) {
        String name ="Abhishek";
        System.out.println(name);
        
        String name1 ="Abhishek";
        System.out.println(name);
        System.out.println(name==name1);

        String s1 = new String("Abhsihek");
        System.out.println(s1);
        
        String s2 = new String("Abhsihek");
        System.out.println(s1 ==s2);


        // Concatination
        name.concat("Kargeti");
        String s3=name.concat(" Kargeti");
        System.out.println(s3);
    }    
}
