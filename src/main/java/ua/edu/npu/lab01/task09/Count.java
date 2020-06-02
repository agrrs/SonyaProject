package ua.edu.npu.lab01.task09;

public class Count {
    int vowels = 0;
    int consonants = 0;
    Character character;
    public void count(String s) {
        for(int i=0; i<s.length(); i++) {
            character = s.charAt(i);
            if (character.isLetter(character)) {
                if ("AEIOUaeiou".indexOf(character) != -1) {
                    vowels++;
                }
                else {
                    consonants++;
                }
            }
        }
    }

    public void output () {
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
