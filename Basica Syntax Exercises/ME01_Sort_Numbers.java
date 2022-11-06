package basicSyntax.moreExercises;

import java.util.Scanner;

public class ME01_Sort_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxValue = 0;
        int mediumValue = 0;
        int minimumValue = 0;

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a >= b && a >= c) {
            maxValue = a;
        } else if (b >= a && b >= c) {
            maxValue = b;
        } else {
            maxValue = c;
        }
        if (a <= c && a <= b) {
            minimumValue = a;
        } else if (b <= a && b <= c) {
            minimumValue = b;
        } else {
            minimumValue = c;
        }
        if ((a <= b && a >= c) || (a >= b && a <= c)) {
            mediumValue = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            mediumValue = b;
        } else {
            mediumValue = c;
        }
        System.out.printf("%d%n%d%n%d%n", maxValue, mediumValue, minimumValue);
    }
}