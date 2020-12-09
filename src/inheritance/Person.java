package inheritance;

public class Person {
    private int Age;
    private String firstName;
    private String lastName;
    private String mobile;
    private String hairColour;
    private double height;
    private String gender;

    public Person(int Age, String firstName, String lastName, String mobile, 
            String hairColour, double height, String gender) {
        this.Age = Age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.hairColour = hairColour;
        this.height = height;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "\nAge = " + Age + ",\nfirstName = " + 
                firstName + ",\nlastName = " + lastName + ",\nmobile = " + 
                mobile + ",\nhairColour = " + hairColour + ",\nheight = " + 
                height + ",\ngender = " + gender + '}';
    }    
}
