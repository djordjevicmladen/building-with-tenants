package options;

import building.Flat;
import person.Owner;
import person.Tenant;

import java.util.*;

public class FlatOptions {
    public static List<Flat> flats = new ArrayList<Flat>();

    public static void options() {
        Scanner enter = new Scanner(System.in);
        int answer;
        boolean condition = true;
        while (condition) {
            do {
                System.out.println("Flat options:");
                System.out.println("1)Add flat");
                System.out.println("2)Add tenant in flat");
                System.out.println("3)Add owner in flat");
                System.out.println("4)Show tenants");
                System.out.println("5)Show owners");
                System.out.println("0)Back");
                answer = enter.nextInt();

                switch (answer) {
                    case 1:
                        FlatOptions.flats.add(FlatOptions.createFlat());
                        break;
                    case 2:
                        FlatOptions.addTenants();
                        break;
                    case 3:
                        FlatOptions.addOwner();
                    case 4:
                        FlatOptions.showFlatsWithTenants();
                        break;
                    case 5:
                        FlatOptions.showFlatsWithOwners();
                        break;
                    case 0:
                        condition = false;
                        break;
                }
            } while (answer < 0 || answer > 4);
        }
    }

    /**
     * @return Flat
     */
    public static Flat createFlat() {
        Scanner enter = new Scanner(System.in);

        System.out.println("Enter the square footage of the flat (m2):");
        int squareFootage = enter.nextInt();

        return new Flat(squareFootage, new ArrayList<Tenant>(), new Owner());
    }

    public static void addTenants() {
        if (flats.size() > 0 && TenantOptions.tenants.size() > 0) {
            Scanner enter = new Scanner(System.in);

            System.out.println("Select one of the following flats (enter flat id):");
            for (Flat flat : FlatOptions.flats) {
                System.out.println(flat.toString());
            }
            int flatId = enter.nextInt();


            System.out.println("Select one of the following tenant (enter tenant id):");
            for (Tenant tenant : TenantOptions.tenants) {
                System.out.println(tenant.toString());
            }
            int tenantId = enter.nextInt();

            for (Flat flat : FlatOptions.flats) {
                if (flat.getIdFlat() == flatId) {
                    for (Tenant tenant : TenantOptions.tenants) {
                        if (tenant.getIdTenant() == tenantId) {
                            flat.setTenant(tenant);
                        }
                    }
                }
            }
        } else {
            System.out.println("There are no flats or tenants!");
        }
    }

    public static void addOwner() {
        if (flats.size() > 0 && OwnerOptions.owners.size() > 0) {
            Scanner enter = new Scanner(System.in);

            System.out.println("Select one of the following flats (enter flat id):");
            for (Flat flat : FlatOptions.flats) {
                System.out.println(flat.toString());
            }
            int flatId = enter.nextInt();


            System.out.println("Select one of the following owners (enter owner id):");
            for (Owner owner : OwnerOptions.owners) {
                System.out.println(owner.toString());
            }
            int ownerId = enter.nextInt();

            for (Flat flat : FlatOptions.flats) {
                if (flat.getIdFlat() == flatId) {
                    for (Owner owner : OwnerOptions.owners) {
                        if (owner.getIdOwner() == ownerId) {
                            flat.setOwner(owner);
                        }
                    }
                }
            }
        } else {
            System.out.println("There are no flats or owners!");
        }
    }

    public static void showFlatsWithTenants() {
        for (Flat flat : FlatOptions.flats) {
            System.out.println("Flat " + flat.getIdFlat());
            flat.showTenants();
        }
    }

    public static void showFlatsWithOwners() {
        for (Flat flat : FlatOptions.flats) {
            System.out.println("Flat " + flat.getIdFlat());
            flat.showOwner();
        }
    }
}
