//Alex Borges da SIlva Junior

import java.util.Random;
import java.util.Scanner;

public class Ex26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String alphabet = "", sequence = "", notContained = "", vowels = "aeiou" , longestSeqVowels = "",
			longestSeqAlfa = "", longestSeqRepeat = "", auxR = "", auxV = "", auxA = "";
        boolean oneMoreR = false, oneMoreV = false, oneMoreA = false;

        for (char i = 'a'; i <= 'z'; i++) {
            alphabet += i;
        }

        for (int i = 0; i < 100; i++) {
            sequence += alphabet.charAt(random.nextInt(alphabet.length()));
        }

        for (int i = 0; i < sequence.length(); i++) {
            if (!alphabet.contains(String.valueOf(sequence.charAt(i)))) {
                if (!notContained.contains(String.valueOf(sequence.charAt(i)))) {
                    notContained += sequence.charAt(i);
                }
            }

            if (i > 0 && sequence.charAt(i) == sequence.charAt(i - 1)) {
                auxR += sequence.charAt(i);
            } else {
                if (auxR.length() > longestSeqRepeat.length()) {
                    longestSeqRepeat = auxR;
                    oneMoreR = false;
                } else if (auxR.length() == longestSeqRepeat.length()) {
                    oneMoreR = true;
                } else {
                    auxR = String.valueOf(sequence.charAt(i));
                }
            }

            if (vowels.contains(String.valueOf(sequence.charAt(i)))) {
                auxV += sequence.charAt(i);
            } else {
                if (auxV.length() > longestSeqVowels.length()) {
                    longestSeqVowels = auxV;
                    oneMoreV = false;
                } else if (auxV.length() == longestSeqVowels.length()) {
                    oneMoreV = true;
                } else {
                    auxV = String.valueOf(sequence.charAt(i));
                }
            }

            if (i > 0 && sequence.charAt(i) - sequence.charAt(i - 1) == 1) {
                auxA += sequence.charAt(i);
            } else {
                if (auxA.length() > longestSeqAlfa.length()) {
                    longestSeqAlfa = auxA;
                    oneMoreA = false;
                } else if (auxA.length() == longestSeqAlfa.length()) {
                    oneMoreA = true;
                } else {
                    auxA = String.valueOf(sequence.charAt(i));
                }
            }
        }

        System.out.println("Random sequence: " + sequence);
        if (!notContained.isEmpty()) {
            System.out.println("It doesn't exist in the sequence: " + notContained);
        }
        if (!oneMoreR) {
            System.out.printf("The longest sequence of repeated characters contains %d characters and is %s%n",
                    longestSeqRepeat.length(), longestSeqRepeat);
        } else {
            System.out.println("There is more than one sequence of repeated characters of length " +
                    longestSeqRepeat.length());
        }
        if (!oneMoreV) {
            System.out.printf("The longest sequence of vowels contains %d characters and is %s%n",
                    longestSeqVowels.length(), longestSeqVowels);
        } else {
            System.out.println("There is more than one sequence of vowels of length " + longestSeqVowels.length());
        }
        if (!oneMoreA) {
            System.out.printf("The longest alphabetic sequence contains %d characters and is %s%n",
                    longestSeqAlfa.length(), longestSeqAlfa);
        } else {
            System.out.println("There is more than one alphabetic sequence of length " + longestSeqAlfa.length());
        }

        sc.close();
    }
}
