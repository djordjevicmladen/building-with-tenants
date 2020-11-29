package building;

import helpers.ShowInterface;
import person.Owner;
import person.Tenant;

import java.util.List;

public class Flat implements ShowInterface {
    private static int numberFlats = 0;
    private int idFlat;
    private int squareFootage;
    List<Tenant> tenants;
    Owner owner;

    /**
     * @param squareFootage
     * @param tenants
     * @param owner
     */
    public Flat(int squareFootage, List<Tenant> tenants, Owner owner) {
        this.squareFootage = squareFootage;
        this.tenants = tenants;
        this.owner = owner;
        this.idFlat = Flat.numberFlats;
        Flat.numberFlats++;
    }

    /**
     * @return int
     */
    public int getIdFlat() {
        return this.idFlat;
    }

    /**
     * @return int
     */
    public int getSquareFootage() {
        return this.squareFootage;
    }

    /**
     * @param squareFootage
     */
    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    /**
     * @return List<Tenant>
     */
    public List<Tenant> getTenants() {
        return this.tenants;
    }

    /**
     * @param tenants
     */
    public void setTenants(List<Tenant> tenants) {
        this.tenants = tenants;
    }

    /**
     * @param tenant
     */
    public void setTenant(Tenant tenant) {
        this.tenants.add(tenant);
    }

    /**
     * @return Owner
     */
    public Owner getOwner() {
        return this.owner;
    }

    /**
     * @param owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public void showTenants() {
        for (Tenant tenant : this.tenants) {
            System.out.println(tenant.toString());
        }
    }

    public void showOwner(){
        System.out.println(this.owner.toString());
    }

    @Override
    public String showData() {
        return "Flat{" +
                "idFlat=" + idFlat +
                ", squareFootage=" + squareFootage +
                ", tenants=" + tenants +
                ", owner=" + owner +
                '}';
    }

    @Override
    public String toString() {
        return this.showData();
    }
}
