package guru.qa;

public class Address {
    private String city;
    private String street;
    private int home;

    public Address(String city, String street, int home) {
        this.city = city;
        this.street = street;
        this.home = home;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return
                "city=" + city +
                        ", street=" + street +
                        ", home=" + home;
    }
}
