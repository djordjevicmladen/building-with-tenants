package options;

import person.Owner;

import java.util.*;

public class OwnerOptions {
    public static List<Owner> owners = new ArrayList<Owner>();

    public static void options() {
        Scanner enter = new Scanner(System.in);
        int answer;
        boolean condition = true;
        while (condition) {
            do {
                System.out.println("Owner options:");
                System.out.println("1)Add owner");
                System.out.println("2)Show owners");
                System.out.println("0)Back");
                answer = enter.nextInt();

                switch (answer) {
                    case 1:
                        OwnerOptions.owners.add(OwnerOptions.crateOwner());
                        break;
                    case 2:
                        OwnerOptions.showOwners();
                        break;
                    case 0:
                        condition = false;
                        break;
                }
            } while (answer < 0 || answer > 2);
        }
    }

    public static Owner crateOwner() {
        Scanner enter = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = enter.nextLine();

        System.out.println("Enter last name:");
        String lastName = enter.nextLine();

        System.out.println("Enter age:");
        int age = enter.nextInt();

        enter.nextLine();

        System.out.println("Enter profession:");
        String profession = enter.nextLine();

        System.out.println("Enter date purchase flat (for example => 01/02/2003):");
        String datePurchaseFlat = enter.nextLine();

        return new Owner(firstName, lastName, age, profession, datePurchaseFlat);
    }

    public static void showOwners() {
        for (Owner owner : OwnerOptions.owners) {
            System.out.println(owner.toString());
        }
    }
}
    