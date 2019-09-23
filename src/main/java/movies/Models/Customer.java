package movies.Models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Customer {

    @NotEmpty(message = "First name is required")
    @Size(min = 2, message = "First name is required")
    private String firstName;

    @NotEmpty(message = "Last name is required")
    @Size(min = 2, message = "Last name is required")
    private String lastName;

//    @Size(min=10)
    private int age;

//    @NotEmpty (message = "Are you the owner")
    private Boolean owner;

    public Customer(){}

    public Customer(String firstName, String lastName, int age, Boolean owner) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.owner = owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Boolean getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }
}
