package options;

import person.Tenant;

import java.util.*;

public class TenantOptions {
    public static List<Tenant> tenants = new ArrayList<Tenant>();

    public static void options() {
        Scanner enter = new Scanner(System.in);
        int answer;
        boolean condition = true;
        while (condition) {
            do {
                System.out.println("Tenant options:");
                System.out.println("1)Add tenant");
                System.out.println("2)Show tenants");
                System.out.println("0)Back");
                answer = enter.nextInt();

                switch (answer) {
                    case 1:
                        TenantOptions.tenants.add(TenantOptions.createTenant());
                        break;
                    case 2:
                        TenantOptions.showTenants();
                        break;
                    case 0:
                        condition = false;
                        break;
                }
            } while (answer < 0 || answer > 2);
        }
    }

    /**
     * @return Tenant
     */
    public static Tenant createTenant() {
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

        return new Tenant(firstName, lastName, age, profession);
    }

    public static void showTenants() {
        for (Tenant tenant : TenantOptions.tenants) {
            System.out.println(tenant.toString());
        }
    }
}
