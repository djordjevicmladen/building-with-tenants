package helpers;

import building.*;
import options.*;
import person.*;

import java.io.*;

public class DataService {
    public static void saveData() {
        DataService.saveBuildings();
        DataService.saveFlats();
        DataService.saveTenants();
        DataService.saveOwners();
    }

    public static void saveBuildings() {
        try {
            PrintWriter printWriterBuilding = new PrintWriter("buildings.txt");

            for (Building building : BuildingOptions.buildings) {
                printWriterBuilding.println("ID: " + building.getIdBuilding());
                printWriterBuilding.println("Address: " + building.getAddress());
                printWriterBuilding.println("Flats:");
                for (Flat flat : building.getFlats()) {
                    printWriterBuilding.println("ID: " + flat.getIdFlat());
                    printWriterBuilding.println("Square Footage: " + flat.getSquareFootage());
                    printWriterBuilding.println("Owner:");
                    printWriterBuilding.println("ID: " + flat.getOwner().getIdOwner());
                    printWriterBuilding.println("First Name: " + flat.getOwner().getFirstName());
                    printWriterBuilding.println("Last Name: " + flat.getOwner().getLastName());
                    printWriterBuilding.println("Age: " + flat.getOwner().getAge());
                    printWriterBuilding.println("Profession: " + flat.getOwner().getProfession());
                    printWriterBuilding.println("Date Purchase Flat: " + flat.getOwner().getDatePurchaseFlat());
                    printWriterBuilding.println("Tenants:");
                    for (Tenant tenant : flat.getTenants()) {
                        printWriterBuilding.println("ID: " + tenant.getIdTenant());
                        printWriterBuilding.println("First Name: " + tenant.getFirstName());
                        printWriterBuilding.println("Last Name: " + tenant.getLastName());
                        printWriterBuilding.println("Age: " + tenant.getAge());
                        printWriterBuilding.println("Profession: " + tenant.getProfession());
                    }
                }
            }

            printWriterBuilding.flush();
            printWriterBuilding.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: buildings.txt!");
        }
    }

    public static void saveFlats() {
        try {
            PrintWriter printWriterFlats = new PrintWriter("flats.txt");

            for (Flat flat : FlatOptions.flats) {
                printWriterFlats.println("ID: " + flat.getIdFlat());
                printWriterFlats.println("Square Footage: " + flat.getSquareFootage());
                printWriterFlats.println("Owner:");
                printWriterFlats.println("ID: " + flat.getOwner().getIdOwner());
                printWriterFlats.println("First Name: " + flat.getOwner().getFirstName());
                printWriterFlats.println("Last Name: " + flat.getOwner().getLastName());
                printWriterFlats.println("Age: " + flat.getOwner().getAge());
                printWriterFlats.println("Profession: " + flat.getOwner().getProfession());
                printWriterFlats.println("Date Purchase Flat: " + flat.getOwner().getDatePurchaseFlat());
                printWriterFlats.println("Tenants:");
                for (Tenant tenant : flat.getTenants()) {
                    printWriterFlats.println("ID: " + tenant.getIdTenant());
                    printWriterFlats.println("First Name: " + tenant.getFirstName());
                    printWriterFlats.println("Last Name: " + tenant.getLastName());
                    printWriterFlats.println("Age: " + tenant.getAge());
                    printWriterFlats.println("Profession: " + tenant.getProfession());
                }

            }

            printWriterFlats.flush();
            printWriterFlats.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: flats.txt!");
        }
    }

    public static void saveTenants() {
        try {
            PrintWriter printWriterTenants = new PrintWriter("tenants.txt");

            for (Tenant tenant : TenantOptions.tenants) {
                printWriterTenants.println("ID: " + tenant.getIdTenant());
                printWriterTenants.println("First Name: " + tenant.getFirstName());
                printWriterTenants.println("Last Name: " + tenant.getLastName());
                printWriterTenants.println("Age: " + tenant.getAge());
                printWriterTenants.println("Profession: " + tenant.getProfession());
            }

            printWriterTenants.flush();
            printWriterTenants.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: tenants.txt!");
        }
    }

    public static void saveOwners() {
        try {
            PrintWriter printWriterOwners = new PrintWriter("owners.txt");

            for (Owner owner : OwnerOptions.owners) {
                printWriterOwners.println("ID: " + owner.getIdOwner());
                printWriterOwners.println("First Name: " + owner.getFirstName());
                printWriterOwners.println("Last Name: " + owner.getLastName());
                printWriterOwners.println("Age: " + owner.getAge());
                printWriterOwners.println("Profession: " + owner.getProfession());
                printWriterOwners.println("Date Purchase Flat: " + owner.getDatePurchaseFlat());
            }

            printWriterOwners.flush();
            printWriterOwners.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Error: owners.txt!");
        }
    }
}
