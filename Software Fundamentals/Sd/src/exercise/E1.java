package exercise;

import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        
        char[] letters = word.toCharArray();

      
        for (int a = letters.length - 1; a >= 0; a--) {
            System.out.print(letters[a]);
        }
    }
}

