package Persons;

public abstract class Person {

    private static int countForPersonId = 0;

    private final int personId;
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.personId = countForPersonId++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID = '" + personId + '\'' +
                "firstName = '" + firstName + '\'' +
                ", lastName = '" + lastName + '\'' +
                '}';
    }
}
