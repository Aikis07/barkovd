package ru.job4j.array;

public class Turn {
    public int[] back(int[] array){
        int halfArr = array.length / 2;
        for (int i = 0; i <= halfArr - 1; i++){
            int v = 0;
            v = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = v;
        }
        return array;
    }
}
