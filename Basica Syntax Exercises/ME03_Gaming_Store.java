package basicSyntax.moreExercises;

import java.util.Scanner;

public class ME03_Gaming_Store {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();
        double totalSpent = 0;
        boolean flag = false;

        while (!gameName.equals("Game Time")) {
            double price = 0;
            switch (gameName) {
                case "OutFall 4":
                    price = 39.99;
                    if (balance < price) {
                        System.out.println("Too Expensive");
                        gameName = scanner.nextLine();
                        continue;
                    }
                    System.out.printf("Bought %s%n", gameName);
                    break;
                case "CS: OG":
                    price = 15.99;
                    if (balance < price) {
                        System.out.println("Too Expensive");
                        gameName = scanner.nextLine();
                        continue;
                    }
                    System.out.printf("Bought %s%n", gameName);
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (balance < price) {
                        System.out.println("Too Expensive");
                        gameName = scanner.nextLine();
                        continue;
                    }
                    System.out.printf("Bought %s%n", gameName);
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (balance < price) {
                        System.out.println("Too Expensive");
                        gameName = scanner.nextLine();
                        continue;
                    }
                    System.out.printf("Bought %s%n", gameName);
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (balance < price) {
                        System.out.println("Too Expensive");
                        gameName = scanner.nextLine();
                        continue;
                    }
                    System.out.printf("Bought %s%n", gameName);
                    break;
                case "RoverWatch Origins Edition":
                    price = 39.99;
                    if (balance < price) {
                        System.out.println("Too Expensive");
                        gameName = scanner.nextLine();
                        continue;
                    }
                    System.out.printf("Bought %s%n", gameName);
                    break;
                default:
                    System.out.println("Not Found");
            }
            totalSpent = totalSpent + price;
            balance = balance - price;
            if (balance <= 0) {
                flag = true;
                break;
            }
            gameName = scanner.nextLine();
        }
        if (flag) {
            System.out.println("Out of mo-ney!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, balance);
        }
    }
}
