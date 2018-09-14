package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KetvirtasUzdavinys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double ugis = getCorrectNumb(scanner, "Iveskite ugi");
        double svoris = getCorrectNumb(scanner, "Iveskite svori");
        kmi(ugis, svoris);
        System.out.println("Kmi yra" + kmi(ugis, svoris));
    }
    private static double kmi(double ugis, double svoris){
        double kmi = svoris / Math.pow(ugis, 2);
         return kmi;



    }

    private static double getCorrectNumb(Scanner scanner, String text) {
        System.out.println(text);
        double val = 0;
        while (true) {
            try {
                val = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius, pakartokite");
                scanner.nextLine();
            }
        }
            return val;

        }
    }
