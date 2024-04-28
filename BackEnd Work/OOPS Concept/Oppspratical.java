class Oppspratical {
    String carBrand;
    String carName;
    double carPrice;
    int carFuelTank;
    int carSeatingCapacity;
    public static void main(String[] args) {
        Oppspratical c1 = new Oppspratical();
        // new always allocate a memory in heap area.
        // c1 refernce id.

        // example of  by refernce initialize.

        
        c1.carBrand="BMW"; // ( ./ dot )  member access oprator.  
        c1.carName="Audi R8";
        c1.carPrice=200000.0;
        c1.carFuelTank=12;
        c1.carSeatingCapacity=5;
        System.out.println("Brand :- "+c1.carBrand);
        System.out.println("Name :- "+c1.carName);
        System.out.println("Price :- "+c1.carPrice);
        System.out.println("Fuel Tank Capacity :- "+c1.carFuelTank);
        System.out.println("Seating Capacity :- "+c1.carSeatingCapacity);


        



    }    
}
