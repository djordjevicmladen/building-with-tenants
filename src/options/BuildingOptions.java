package options;

import building.Building;
import building.Flat;

import java.util.*;

public class BuildingOptions {
    public static List<Building> buildings = new ArrayList<Building>();

    public static void options() {
        Scanner enter = new Scanner(System.in);
        int answer;
        boolean condition = true;
        while (condition) {
            do {
                System.out.println("Building optins:");
                System.out.println("1)Add building");
                System.out.println("2)Add flat in building");
                System.out.println("3)Show building");
                System.out.println("0)Back");
                answer = enter.nextInt();

                switch (answer) {
                    case 1:
                        BuildingOptions.buildings.add(BuildingOptions.createBuilding());
                        break;
                    case 2:
                        BuildingOptions.addFlatInBuilding();
                        break;
                    case 3:
                        BuildingOptions.showBuildingWithFlats();
                        break;
                    case 0:
                        condition = false;
                        break;
                }
            } while (answer < 0 || answer > 3);
        }
    }

    /**
     * @return Building
     */
    public static Building createBuilding() {
        Scanner enter = new Scanner(System.in);

        System.out.println("Enter building address:");
        String address = enter.nextLine();

        return new Building(address, new ArrayList<Flat>());
    }

    public static void addFlatInBuilding() {
        if (BuildingOptions.buildings.size() > 0 && FlatOptions.flats.size() > 0) {
            Scanner enter = new Scanner(System.in);

            System.out.println("Select one of the following buildings (enter building id):");
            for (Building building : BuildingOptions.buildings) {
                System.out.println(building.toString());
            }
            int buildingId = enter.nextInt();

            System.out.println("Select one of the following flats (enter flat id):");
            for (Flat flat : FlatOptions.flats) {
                System.out.println(flat.toString());
            }
            int flatId = enter.nextInt();

            for (Building building : BuildingOptions.buildings) {
                if (building.getIdBuilding() == buildingId) {
                    for (Flat flat : FlatOptions.flats) {
                        if (flat.getIdFlat() == flatId) {
                            building.setFlat(flat);
                        }
                    }
                }
            }
        } else {
            System.out.println("There are no buildings or flats!");
        }
    }

    public static void showBuildingWithFlats() {
        for (Building building : BuildingOptions.buildings) {
            System.out.println("Building " + building.getIdBuilding());
            building.showFlatsWithTnants();
        }
    }
}
