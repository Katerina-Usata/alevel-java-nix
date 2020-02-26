package com.alevel.java.nix.module1;

public class NumberOfUniqueCharacters {
    public static void main(String[] args) {
        int[] mas = {1, 5, 8, 1, 1, 1, 1, 1};
        System.out.println(uniqueCount(mas));
    }


    public static int uniqueCount(int[] mas) {

        int[] copyMas = new int[mas.length];
        int result = 0;
        int countUnic = 0;
        int count = 0;
        int lenght = mas.length;

        for (int i = 0; i < lenght; i++) {
            if (copyMas[i] == 0) {
                for (int j = 0; j < lenght; j++) {
                    if (mas[i] == mas[j]) {
                        copyMas[j] = 1;
                        count++;
                    }
                }
            }
            if (countUnic < count) {
                countUnic = count;
                result++;
            }
        }
        return result;
    }
}
