package days.third;

import java.util.Scanner;

public class SeptintasUzdavinys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite, kiek norite skaiciu");
        int length= sc.nextInt();
        int[] masyvas = new int [length];

        for (int i=0; i<length; i++){
            System.out.println("Iveskite, "+i+" masyvo skaiciu");
            masyvas[i]= sc.nextInt();

        }
        int suma = 0;
        System.out.println("Teigiamu skaiciu suma lygi" + suma++);


        }

    }

