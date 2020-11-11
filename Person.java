package D_JavaAdvancedOOP.Lecture9_ExceptionsAndErrorHandling.ExProblem_5;
public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public Person(String firstName, String lastName, int age) throws PersonCreationException {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    private boolean myStringIsNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    public String getFirstName() {
        return firstName;
    }

    private void validateString(String name) throws PersonCreationException {
        if (myStringIsNullOrEmpty(name)) {
            throw new PersonCreationException("The name name cannot be null or empty");
        }
    }

    public void setFirstName(String firstName) throws PersonCreationException {
        validateString(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws PersonCreationException {
        validateString(lastName);
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonCreationException {
        if (age < 0 || age > 120) {
            throw new PersonCreationException("Age should be in the range [0 ... 120]");
        }
        this.age = age;
    }

}
