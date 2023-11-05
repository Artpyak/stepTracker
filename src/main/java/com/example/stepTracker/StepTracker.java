package com.example.stepTracker;


import java.io.*;
import java.util.HashMap;


public class StepTracker implements Serializable {
    private static final long serialVersionUID = 1L;
    HashMap<Integer, MonthDate> monthDataHashMap = new HashMap<>();

    public StepTracker() { //Конструктор заполняющий hashMap объектами MonthDate и проверяющий наличие файла с hashmap
        if (fileExists()) {
            monthDataHashMap = HashMapDeserializable.deserializable();
        } else {

            for (int i = 1; i <= 12; i++) {
                monthDataHashMap.put(i, new MonthDate());
                String month = String.valueOf(Months.getTemplateByCode(i));

                String firstLetter = month.substring(0, 1); // Получаем первую букву
                String remainingLetters = month.substring(1).toLowerCase(); // Преобразуем остальные буквы в строчные
                String resultMonth = firstLetter + remainingLetters; // Объединяем первую букву с остальными

                monthDataHashMap.get(i).setMonth(resultMonth);
                int[][] arr = new int[0][];
                for (int k = 0, j = 1; k < 30; k++, j++) {
                    arr = monthDataHashMap.get(i).getMonthDataArray();
                    arr[k][0] = j;
                }
                monthDataHashMap.get(i).setMonthDataArray(arr);
            }
            HashMapSerializable.Serializable(monthDataHashMap);
        }


    }

    private boolean fileExists() {
        File file = new File("arrayDataMap.bin");
        return file.exists();
    }

    public class MonthDate implements Serializable { //Класс для хранения переменных: месяца, даты, шагов и массива

        private static final long serialVersionUID = 1L;
        private String month;
        private int[][] monthDataArray = new int[30][2];


        public void arrayFilling(int data, int steps) { //Заполняет массив датой и количеством шагов

            try {
                if (data == monthDataArray[data - 1][0]) {
                    monthDataArray[data - 1][1] = steps;
                }
            } catch (Exception e) {
                throw new RuntimeException(e + "data не совпадает с днём месяца в массиве");
            }
        }


        public String getMonth() {
            return month;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public int[][] getMonthDataArray() {
            return monthDataArray;
        }

        public void setMonthDataArray(int[][] monthDataArray) {
            this.monthDataArray = monthDataArray;
        }
    }

}

