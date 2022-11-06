package basicSyntax.moreExercises;

import java.util.Scanner;

public class ME05_Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digitNumber = Integer.parseInt(scanner.nextLine());
        String letter = "";

        for (int i = 1; i <= digitNumber; i++) {
            String digit = scanner.nextLine();
            switch (digit) {
                case "0":
                    letter = " ";
                    System.out.print(letter);
                    break;
                case "2":
                    letter = "a";
                    System.out.print(letter);
                    break;
                case "22":
                    letter = "b";
                    System.out.print(letter);
                    break;
                case "222":
                    letter = "c";
                    System.out.print(letter);
                    break;
                case "3":
                    letter = "d";
                    System.out.print(letter);
                    break;
                case "33":
                    letter = "e";
                    System.out.print(letter);
                    break;
                case "333":
                    letter = "f";
                    System.out.print(letter);
                    break;
                case "4":
                    letter = "g";
                    System.out.print(letter);
                    break;
                case "44":
                    letter = "h";
                    System.out.print(letter);
                    break;
                case "444":
                    letter = "i";
                    System.out.print(letter);
                    break;
                case "5":
                    letter = "j";
                    System.out.print(letter);
                    break;
                case "55":
                    letter = "k";
                    System.out.print(letter);
                    break;
                case "555":
                    letter = "l";
                    System.out.print(letter);
                    break;
                case "6":
                    letter = "m";
                    System.out.print(letter);
                    break;
                case "66":
                    letter = "n";
                    System.out.print(letter);
                    break;
                case "666":
                    letter = "o";
                    System.out.print(letter);
                    break;
                case "7":
                    letter = "p";
                    System.out.print(letter);
                    break;
                case "77":
                    letter = "q";
                    System.out.print(letter);
                    break;
                case "777":
                    letter = "r";
                    System.out.print(letter);
                    break;
                case "7777":
                    letter = "s";
                    break;
                case "8":
                    letter = "t";
                    System.out.print(letter);
                    break;
                case "88":
                    letter = "u";
                    System.out.print(letter);
                    break;
                case "888":
                    letter = "v";
                    System.out.print(letter);
                    break;
                case "9":
                    letter = "w";
                    System.out.print(letter);
                    break;
                case "99":
                    letter = "x";
                    System.out.print(letter);
                    break;
                case "999":
                    letter = "y";
                    System.out.print(letter);
                    break;
                case "9999":
                    letter = "z";
                    break;
                default:
                    break;
            }
        }
    }
}
