package movies.Models;

//import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private String firstName;
    private String lastName;
    private String password;
    private String country;

    public Student() {}

    public Student(String firstName, String lastName, String password, String country){
        this.firstName = firstName;
        this.firstName = lastName;
        this.password = password;
        this.country = country;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getCountry() {
        return country;
    }
}

