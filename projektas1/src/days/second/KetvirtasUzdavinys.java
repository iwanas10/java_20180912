package days.second;

import java.util.Scanner;

public class KetvirtasUzdavinys {
    public static void main(String[] args) {
        System.out.println("Iveskite savo ugi");
        Scanner scanner = new Scanner(System.in);
        double ugis = scanner.nextDouble();
        System.out.println("Iveskite savo svori");
        double svoris = scanner.nextDouble();
        kmi(ugis, svoris);
        System.out.println("Kmi yra" + kmi(ugis, svoris));
    }
    private static double kmi(double ugis, double svoris){
        double kmi = svoris / Math.pow(ugis, 2);
         return kmi;



    }
}
