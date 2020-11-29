package building;

import helpers.ShowInterface;

import java.util.List;

public class Building implements ShowInterface {
    private static int numberBuildings = 0;
    private int idBuilding;
    private String address;
    List<Flat> flats;

    /**
     * @param address
     * @param flats
     */
    public Building(String address, List<Flat> flats) {
        this.address = address;
        this.flats = flats;
        this.idBuilding = Building.numberBuildings;
        Building.numberBuildings++;
    }

    /**
     * @return int
     */
    public int getIdBuilding() {
        return this.idBuilding;
    }

    /**
     * @return String
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return List<Flat>
     */
    public List<Flat> getFlats() {
        return this.flats;
    }

    /**
     * @param flats
     */
    public void setFlats(List<Flat> flats) {
        this.flats = flats;
    }

    /**
     * @param flat
     */
    public void setFlat(Flat flat) {
        this.flats.add(flat);
    }

    public void showFlatsWithTnants() {
        for (Flat flat : this.flats) {
            System.out.println(flat.toString());
        }
    }

    @Override
    public String showData() {
        return "Building{" +
                "idBuilding=" + idBuilding +
                ", address='" + address + '\'' +
                ", flats=" + flats +
                '}';
    }

    @Override
    public String toString() {
        return this.showData();
    }
}
