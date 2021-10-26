package week6;

public class Address {
    private String street;
    private String city;
    private String country;
    private int zip;

    public Address(String street, String city, String country, int zip) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getZip() {
        return zip;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public String toString() {

        return String.format("%s, %s, (%d), %s.",getStreet(),getCity(),getZip(),getCountry());
    }
}
