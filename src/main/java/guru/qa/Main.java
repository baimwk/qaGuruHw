package guru.qa;

public class Main {
    public static void main(String[] args) {
        Address gislason57 = new Address("New Celine", "Gislason Crossroad Suite", 57);
        Address mattieport4 = new Address("Giannitown", "Brian Track Mattieport", 4);

        Person tellyWilliamson = new Person("Miss Telly Williamson Sr.", gislason57, 42);
        Person forrestHills = new Person("Dr. Forrest Hills", gislason57, 21);
        Person efrenKlein = new Person("Efren Klein", mattieport4, 10);
        tellyWilliamson.getFullAddress();
        forrestHills.getFullAddress();
        efrenKlein.getFullAddress();

        forrestHills.setAddress(mattieport4);
        forrestHills.setApartment(20);
        forrestHills.getFullAddress();
    }
}
