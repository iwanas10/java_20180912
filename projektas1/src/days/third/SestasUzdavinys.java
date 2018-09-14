package days.third;

import java.util.Scanner;

public class SestasUzdavinys {
    public static void main(String[] args) {
        calculator calculator = new calculator();

        System.out.println("Iveskite skaicius ir zenkla tarp ju pvz: '10+10'");
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] items = line.split(" ");

        if(items.length == 3) {
int numb = Integer.parseInt(items[0]);
int numb2 = Integer.parseInt(items[2]);
String action = items[1];

switch (action){
    case "+":
        int sum = calculator.sum(numb,numb2);
        System.out.println("Suma" + sum);
    break;
    case "-":
        int min = calculator.min(numb,numb2);
        System.out.println("Skirtumas" + min);
        break;
    case "/":
        int dem = calculator.dem(numb,numb2);
        System.out.println("Dalyba" + dem);
        break;
    case "*":
        int san = calculator.san(numb, numb2);
        default:
            break;
}
        }else{
            System.out.println("Blogai ivesta");
        }

    }
}
