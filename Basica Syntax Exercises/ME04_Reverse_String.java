package basicSyntax.moreExercises;

import java.util.Scanner;

public class ME04_Reverse_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int length = word.length();

        for (int i = length - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }
}
