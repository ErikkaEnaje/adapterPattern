package AdapterPattern;
import java.util.Scanner;

public class MainElectronicApp {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Smartphonecharger charger = new Smartphonecharger();
        Laptop laptop = new Laptop();
        Refrigerator ref = new Refrigerator();


        while (true) {
            System.out.println("\nELECTRONIC DEVICES IN SMART MENU");
            System.out.println("\n        The Menu:");
            System.out.println("01. Smartphone of Charger");
            System.out.println("02. Laptop of Charge");
            System.out.println("03. Refrigerator");
            System.out.println("04. EXIT");


            // For choosing their selected plug-in electronics gadget.
            System.out.print("Press Select an Option: ");
            int choice = userchoice(scanner);
            System.out.println();

            switch (choice) {
                case 1: // for the smartphone charger.
                    PowerOutlet SmartphoneChargerOutlet = new SmartphoneAdapter(charger);
                    SmartphoneChargerOutlet.plugIn();
                    break;

                case 2: // for the laptop.
                    PowerOutlet LaptopOutlet = new LaptopAdapter(laptop);
                    LaptopOutlet.plugIn();
                    break;

                case 3: // for the refrigerator.
                    PowerOutlet RefrigeratorOutlet = new RefrigeratorAdapter(ref);
                    RefrigeratorOutlet.plugIn();
                    break;

                case 4: // EXIT the Program
                    System.out.println("Thank You:)" + "\n\t\tHave a great day!!");
                    System.exit(0);
                    break;

                default: // for the user have wrong input invalid choice.
                    System.out.println("Invalid Selection!! Please Pick a Suitable Option (From 1 - 4): ");
                    break;
            }
        }
    }
       private static int userchoice(Scanner scanner) {
        while (true) {
            try {
                int choices = Integer.parseInt(scanner.nextLine());
                if (choices >= 1 && choices <= 4) {
                    return choices;
                }
                System.out.print("Invalid Selection!! Please Pick a Suitable Option (From 1 - 4): ");

            } catch (NumberFormatException t) {

                System.out.print("Invalid Selection!! Please Pick a Suitable Option (From 1 - 4): ");
            }
        }
    }

}