package days.second;

import java.util.Scanner;

public class TreciasUzdavinys {
    public static void main(String[] args) {

        System.out.println("Pasirinkite ka norite skaiciuoti"+ "\n1-staciojo trikampio plotas" +
                "\n2-staciakampio plotas\n3-kvadrato plotas"+"\n4- apskritimo plotas" );
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        switch (option){
            case 1:
                System.out.println("Trikampio plotas yra" + triangle(scanner));
                break;

            case 2:
                System.out.println("Staciakampio plotas yra" + romb(scanner));
                break;

            case 3:
                System.out.println("Kvadrato plotas yra" + Kvadratas(scanner));
                break;

            case 4:
                System.out.println("Apskritimo plotas yra" + apskritimas(scanner));
                break;

            default:
                System.out.println("netiko nei vienas");
                break;
        }

    }

    private static double triangle(Scanner scanner){
        System.out.println("Iveskite a statini");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b statini");
        double b = scanner.nextDouble();
        return (a*b)/2;
    }
    private static double romb(Scanner scanner){
        System.out.println("Iveskite a krastine");
        double a = scanner.nextDouble();
        System.out.println("Iveskite b krastine");
        double b = scanner.nextDouble();
        return a*b;
    }

        private static double Kvadratas(Scanner scanner){
            System.out.println(" Iveskite krastines ilgi");
            double a = scanner.nextDouble();
            return a*a;
        }
        private static double apskritimas(Scanner scanner){
            System.out.println(" Iveskite spinduli");
            double a = scanner.nextDouble();
            return Math.PI*(a/2);
        }

}

