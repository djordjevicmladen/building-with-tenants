package person;

import helpers.ShowInterface;

public class Tenant extends Person implements ShowInterface {
    private static int numberTenant = 0;
    private int idTenant;
    protected String profession;

    /**
     * @param firstName
     * @param lastName
     * @param age
     * @param profession
     */
    public Tenant(String firstName, String lastName, int age, String profession) {
        super(firstName, lastName, age);
        this.profession = profession;
        this.idTenant=Tenant.numberTenant;
        Tenant.numberTenant++;
    }

    /**
     * @return int
     */
    public int getIdTenant() {
        return idTenant;
    }

    /**
     * @return String
     */
    public String getProfession() {
        return this.profession;
    }

    /**
     * @param profession
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public String showData() {
        return "Tenant{" +
                "idTenant=" + this.idTenant +
                "profession='" + this.profession + '\'' +
                ", firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", age=" + this.age +
                '}';
    }

    @Override
    public String toString() {
        return this.showData();
    }
}
