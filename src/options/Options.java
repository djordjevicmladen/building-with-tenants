package options;

import helpers.DataService;

import java.util.Scanner;

public class Options {
    public static void menu() {
        Scanner enter = new Scanner(System.in);
        int answer;

        while (true) {
            do {
                System.out.println("Welcome to the BUILDING WITH TENANTS app");
                System.out.println("Select an option from the menu to go to the next step:");
                System.out.println("1)Building");
                System.out.println("2)Flat");
                System.out.println("3)Tenant");
                System.out.println("4)Owner");
                System.out.println("0)Exit");
                answer = enter.nextInt();

                switch (answer) {
                    case 1:
                        BuildingOptions.options();
                        break;
                    case 2:
                        FlatOptions.options();
                        break;
                    case 3:
                        TenantOptions.options();
                        break;
                    case 4:
                        OwnerOptions.options();
                        break;
                    case 0:
                        System.out.println("Goodbye!");
                        DataService.saveData();
                        System.exit(0);
                        break;
                }
            } while (answer < 0 || answer > 4);
        }
    }
}
