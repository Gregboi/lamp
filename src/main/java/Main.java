import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Is the room dark?");
        Scanner getUserResponse = new Scanner(System.in);
        String response = getUserResponse.nextLine();
        while (!response.equalsIgnoreCase("Yes")) {
            if (response.equalsIgnoreCase("no")) {
                break;
            }
            System.out.println("Please Enter Yes or No");
            response = getUserResponse.nextLine();
        }
        Lamp lamp = new Lamp();
        if (response.equalsIgnoreCase("no")) {
            lamp.turnOn();
            System.out.println("The Lamp is on!");
            System.out.println("Would you like the lamp off?");
            response = getUserResponse.nextLine();
             if (response.equalsIgnoreCase("yes")){
                lamp.turnOff();
                System.out.println("The lamp is off");
            }
        } else {
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Would you like the Lamp on?");
                response = getUserResponse.nextLine();
                while (!response.equalsIgnoreCase("Yes")) {
                    if (response.equalsIgnoreCase("no")) {
                        System.out.println("Okay! Leaving the light off.");
                        break;
                    }
                    System.out.println("Please Enter Yes or No!  Would you like the Lamp on?");
                    response = getUserResponse.nextLine();
                }
                if (response.equalsIgnoreCase("Yes")) {
                    lamp.turnOn();
                    if (lamp.isTheLampOn()) {
                        System.out.println("The Lamp is now on \nHave a great day!");
                    }
                }
            }
        }
    }
}
