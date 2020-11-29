package person;

import helpers.ShowInterface;

public class Owner extends Tenant implements ShowInterface {
    private static int numberOwners = 0;
    private int idOwner;
    protected String datePurchaseFlat;

    public Owner(){
        super("OwnerFirstName", "OwnerLastName", 35,"OwnerProfession");
        this.datePurchaseFlat = "15/05/2014";
        this.idOwner = Owner.numberOwners;
        Owner.numberOwners++;
    }

    /**
     * @param firstName
     * @param lastName
     * @param age
     * @param profession
     * @param datePurchaseFlat
     */
    public Owner(String firstName, String lastName, int age, String profession,String datePurchaseFlat) {
        super(firstName, lastName, age,profession);
        this.datePurchaseFlat = datePurchaseFlat;
        this.idOwner = Owner.numberOwners;
        Owner.numberOwners++;
    }

    /**
     * @return int
     */
    public int getIdOwner() {
        return this.idOwner;
    }

    /**
     * @return String
     */
    public String getDatePurchaseFlat() {
        return this.datePurchaseFlat;
    }

    /**
     * @param datePurchaseFlat
     */
    public void setDatePurchaseFlat(String datePurchaseFlat) {
        this.datePurchaseFlat = datePurchaseFlat;
    }

    @Override
    public String showData() {
        return "Owner{" +
                "idOwner=" + idOwner +
                ", datePurchaseFlat='" + datePurchaseFlat + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String toString() {
        return this.showData();
    }
}
