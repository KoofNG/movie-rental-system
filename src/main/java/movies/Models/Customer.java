package movies.Models;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "First name is required")
    @Size(min = 2, message = "First name is required")
    private String firstName;

    @NotNull(message = "Last name is required")
    @Size(min = 2, message = "Last name is required")
    private String lastName;

    @NotNull(message = "A value is required")
    @Min(value = 5, message = "You must be older than or equal to 5")
    @Max(value= 65, message = "You must be less than 0r equal to 65")
    private Integer age;

    private Boolean owner;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;

    public Customer(){}

    public Customer(String firstName, String lastName, Integer age, Boolean owner, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.owner = owner;
        this.postalCode = postalCode;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Boolean getOwner() {
        return owner;
    }

    public Integer getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
