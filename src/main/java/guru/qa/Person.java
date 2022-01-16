package guru.qa;

public class Person {
    private String fullName;
    private Address address;
    private int apartment;

    public Person(String fullName, Address address, int apartment) {
        this.fullName = fullName;
        this.address = address;
        this.apartment = apartment;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public void getFullAddress() {
        System.out.println(fullName + "'s full address is " + address + ", apartment=" + apartment);
    }
}
