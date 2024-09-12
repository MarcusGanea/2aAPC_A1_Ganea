public class t_person {
    // Private attributes for name and age
    private String name;
    private String firstName;
    private int age;

    // Constructor with parameters for last name and first name
    public t_person(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
        this.age = 26; // Default age
    }


    // Setter method to set the last name and first name
    public void setName(String ln, String fn) {
        this.name = ln;
        this.firstName = fn;
    }

    // Setter method to set the age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to return the full name (first name + last name)
    public String fullName() {
        return this.firstName + " " + this.name;
    }

    // Getter method for age
    public int getAge() {
        return this.age;
    }
}