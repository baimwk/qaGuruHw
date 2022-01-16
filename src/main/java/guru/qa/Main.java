package guru.qa;

public class Main {
    public static void main(String[] args) {
        Address gislason57 = new Address("New Celine", "Gislason Crossroad Suite", 57);
        Address mattieport4 = new Address("Giannitown", "Brian Track Mattieport", 4);

        Person TellyWilliamson = new Person("Miss Telly Williamson Sr.", gislason57, 42);
        Person ForrestHills = new Person("Dr. Forrest Hills", gislason57, 21);
        Person EfrenKlein = new Person("Efren Klein", mattieport4, 10);
        TellyWilliamson.getFullAddress();
        ForrestHills.getFullAddress();
        EfrenKlein.getFullAddress();

        ForrestHills.setAddress(mattieport4);
        ForrestHills.setApartment(20);
        ForrestHills.getFullAddress();
    }
}
