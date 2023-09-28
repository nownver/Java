package code5;

import java.util.Comparator;
import java.util.Arrays;


public class SillyLuckyNumber {
    private String breed;
    private int luckyNumber;
    private int threeDigit; // 0 to 999

    public SillyLuckyNumber(String s) {
        breed = s;
        for (int i = 0; i < breed.length(); i++)
            luckyNumber += breed.charAt(i);
        threeDigit = luckyNumber % 1000;
    }

    // getters
    @Override
    public String toString() {
        return "<<" + breed + " "
                + luckyNumber + " " + threeDigit + ">>";
    }

    public void setBreed(String b) {
        breed = b;
    }

    public int getLuckyNumber() {
        return luckyNumber;
    }

}