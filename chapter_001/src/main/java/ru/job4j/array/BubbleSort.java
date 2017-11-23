package ru.job4j.array;

public class BubbleSort {

    public int[] sort(int[] array) {
        //Проход от конца массива до начала с уменьшением диапазона прохода.
        for (int i = array.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                //Сравнение двух соседних ячеек
                if (array[j] > array[j + 1]) {
                    //В случае true меняем содержимое ячеек местами
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
}
