package week6;

public class Person {
    private String fName;
    private String lName;
    private String phone;
    private Date dateOfBirth;
    private Address address;

    public Person(String fName, String lName, String phone, Date dateOfBirth, Address address) {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getPhone() {
        return phone;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s %nDate of Birth : %s %nPhone :%s %nAddress: %s",getfName(),getlName(),getDateOfBirth(),getPhone(),getAddress());
    }
}
