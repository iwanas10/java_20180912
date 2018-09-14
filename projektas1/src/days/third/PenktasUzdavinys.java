package days.third;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PenktasUzdavinys {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double kelias = getCorrectNumber(sc, "Iveskite nuvaziuota kelia");
        double kuras = getCorrectNumber(sc, "Iveskite sunauduota kura");
        vidurkis(kelias, kuras);
        System.out.println("Vidurkis lygus" +  vidurkis(kelias, kuras));
    }

    private static double vidurkis(double kelias, double kuras){

   double vidurkis =(kuras*100)/kelias;
    return vidurkis;
}
    private static double getCorrectNumber(Scanner sc, String text) {
        System.out.println(text);
        double val = 0;
        while (true)
            try {
                val = sc.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Blogai ivestas skaicius");
                sc.nextLine();
            }

    return val;
    }
}



