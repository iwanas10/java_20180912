package days;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        do {
            System.out.println("Iveskite zodzi");
            word = scanner.nextLine();
            int countLetters = countLetters(word);
            if(word.length()%2 ==0){
         System.out.println("Ivestas zodis" + word + "jo ilgis yra" + word.length()+ "Rasta a raidziu" + countLetters);
            }else{
                System.out.println();
            }
            System.out.println(word);
        } while (!word.toLowerCase().equals("pabaiga"));
    }

    private static int countLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                count++;
            }
        }
        return count;

    }
}
