package person;

public class Person {
    protected String firstName;
    protected String lastName;
    protected int age;

    /**
     * @param firstName
     * @param lastName
     * @param age
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * @return String
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return int
     */
    public int getAge() {
        return this.age;
    }

    /**
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
