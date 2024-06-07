class example2 {
    static String [] returnArrays(){
        return new String[]{"Ajay","Abhsihek","Divesh","Simran"};
    }
    public static void main(String []args){
        String [] returnArray = returnArrays();
        for(String value :returnArray){
            System.out.println(value+" ");
        }

    }
    
}
