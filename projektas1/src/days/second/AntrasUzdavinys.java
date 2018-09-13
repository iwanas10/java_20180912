package days.second;

import java.util.Scanner;

public class AntrasUzdavinys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite polindroma, kuri tikrinsite");
        String word = scanner.nextLine();

        if (isWordPolindrom(word.replaceAll(" ", ""))) {
            System.out.println("Polindromas");
        }else{
            System.out.println("Nepolindromas");
        }

    }

    private static boolean isWordPolindrom(String text) {
        boolean val = true;

        for (int i = 0; i < text.length(); i++) {
            char first = text.charAt(i);
            char second = text.charAt(text.length() - 1 - i);
            if (first != second) {
                val = false;
                break;
            }


        }
        return val;
    }
}
